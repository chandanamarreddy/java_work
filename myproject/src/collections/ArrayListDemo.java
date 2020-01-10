package collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		
		al.add(100);
		al.add("chandana");
		al.add(200);
		al.add(300);
		System.out.println(al);
		Object obj= al.get(1);
		System.out.println(obj);
		for(int i=0; i<al.size(); i++)
		{
			Object o=al.get(i);
			
			System.out.print("  "+o);
		}
		System.out.println(" ");
		System.out.println("-----------");
		
		for(Object ob: al) {
			System.out.print("  "+ob);
		}
		System.out.println(" ");
		System.out.println("-----------");
		
		Iterator it= al.iterator();
		
		while(it.hasNext()) {
			
			Object ob1= it.next();
			System.out.print(" "+ob1);
		}
			
		
		
		
	}

}
