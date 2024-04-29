

// single Task To Single Thread
public class singleTaskToSingleThread extends Thread{
	@Override
	public void run()
	{
		System.out.println("thread task");
	}
	public static void main(String[] args) {
		singleTaskToSingleThread st = new singleTaskToSingleThread();
		st.start();
	}

}
