package Overriding;

class ABC {
	public void myMethod() {
		System.out.println("method of ABC class");
	}
}

class Over_4 extends ABC {
	
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method of Class Overriding4");
	}
	public static void main(String args[]) {
		Over_4 obj = new Over_4();
		obj.myMethod();
	}
}


