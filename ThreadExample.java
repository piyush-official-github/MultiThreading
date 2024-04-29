
public class ThreadExample extends Thread {

       @Override
       public void run() {
           for(int i=0; i<3; i++) {
try 
{
      Thread.sleep(1000);
      System.out.println("Thread running " + i);
} 
catch (InterruptedException e) 
{
      System.out.println("Thread interrupted");
 }
}
      System.out.println("Thread execution completed");
}
      public static void main(String[] args) {
        ThreadExample te = new ThreadExample();
        te.start();
  }
}