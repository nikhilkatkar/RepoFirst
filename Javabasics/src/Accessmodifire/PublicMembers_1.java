package Accessmodifire;

public class PublicMembers_1 {
	
	public int accNum=12345;
	public void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		PublicMembers_1 p1=new PublicMembers_1();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessPublicMembers {

	public static void main(String[] args) {
		
		PublicMembers_1 p1=new PublicMembers_1();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
