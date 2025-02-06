package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> a1=new HashSet();//set
		a1.add(345);
		a1.add(234);
		a1.add(699);
		a1.add(678);
		System.out.println(a1);

		//hashSet
		HashSet<Integer> h1=new HashSet();
		h1.add(28);
		h1.add(78);
		h1.add(56);
		System.out.println(h1);
		
		h1.remove(78);
		System.out.println(h1);
		
		System.out.println(h1.size());
		
		//sort,get, set not posible
		
		h1.addAll(a1);
		System.out.println(a1);
		
		h1.removeAll(a1);
		System.out.println(a1);
		
		System.out.println(h1.contains(40));//to check the number
		
		Iterator<Integer> it=a1.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}
	

}
