package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector {
	private static final int i = 0;
	private static final boolean object = false;
	private static final Vector s1 = null;

	public static void main(String[] args) {
		Vector V=new Vector();
		  V.add("abc");
		 V.add(100);
		 V.add('A');
		 V.add(100);
		 V.add(null);
		 V.add(null); 
		 System.out.println(V.capacity());
		 
		 System.out.println(V.size());
		 System.out.println(V.lastElement());
		 System.out.println(V.lastIndexOf(100));
		 System.out.println(V.isEmpty());
		 System.out.println(V.get(3));
		 
		 
		 V.add(2,55.5f);
		 System.out.println(V);
   
		 
		 V.remove(2);
		 System.out.println(V);
		 
		 
		 V.set(0,"xyz");
		 System.out.println(V);
	
	System.out.println(".....print by iterator......");
	
	Iterator itr=V.iterator();
	while(itr.hasNext())
	{System.out.println(itr.hasNext());
	
	}
		 
		 System.out.println("....by using Listiterator.....");

	ListIterator litr=V.listIterator();
	while(litr.hasNext());
	System.out.println(litr.next());
	
	
System.out.println("......by using For loop....");

for(int i=0;i<=V.size()-1;i++)
			
{
	System.out.println(V.get(i));
}
	

System.out.println("......by using Foreach loop.....");
	
	for(Object s1:V);
	
System.out.println(s1);

System.out.println(".....by using Enumeration.....");

Enumeration enu=V.elements();
while(enu.hasMoreElements())
System.out.println(enu.nextElement());

	
	
	
	}


}
