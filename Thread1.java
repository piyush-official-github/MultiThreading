
public class Thread1 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread task");
	}

	public static void main(String[] args) {

		Thread1 th= new Thread1();
		th.start();
	}

}
