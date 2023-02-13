package advanced.multithreading.lesson018;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		myThread.shutDown();
		
	}

}

class MyThread extends Thread{
	private volatile boolean running = true;
	
	public void run(){
		while(running){
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutDown(){
		this.running = false;
	}
	
}