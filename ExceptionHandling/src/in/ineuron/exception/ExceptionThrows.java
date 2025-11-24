package in.ineuron.exception;

import java.util.Scanner;
class Alpha{
	
	
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
class Beta{
	void beta() throws ArithmeticException {
		
		Alpha a=new Alpha();
		a.alpha();
		
	}
}
public class ExceptionThrows {

	public static void main(String[] args) {
		try {
			Beta b=new Beta();
			b.beta();
		}catch(Exception e) {
			System.out.println("Exception handled by Main");
			System.out.println(e.toString());
		}
	}

}
