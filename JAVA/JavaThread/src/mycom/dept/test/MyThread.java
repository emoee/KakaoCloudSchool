package mycom.dept.test;

public class MyThread implements Runnable{

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("thread_thread: "+i);
			try {
				Thread.sleep(120);
			} catch (InterruptedException e) {
				System.out.println("thread_awake: "+i);
			}
		}
	}

}
