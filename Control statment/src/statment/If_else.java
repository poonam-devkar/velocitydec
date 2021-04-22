package statment;

public class If_else {
	public static void main(String[] args) {
		
		int marks=70;
		
		if(marks>100)
		{
		System.out.println("invalid marks");
		}
		else if(marks>74)
		{
		System.out.println("distinction");
		}
		else if(marks>64)
		{
		System.out.println("first class");
		}
		else if(marks>=35)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
