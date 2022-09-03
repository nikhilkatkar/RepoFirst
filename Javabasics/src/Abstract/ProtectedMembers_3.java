package Abstract;

import Accessmodifire.*;

public class ProtectedMembers_3 {
	
public static void main(String[] args) {
		
		ProtectedMembers_1 p1=new ProtectedMembers_1();
		System.out.println("Accessing Protected members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
