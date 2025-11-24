package in.ineuron.exception;

class Alpha4{
	
	
	int alpha() {
		
		try {
		System.out.println("Connection Established..");
		return 10;
		}finally {
		System.out.println("Connection Closed");
		}
	}
}

public class ExceptionFinallyReturn {

	public static void main(String[] args) {
		try {
			Alpha4 a =new Alpha4();
			int result = a.alpha();
			System.out.println("Result is::"+result);
		}catch(ArithmeticException e) {
			System.out.println("Exception handled by Main");
			System.out.println(e.toString());
		}finally {
			
			System.out.println("Main::Close the connection");
		}
	}

}
