package in.ineuron.threading;

class MyThread2 extends Thread {

	@Override
	public void run() {
		System.out.println("run method invoked");
	}

	@Override
	public void start() {
		System.out.println("start method invoked");
	}
}

public class MT_03 {

	public static void main(String[] args) {

		MyThread2 t = new MyThread2();
		t.start();

		System.out.println("Main Thread");
	}

}
