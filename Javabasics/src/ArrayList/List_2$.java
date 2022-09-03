package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List_2$ {
	
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println("Traversing list through for loop:");
		for(int i=0;i<list.size();i++) {
			
			System.out.println(i);
		}
		for(Object fruit:list) {
			
			System.out.println(fruit);
		}
		System.out.println(list.get(1));
		
		// changing the element
		list.set(1,"Dates");
		System.out.println(list.size());
		System.out.println(list);
		
		// Sorting the list
		Collections.sort(list);//A to z means assending order and store it in the same 
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8
		list.forEach(a->{
			System.out.println(a);
		});
		
		System.out.println("Traversing list through Iterator interface:");
		Iterator itr=list.iterator();
		/**
		 * List element: [Banana, Dates, Grapes, Mango]
		 * Iterator is a Interface in collection, which is used to iterate collection elements
		 * Iterator interface has following method to iterate collection elements
		 * 1. hasNext() ---> boolean --> true next element is present, false no next element
		 * 2. next() ---> Object --> it will return next element from collection
		 * 3. remove() --> void --> element deletion
		 * Iterator object can be use to iterate a collection only once, for 2nd iteration create new Iterator object
		 */
//		System.out.println(itr.hasNext());
//		System.out.println(itr.next());//Banana
//		System.out.println(itr.next());//Dates
//		System.out.println(itr.next());//Grapes
//		System.out.println(itr.next());//Mango
//		System.out.println(itr.next());//NoSuchElementException exception
		     
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(itr.hashCode());
		System.out.println("*********with used Iterator Object**********");
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("*******with new Iterator Object************");
		Iterator itr2 = list.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		
	}

}
