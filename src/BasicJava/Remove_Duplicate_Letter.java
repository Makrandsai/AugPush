package BasicJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Remove_Duplicate_Letter {

	public static void main(String[] args) {


		ArrayList a = new ArrayList();
		a.add("V");
		a.add("I");
		a.add("I");
		a.add("S");
		a.add("S");
		a.add("H");
		a.add("H");
		a.add("H");
		a.add("H");
		a.add("A");
		a.add("A");
		a.add("L");
		a.add("L");
		
		System.out.println(a);
		
		LinkedHashSet l = new LinkedHashSet(a);
		System.out.println(l);
		
		Iterator lt = l.iterator();
		
		while(lt.hasNext())
		{
			System.out.print(lt.next());
			
		}
		
		
		HashMap h = new HashMap<>();
		h.put("Roll Number ", 55 );
		h.put("Birthdate", 04);
		
		System.out.println(h);
		
	}

}
