package in.ineuron.threading;

class MyThread5 extends Thread {

	@Override
	public void run() {
		System.out.println("Child Class Method");	
	}
}

public class MT_06 {
	public static void main(String[] args) {		
		MyThread5 t=new MyThread5();
		Thread t1=new Thread(t);
		t1.start();
		System.out.println("Main Thread");
		
	}
}
