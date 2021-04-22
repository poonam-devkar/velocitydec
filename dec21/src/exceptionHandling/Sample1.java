package exceptionHandling;

public class Sample1 {
	public static void main(String[] args) {
		
		int a=10;
		int b=2;
		int c=0;
		
		try {
			 
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			c=a/1;
			System.out.println("Arithmaticexception handled");
			
		}
		
		System.out.println(c);
		
		System.out.println("hi");
		
	}

}
