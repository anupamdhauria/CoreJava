package in.ineuron.threading;

class MyThread6 extends Thread {

	@Override
	public void run() {
		Thread.currentThread().setName("Ayushi");
		System.out.println("run() is executed by::"+Thread.currentThread().getName());	
	}
}

public class MT_07 {
	public static void main(String[] args) {		
		MyThread6 t=new MyThread6();
		t.start();
		Thread.currentThread().setName("Anupam");
		System.out.println("main() is executed by::"+Thread.currentThread().getName());
	}
}
