package in.ineuron.threading;

class MyThread7 extends Thread {

	@Override
	public void run() {
		System.out.println("run thread priority is::"+Thread.currentThread().getPriority());
	}
}

public class MT_08_setPriority {
	public static void main(String[] args) {		
		MyThread7 t=new MyThread7();
		t.setPriority(10);
		t.start();
		System.out.println("main thread priority is::"+Thread.currentThread().getPriority());
	}
}
