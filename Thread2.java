
public class Thread2 implements Runnable{
	@Override
	public void run() {
		System.out.println("thread task2");
	}

	public static void main(String[] args) {
		
		Thread2 th2 = new Thread2();
		Thread th = new Thread(th2);
		th.start();
		
	}

}
