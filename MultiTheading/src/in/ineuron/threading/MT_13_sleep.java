package in.ineuron.threading;


public class MT_13_sleep {
	public static void main(String[] args) throws InterruptedException {		
		
		Thread.currentThread().setName("Main Thread");
		
		for(int i=0;i<10;i++) {
			Thread.sleep(2000);
			System.out.println("Slide::"+(i+1));
		}
	}
}
