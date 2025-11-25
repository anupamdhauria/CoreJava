package in.ineuron.exception;

import java.util.Scanner;

class InvalidCustomerException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidCustomerException(String msg) {
		super(msg);
	}

}

class Atm {
	Integer userId = 1212;
	Integer password = 1111;
	Integer uid = null;
	Integer pass = null;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter userId::");
		uid = sc.nextInt();
		System.out.println("Enter Password:");
		pass = sc.nextInt();
	
	}

	public void verify() throws InvalidCustomerException {
		if ((userId.equals(uid)) && ( password.equals(pass))) {
			System.out.println("Take your cash");
		} else {
			InvalidCustomerException ice = new InvalidCustomerException("Invalid Credentials !! Please Try Again!!");
			throw ice;
		}
	}

}

class Bank {
	public void initiate() {
		Atm sbi = new Atm();
		try {
			sbi.input();
			sbi.verify();
		} catch (InvalidCustomerException e)
		{
			System.out.println(e.getMessage());
			try 
			{
				sbi.input();
				sbi.verify();
			} 
			catch (InvalidCustomerException e1) 
			{
				System.out.println(e1.getMessage());
				try 
				{
					sbi.input();
					sbi.verify();
				} 
				catch (InvalidCustomerException e2) 
				{
					System.out.println("You are Suspicious Person . Your card has been blocked for 24 hours..");
					System.exit(0);
				}
			}
		}
	}
}

public class CustomException {

	public static void main(String[] args) {
		Bank hdfc = new Bank();
		hdfc.initiate();
	}

}
