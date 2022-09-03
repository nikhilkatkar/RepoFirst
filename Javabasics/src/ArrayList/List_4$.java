package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_4$ {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		System.out.println(al.isEmpty());
		al.add("Ravi");
		al.add("vijay");
		al.add("Ajay");
		al.add("Hanumat");
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		al2.add("Pune");
		System.out.println(al);
		System.out.println(al2);
		
		al.retainAll(al2);
		System.out.println(al);
		System.out.println(al2);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		List l1=new ArrayList();
		l1.add("pune");
		l1.add("pune");
		l1.add(123);
		l1.add("pune");
		l1.add(null);
		System.out.println(l1);

	}

}
