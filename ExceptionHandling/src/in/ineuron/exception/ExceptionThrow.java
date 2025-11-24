package in.ineuron.exception;

import java.util.Scanner;
class Alpha1{
	
	
	void alpha() throws ArithmeticException{
		System.out.println("Connection is Established...");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First Value to divide::");
		int num1=scan.nextInt();
		System.out.println("Enter the second value to divide::");
		int num2=scan.nextInt();
		
		int res=num1/num2;
		
		System.out.println("The Result is::"+res);
		scan.close();
	}
}
class Beta1{
	void beta() throws ArithmeticException{
		try {
			Alpha1 a=new Alpha1();
			a.alpha();
		}catch(ArithmeticException ae) {
			System.out.println("handled by Alpha::"+ ae.toString());
			//Re-Throwing to caller
			throw ae;
		}
		
	}
}
public class ExceptionThrow {

	public static void main(String[] args) {
		try {
			Beta1 b=new Beta1();
			b.beta();
		}catch(Exception e) {
			System.out.println("Exception handled by Main::"+e.toString());
			
		}
	}

}
