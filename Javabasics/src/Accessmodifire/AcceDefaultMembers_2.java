package Accessmodifire;

public class AcceDefaultMembers_2 {
	
public static void main(String[] args) {
		
	DefaultMembers_1 p1=new DefaultMembers_1();
		System.out.println("Accessing default members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
	
	

}
