package Accessmodifire;

public class PrivateMembers_1 {

	private int accNum=12345;
	private void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		//private is only within class access
		PrivateMembers_1 p1=new PrivateMembers_1();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessPrivateMembers2 {
	
	//private within package not access
	//private outside package by sub class not access
	public static void main(String[] args) {
		//p
		PrivateMembers_1 p1=new PrivateMembers_1();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}



