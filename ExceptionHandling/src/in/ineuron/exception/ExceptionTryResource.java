package in.ineuron.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

//Try with Resource the resource will automatically closed which are Extending from AutoClosable
public class ExceptionTryResource {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);BufferedReader bf=new BufferedReader(new FileReader("simple.txt"))){
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
