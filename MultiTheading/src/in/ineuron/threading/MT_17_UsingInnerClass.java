package in.ineuron.threading;


public  class MT_17_UsingInnerClass implements Runnable {
	public static void main(String[] args){		
		
		Thread t=new Thread(
				new Runnable()
				{
					@Override
					public void run() {
						for(int i=0;i<5;i++) {
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("child thread");
							
						}
						
					}
				});
		t.start();
				
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
