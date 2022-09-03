package Final_Variables;
final class Test{
	void mNumber() {
		System.out.println("8888230505");
	}
	
	 void atmPIN() {
		System.out.println("8888");
	}
}

class Thief extends Test{
	void mNumber() {
		System.out.println("8888240606");
	}
	
	void atmPIN() {
		System.out.println("9999");
	}
	
}

public class Finalclassinheritance {

	public static void main(String[] args) {
		Thief t=new Thief();
		t.mNumber();
		t.atmPIN();

	}

}
