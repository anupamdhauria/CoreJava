package in.ineuron.exception;
import java.util.Scanner;

public class ExceptionExmpl1 {

	public static void main(String[] args) {
	
		try {
			System.out.println("Connection is Established...");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the First Value to divide::");
			int num1=scan.nextInt();
			System.out.println("Enter the second value to divide::");
			int num2=scan.nextInt();
			
			int res=num1/num2;
			
			System.out.println("The Result is::"+res);
		}catch(Exception e) {
			System.out.println("You're trying to divide by zero illogical");
			System.out.println("Connection Terminated..");
		}
		
	}

}
