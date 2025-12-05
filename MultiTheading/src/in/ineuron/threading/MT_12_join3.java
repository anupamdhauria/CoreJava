package in.ineuron.threading;

class MyThread11 extends Thread {

	static Thread mt=null;
	@Override
	public void run() {
		try 
		{
				mt.join();
				for(int i=0;i<5;i++) {
				System.out.println("Child Thread");
				}
		}
		catch (InterruptedException e)
		{
				e.printStackTrace();
		}
	}
}
//waiting main thread to complete its execution in child thread
public class MT_12_join3 {
	public static void main(String[] args) throws InterruptedException {		
		
		Thread.currentThread().setName("Main Thread");
		MyThread11.mt=Thread.currentThread();
		
		MyThread11 t=new MyThread11();
		t.start();
		for(int i=0;i<5;i++) {
			Thread.sleep(2000);
			System.out.println("Main Thread");
		}
	}
}
