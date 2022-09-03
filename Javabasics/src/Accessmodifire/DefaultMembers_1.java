package Accessmodifire;

public class DefaultMembers_1 {
	
	int accNum=12345;
	void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		DefaultMembers_1 p1=new DefaultMembers_1();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessDefaultMembers {

	public static void main(String[] args) {
		
		DefaultMembers_1 p1=new DefaultMembers_1();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
	

}
