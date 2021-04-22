package exceptionHandling;

import java.util.InputMismatchException;

public class sample2 {



	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=0;
		
		try
		{
			c=a/b;
		}
				catch(ArrayIndexOutOfBoundsException e)
		{
					System.out.println("arrayindexoutofboundexception handled");
		
		}
		catch(InputMismatchException e)
		
		{
			System.out.println("inputmismatchexception handled");
		
		}
		catch (ArithmeticException e) {
			
			System.out.println("arithmaticexception handled");
			// TODO: handle exception
		}
		
		System.out.println(c);
	}
}
