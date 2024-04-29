

// single Task To Multiple Thread
public class singleTaskToMultipleThread extends Thread{

	@Override
	public void run()
	{
		System.out.println("thread task");
	}
	
	public static void main(String[] args) {
		singleTaskToMultipleThread st1= new singleTaskToMultipleThread();
		singleTaskToMultipleThread st2= new singleTaskToMultipleThread();
		st1.start();
		st2.start();
	}

}
