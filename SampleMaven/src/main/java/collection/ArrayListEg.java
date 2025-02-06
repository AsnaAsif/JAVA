package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEg {
	

	public static void main(String[] args) {
		System.out.println("List");
		List<String> l1=new ArrayList();
		l1.add("Orange");
		l1.add("Grapes");
		l1.add("banana");
		l1.add("kiwi");
		System.out.println(l1);
		
		System.out.println("non generic");
		ArrayList l2=new ArrayList();
		l2.add(89);
		l2.add(78);
		l2.add("america");
		l2.add("kiwi");
		l2.add(null);
		l2.add(null);
		System.out.println(l2);
		
		System.out.println("generic");
		ArrayList<String> l3=new ArrayList();
		l3.add("monkey");
		l3.add("bird");
		l3.add("animal");
		
		System.out.println(l3);
		
		l3.remove(1);
		l3.remove("america");
		System.out.println(l3);
		
		System.out.println(l3.size());
		
		for(int j=0;j<l3.size();j++)
		{
			System.out.println(l3.get(j));
		}
		
		
		Collections.sort(l1);
		System.out.println(l1);
		l1.addAll(l3);
		System.out.println(l3);
		
		l1.removeAll(l3);
		System.out.println(l3);
		
		System.out.println(l2.contains("kiwi"));//for search,exist true,not exist false
		
		System.out.println(l2.get(1));//to get index 1st details
		l2.set(1, 100);//output [89, 100, america, kiwi, null, null]
		System.out.println(l2);//to set a other number instead of index 1 position
		
		
		

	}

}
