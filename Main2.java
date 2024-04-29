package threadExa;

class Main2 implements Runnable{
	public void run() {
		System.out.println("run method");
	}
	
	public void msg() {
		System.out.println("message");
	}
	
	public static void main(String[] args) {
		Main2 ts = new 	Main2();
		Thread th = new Thread(ts);
		th.run();
		ts.msg();
	}
}
