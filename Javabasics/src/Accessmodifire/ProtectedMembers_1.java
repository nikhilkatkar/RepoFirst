package Accessmodifire;

public class ProtectedMembers_1 {
	
	protected int accNum=12345;
	protected void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		ProtectedMembers_1 p1=new ProtectedMembers_1();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

class AccessProtectedMembers {

	public static void main(String[] args) {
		
		ProtectedMembers_1 p1=new ProtectedMembers_1();
		System.out.println("Accessing Protected members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
