package in.ineuron.threading;

class MyThread10 extends Thread {

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
public class MT_11_join2 {
	public static void main(String[] args) throws InterruptedException {		
		
		Thread.currentThread().setName("Main Thread");
		MyThread10 t=new MyThread10();
		t.start();
		t.join(2500);//main thread will wait till 2.5sec then it will execute
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}
}
