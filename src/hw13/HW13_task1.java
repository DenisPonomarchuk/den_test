package hw13;

class myClass implements Runnable {

	public void run() {
		try {
			Thread t = new Thread("myThread");//Thread.currentThread();
			for (int i = 0; i < 5; i++) {
				System.out.println(t.getName());
				t.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class myClass2 extends Thread {

	public void run() {
		try {
			Thread t = new Thread("myThread2");//Thread.currentThread();
			for (int i = 0; i < 5; i++) {
				System.out.println(t.getName());
				t.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class HW13_task1 {

	public static void main(String[] args) {
		myClass my = new myClass();
		my.run();

		myClass2 my2 = new myClass2();
		my2.run();
		
	}

}
