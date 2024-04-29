
public class changingAThreadMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); // main thread
		
		// now changing from main thread to piyush thread
		Thread.currentThread().setName("piyush");
		
		System.out.println(Thread.currentThread().getName()); // piyush thread
		
		// now changing form piyush thread to main thread
		Thread.currentThread().setName("main");
		
		System.out.println(Thread.currentThread().getName()); // main thread
	}

}
