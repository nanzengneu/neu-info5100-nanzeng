package assignment6;


public class ProducerConsumer {
	
	public static void main(String[] args) {
		Game g = new Game();
		Producer p1 = new Producer(g, 1);
		Consumer c1 = new Consumer(g, 1);
		p1.start();
		c1.start();
	}
}

class Game {
	private int contents;
	private boolean available = false;
	
	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {	
			}
		}
		available = false;
		notifyAll();
		return contents;
	}
	
	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		contents = value;
		available = true;
		notifyAll();
	}
}

class Consumer extends Thread {
	private Game game;
	private int number;
	
	public Consumer(Game g, int number){
		game = g;
		this.number = number;
	}
	
	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = game.get();
			System.out.println("Consumer #" + this.number + " got: " + value);
		}
	}
 }

class Producer extends Thread {
	private Game game;
	private int number;
	
	public Producer(Game g, int number){
		game = g;
		this.number = number;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			game.put(i);
			System.out.println("Producer #" + this.number + " put: " + i);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
		
	}

}