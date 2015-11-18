package assignment6;

public class PrintNumberLetter {

	public static void main(String[] args) {
		NumberThread numberthread = new NumberThread();
		LetterThread letterthread = new LetterThread();
		numberthread.getNextLetter(letterthread);
		letterthread.getNextNumber(numberthread);
		numberthread.start();
		letterthread.start();

	}

}

class NumberThread extends Thread {
	private LetterThread letterthread;
	
	public void getNextLetter(LetterThread letterthread) {
		this.letterthread = letterthread;
	}
	
	@Override
	public synchronized void run() {
		for (int i = 0; i < 51; i+=2) {
			System.out.println((i+1));
			System.out.println((i+1+1));
			synchronized(letterthread){
				letterthread.notify();
			} try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class LetterThread extends Thread {
private NumberThread numberthread;
	
	public void getNextNumber(NumberThread numberthread) {
		this.numberthread = numberthread;
	}
	
	@Override
	public synchronized void run() {
		for (char l = 'A'; l <= 'Z'; l++) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(l);
			synchronized(numberthread) {
				numberthread.notify();
			}
		}	
	}
}
	