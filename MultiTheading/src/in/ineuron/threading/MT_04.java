package in.ineuron.threading;

class MyThread3 extends Thread {

	@Override
	public void run() {
		System.out.println("run method invoked");
	}

	
	public void start() {
		super.start();
		System.out.println("start method invoked");
	}
}

public class MT_04 {

	public static void main(String[] args) {

		MyThread3 t = new MyThread3();
		t.start();

		System.out.println("Main Thread");
	}

}
