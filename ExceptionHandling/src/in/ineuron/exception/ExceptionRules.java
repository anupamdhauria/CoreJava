package in.ineuron.exception;

/*
 * all checked exception -->if child class is throwing Exception 
then Parent also need to throw  same Exception or its parent Exception

Unchecked Exception need not to worry
*/

class Parent{
	public void m1() {
		
	}
}
class Child extends Parent{
	@Override
	public void m1() throws ArithmeticException{
		
	}
}
public class ExceptionRules {

	public static void main(String[] args) {
		
	}
}
