package Accessmodifire;

public class AccessProtectedMembers_2 {
	
public static void main(String[] args) {
		
	ProtectedMembers_1 p1=new ProtectedMembers_1();
		System.out.println("Accessing Protected members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

	
}
