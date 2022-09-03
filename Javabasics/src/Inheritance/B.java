package Inheritance;

class A{
	int i=10;
	
	void show() {
		
		System.out.println("i am is a class show method");
	}
	
}

public class B extends A {
	int i=20;
	void show() {
		System.out.println("i am is b class show method");
		
	}
	

	void xyz (int i) { 
	System.out.println(i);//30
	System.out.println(this.i);//20
	System.out.println(super.i);//10
	this.show();
	super.show();
	}
	public static void main(String[] args) {
		B f=new B();
		f.xyz(30);

	}

}
