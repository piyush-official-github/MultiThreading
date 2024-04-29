package threadExa;

class MyThread1 extends Thread{
	public void run() {
		System.out.println("thread for MyThread1");
	}
	
	public void msg() {
		System.out.println("message");
	}
}


class MyThread2 extends Thread{
	public void run() {
		System.out.println("thread for MyThread2");
	}
}

public class Main {
	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		MyThread2 m2 = new MyThread2();
		m1.run();
		m2.run();
		m1.msg();
		
	}

}
