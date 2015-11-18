package assignment6;


public class PrintLetter {

	public static void main(String[] args) {
		AThread at = new AThread();
		BThread bt = new BThread();
		CThread ct = new CThread();
		DThread dt = new DThread();
		EThread et = new EThread();
		at.getNextB(bt);
		bt.getNextC(ct);
		ct.getNextD(dt);
		dt.getNextE(et);
		et.getNextA(at);
		at.start();
		bt.start();
		ct.start();
		dt.start();
		et.start();
	}

}

class AThread extends Thread {
	private BThread b;
	
	
	public void getNextB(BThread b) {
		this.b = b;
	}
	
	@Override
	public synchronized void run(){
		for (int i = 0; i < 10; i++) {
			while (true) {
				System.out.println("A");
				synchronized(b) {
					b.notify();
				} try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class BThread extends Thread {
	private CThread c;
	
	public void getNextC(CThread c) {
		this.c = c;
	}
	
	@Override
	public synchronized void run(){
		for (int i = 0; i < 10; i++){
			while (true) {
				System.out.println("B");
				synchronized(c) {
					c.notify();
				} try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class CThread extends Thread {
	private DThread d;
	
	public void getNextD(DThread d) {
		this.d = d;
	}
	
	@Override
	public synchronized void run(){
		for (int i = 0; i < 10; i++){
			while (true) {
				System.out.println("C");
				synchronized(d) {
					d.notify();
				} try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class DThread extends Thread {
	private EThread e;
	
	public void getNextE(EThread e) {
		this.e = e;
	}
	
	@Override
	public synchronized void run(){
		for (int i = 0; i < 10; i++){
			while (true) {
				System.out.println("D");
				synchronized(e) {
					e.notify();
				} try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class EThread extends Thread {
	private AThread a;
	
	public void getNextA(AThread a) {
		this.a = a;
	}
	
	@Override
	public synchronized void run(){
		for (int i = 0; i < 10; i++){
			while (true) {
				System.out.println("E");
				synchronized(a) {
					a.notify();
				} try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}