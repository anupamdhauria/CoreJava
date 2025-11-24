package in.ineuron.exception;

import java.util.Scanner;

public class ExceptionMultipleCatch {

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
			
			System.out.println("Enter the Array Size:");
			int size=scan.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the element to be inserted");
			int ele=scan.nextInt();
			System.out.println("Enter the position where array element to be inserted");
			int pos=scan.nextInt();
			
			arr[pos]=ele;
			System.out.println(ele+ "  element has inserted on location::"+pos);
			scan.close();
			
			
		}catch(ArithmeticException e) {
			System.out.println("You're trying to divide by zero illogical");
		}catch(NegativeArraySizeException nae) {
			System.out.println("Array size should not be negative");
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array index should not be more");
		}catch(Exception e) {
			System.out.println("Wrong Input!!");
		}
		System.out.println("Connection Terminated..");

	}

}
