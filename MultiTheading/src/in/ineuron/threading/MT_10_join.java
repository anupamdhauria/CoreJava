package in.ineuron.threading;

class MyThread9 extends Thread {

	@Override
	public void run() {
		try 
		{
				for(int i=0;i<5;i++) {
				Thread.sleep(2000);
				System.out.println("Child Thread");
				}
		}
		catch (InterruptedException e)
		{
				e.printStackTrace();
		}
	}
}
//waiting child thread to complete its execution in main thread
public class MT_10_join {
	public static void main(String[] args) throws InterruptedException {		
		
		Thread.currentThread().setName("Main Thread");
		MyThread9 t=new MyThread9();
		t.start();
		t.join();//main thread will wait untill child thread completes its execution
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}
}
