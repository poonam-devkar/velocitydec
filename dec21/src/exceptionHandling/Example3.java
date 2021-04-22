package exceptionHandling;

import java.util.InputMismatchException;

public class Example3 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=0;
		
		try {
			c=a/b;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		System.out.println("ArrayIndexOutOfBoundsException handled");
		
		}
	catch (InputMismatchException e) {
		// TODO: handle exception
		System.out.println("inputmissmatchexception handled");
		
	}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("arithmaticexceptionhandled");
			
		}
	System.out.println(c);
	}
}
