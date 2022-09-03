package ArrayList;

import java.util.ArrayList;

public class List_3$ {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		System.out.println(al);
		System.out.println(al.isEmpty());
		// Adding elements to the end of the list
		
		al.add("ravi");
		al.add("vijay");
		al.add("Ajay");
		System.out.println(al);
		
		// Adding an element at the specific position
		
		al.add("Gaurav");
		System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.add("sonoo");
		al2.add("Hanumat");
		// Adding second list elements to the first list
		System.out.println("List al element before adding list al2: " + al);
		
		al.addAll(al2);
		System.out.println(al);
		ArrayList al3=new ArrayList();
		al3.add("john");
		al3.add("Rahul");
		
		System.out.println(al2);
		System.out.println(al3);
		
		// Adding second list elements to the first list at specific position
		al2.addAll(1,al3);
		System.out.println(al);
	}

}
