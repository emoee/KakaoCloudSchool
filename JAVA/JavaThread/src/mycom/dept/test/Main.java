package mycom.dept.test;

public class Main {

	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread());
		thread.start();
		
		for (int i=0; i<10; i++) {
			System.out.println("main_thread: "+i);
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				System.out.println("main_awake: "+i);
			}
		}
	}

}
