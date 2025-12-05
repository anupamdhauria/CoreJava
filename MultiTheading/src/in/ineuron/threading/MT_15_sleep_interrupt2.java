package in.ineuron.threading;

class B extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child thread");
		}
		System.out.println("Waiting to enter in sleep state");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException ie) {
			System.out.println("I got interrupted");
		}
	}
}

public class MT_15_sleep_interrupt2 {
	public static void main(String[] args) throws InterruptedException{		
		
		B t=new B();
		t.start();
		t.interrupt();
		t.join();
		System.out.println("End of Main");
	}
}
