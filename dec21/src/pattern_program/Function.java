package pattern_program;

public class Function
{


public static void main(String[] args, int i) {
	String s1="VELOCITY";
	String s2="velocity";
	String s3 = "city1";
    String s4="abc xyz abc1 xyz1";
	
    String ar[]=s4.split("");
    
	System.out.println(ar.length);
	for(int i1=0;i1<=ar.length-1;i1++)
	{
		
		System.out.println(ar[i1]);
	}
	
	
	
	
	System.out.println(s2==s1);
	
	System.out.println(s3==s2);
	
	System.out.println(s1.charAt(3));
	
	System.out.println(s1.contains(s3));
	
	System.out.println(s1.compareToIgnoreCase(s2));
	
	System.out.println(s1.indexOf('O'));
	
	System.out.println(s1.concat(s3));   //merge string
	
	System.out.println(s1.endsWith(s3));
	
	System.out.println(s1.isEmpty());
	
	System.out.println(s1.lastIndexOf('C'));
	
	System.out.println(s1.substring(4));
	
	System.out.println(s2.startsWith("ve"));
	
	
	
}
}


