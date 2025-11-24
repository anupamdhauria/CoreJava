package in.ineuron.exception;

import java.util.Scanner;
class Alpha3{
	
	
	void alpha(Scanner scan) throws ArithmeticException{
		System.out.println("Connection is Established...");
		System.out.println("Enter the First Value to divide::");
		int num1=scan.nextInt();
		System.out.println("Enter the second value to divide::");
		int num2=scan.nextInt();
		
		int res=num1/num2;
		
		System.out.println("The Result is::"+res);
		
	}
}
class Beta3{
	void beta(Scanner sc) throws ArithmeticException {
		
		Alpha3 a=new Alpha3();
		a.alpha(sc);
		
	}
}
public class ExceptionFinally {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
			Beta3 b=new Beta3();
			b.beta(scan);
		}catch(ArithmeticException e) {
			System.out.println("Exception handled by Main");
			System.out.println(e.toString());
		}finally {
			scan.close();
			System.out.println("Main::Scanner is closed");
			System.out.println("Main::Close the connection");
		}
	}

}
