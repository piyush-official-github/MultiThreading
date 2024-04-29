

// Multiple Task To Multiple Thread
class MyThread1 extends Thread{
	public void run() {
		System.out.println("MyThread 1");
	}
}

class MyThread2 extends Thread{
	public void run() {
		System.out.println("MyThread 2");
	}
}


public class MultipleTaskToMultipleThread {

	public static void main(String[] args) {

		MyThread1 m1 = new MyThread1();
		m1.start();
		MyThread2 m2 = new MyThread2();
		m2.start();
	}

}
