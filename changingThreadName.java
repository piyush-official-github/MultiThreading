
public class changingThreadName extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName()); // Thread-0 
		Thread.currentThread().setName("piyush");
		System.out.println(Thread.currentThread().getName()); // piyush
		System.out.println(Thread.currentThread().isAlive()); // true
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()); // main thread
		
		changingThreadName ctn = new changingThreadName();
		ctn.setName("hiraoo");
		ctn.start();
		System.out.println(ctn.isAlive()); // true

	}

}
