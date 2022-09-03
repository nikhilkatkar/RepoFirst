package Final_Variables;

class Test{
	void mNumber() {
		System.out.println("8888230505");
	}
	
	final void atmPIN() {
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

public class Finalmethodoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Thief t=new Thief();
          t.mNumber();
          t.atmPIN();
	}

}
