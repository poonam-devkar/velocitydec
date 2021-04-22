package pattern_program;

public class string
{
public static void main(String[] args) 
{

	String s="poonam";
    String s1="POONAM";
    String s2="city1";
    
    	System.out.println(s.toUpperCase());
    
        System.out.println(s1.toLowerCase());
    
        System.out.println();

        System.out.println(s.contains(s2)); 

        System.out.println(s.length());

        System.out.println(s1.equalsIgnoreCase(s));

        System.out.println(s.charAt(4));

        System.out.println(s.endsWith("am"));
        
        System.out.println(s.substring(4));
        
        System.out.println(s.substring(3, 5));

        System.out.println(s.concat(s1));

       System.out.println(s);


}
}
