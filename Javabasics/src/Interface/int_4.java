package Interface;
interface Printable1 {
	void print();
}
interface Showable1 {
	void print();
}

public class int_4 implements Printable1, Showable1 {
	
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		int_4 obj = new int_4();
		obj.print();
		Showable1 obj1 = new int_4();
		obj1.print();
		Printable1 obj2 = new int_4();
		obj2.print();
	}
	
}
