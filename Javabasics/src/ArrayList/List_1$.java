package ArrayList;

import java.util.ArrayList;

public class List_1$ {
	
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("mango");
		list.add(123);
		list.add("Banana");
		list.add(null);
		list.add('c');
		list.add(15.6);
		list.add(true);
		list.add(new List_1$());
		list.add("Banana");
		
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("Traversing list through for loop:");
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		System.out.println("Traversing list through for-each loop:");
		// Traversing list through for-each loop
		for(Object fruit:list) {
			
			System.out.println(fruit);
		}
		// accessing the element
		System.out.println(list.get(1));
		
		// changing/update existing object
		list.set(1, "Dates");
		System.out.println(list.size());
		System.out.println(list);
		
	

	}

}
