package in.ineuron.threading;

class MyThread1 extends Thread{


	public void run() {
		System.out.println("Zero args run method");
	}
	

	public void run(int i) {
		System.out.println("One args run method");
	}
}
public class MT_02 {

	public static void main(String[] args) {
	
		MyThread1 t=new MyThread1();
		t.start();
		
		System.out.println("Main Thread");
	}

}
