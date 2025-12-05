package in.ineuron.threading;


public  class MT_16_UsingLamdaExpression {
	public static void main(String[] args){		
		
		new Thread(()->{
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("child thread");
			}
		}).start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
		
		
	}

}
