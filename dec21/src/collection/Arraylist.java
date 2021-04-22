package collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {
public static void main(String[] args) {
	
	ArrayList al=new ArrayList(5);
	 al.add("abc");
	 al.add(100);
	 al.add("A");
	 al.add(100);
	 al.add(null);
	 al.add(null); 
System.out.println(al);	 
	 System.out.println(al.get(3));
	 
	 System.out.println(al.isEmpty());
	 
	 System.out.println(al.size());
	 
	 System.out.println(al.lastIndexOf("A"));
	 
	 System.out.println(al.contains("abc"));
	 
	 al.add(2,55.5f);
	 System.out.println(al);
	 
	 al.remove(2);
	 System.out.println(al);
	 
	 al.set(0, "xyz");
	 System.out.println(al);
	 
	 
	 System.out.println("print by using iterator");
	 
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
	}
	
	System.out.println("print by using listiterator");
	
	ListIterator litr=al.listIterator();
	while(litr.hasNext()) {
		System.out.println(litr.next());
		
		
		
		System.out.println("print by using for eachloop");
		
		for(Object s1:al)
		{System.out.println(s1);
	}
	
	
	
	}
	 
	 

}}
