package in.ineuron.exception;

class Alpha5{
	
	
	void alpha() {
		
		try {
		System.out.println("Connection Established..");
		System.exit(0);
		}finally {
		System.out.println("Connection Closed");
		}
	}
}

public class ExceptionFinallySystemExit {

	public static void main(String[] args) {
		try {
			Alpha5 a =new Alpha5();
			a.alpha();
			
		}catch(ArithmeticException e) {
			System.out.println("Exception handled by Main");
			System.out.println(e.toString());
		}finally {
			
			System.out.println("Main::Close the connection");
		}
	}

}
