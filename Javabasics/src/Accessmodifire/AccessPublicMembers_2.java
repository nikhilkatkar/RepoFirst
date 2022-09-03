package Accessmodifire;

public class AccessPublicMembers_2 {
	
public static void main(String[] args) {
		
	PublicMembers_1 p1=new PublicMembers_1();
		System.out.println("Accessing Default members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
