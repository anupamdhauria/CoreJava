package in.ineuron.exception;


//we can use mulitple Exception in Single catch but it should be parent child relation 
//all should be independent Exception
public class ExceptionMultipleExcepSingleCatch {

	public static void main(String[] args) {
		try {
			int k=100/100;
			String s=null;
			s.toUpperCase();
			Class.forName("args[1]");
		}catch(ArithmeticException | ClassNotFoundException | NullPointerException e ) {
			e.printStackTrace();
		}
	}
}
