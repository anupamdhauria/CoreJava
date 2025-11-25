package in.ineuron.exception;

import java.util.Scanner;

class UnderAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public UnderAgeException(String msg) {
		super(msg);
	}

}
class OverAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public OverAgeException(String msg) {
		super(msg);
	}

}

class Applicant {
	Integer age=null;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age");
		age=sc.nextInt();
	}

	public void verify() throws UnderAgeException,OverAgeException {
		if(age<18) {
			UnderAgeException uae = new UnderAgeException("You are UnderAge Please try again after "+(18-age)+" years");
			System.out.println(uae.getMessage());
			throw uae;
		}else if(age>60) {
			OverAgeException oae=new OverAgeException("You are OverAge.You are not Eligible");
			System.out.println(oae.getMessage());
			throw oae;
		}else {
			System.out.println("You are Eligible..");
		}
	}

}

class RTO{
	Applicant a=new Applicant();
	public void initiate() {
		try {
			a.input();
			a.verify();
		}catch( UnderAgeException | OverAgeException e ) {
			try {
				a.input();
				a.verify();
			}catch( UnderAgeException | OverAgeException e1 ) {
				
				System.out.println("Dude You are not Elibigle");
			}
		}
	}
}

public class CustomExceptionRTO {

	public static void main(String[] args) {
		RTO r=new RTO();
		r.initiate();
	}

}
