package in.ineuron.threading;

class MyThread8 extends Thread {

	@Override
	public void run() {
		System.out.println("run thread priority is::"+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread");
		}
	}
}

public class MT_09_Priority {
	public static void main(String[] args) {		
		MyThread8 t=new MyThread8();
		t.setPriority(Thread.MAX_PRIORITY);;
		t.start();
		System.out.println("main thread priority is::"+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}
}
