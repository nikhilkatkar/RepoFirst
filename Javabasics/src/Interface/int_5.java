package Interface;
interface Printable2 {
	void print();
}
interface Showable2 extends Printable2 {
	void show();
	//public abstract void print(); ---> inherited method
}

public class int_5 implements Showable2  {
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	public static void main(String args[]) {
		int_5 obj = new int_5();
		obj.print();
		obj.show();
		Printable2 obj2 = new int_5();
		obj2.print();
	}

}
