package Overriding;
//final methods cannot be overridden
class Parent3 {
	// Can't be overridden it method is final thats way
	 void show() {
		System.out.println("I am final method of Parents3 class");
	}
}
class Child3 extends Parent3 {
	// This would produce error
	void show() {
		System.out.println("I am show method of child3 class");
	}
}
//Driver class
public class over_7 {
	public static void main(String[] args) {
		Parent3 a1=new Parent3();
		a1.show();
		Child3 a2=new Child3();
		a2.show();

	}
	
	
	

}
