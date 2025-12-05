package in.ineuron.threading;

class A extends Thread{
	
	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
			System.out.println("Child thread");
			Thread.sleep(2000);
			}
		}catch(InterruptedException ie) {
			System.out.println("I got interrupted");
		}
	}
}

public class MT_14_sleep_interrupt {
	public static void main(String[] args) throws InterruptedException{		
		
		A t=new A();
		t.start();
		t.interrupt();
		t.join();
		System.out.println("End of Main");
	}
}
