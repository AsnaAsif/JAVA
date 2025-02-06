package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();
		a.add(11);
		a.add(12);
		a.add(45);
		for(int i:a)
		{
			System.out.println(i);
		}
		//itertor interface//output 11,12,13
		
Iterator<Integer> it=a.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
it.remove();
System.out.println(a);
	}

}
