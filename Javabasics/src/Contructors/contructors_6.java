package Contructors;
class C {
	double i = 10.23;

	C(double j) {
		System.out.println("Running Class C constructor..");
		i = j;
	}
}


public class contructors_6 {
	public static void main(String args[]) {
		System.out.println("Main() of Class Cons6 is started...");
		C b1 = new C(15.34);
		System.out.println("Class C global varibale i = " + b1.i);//15.34
		System.out.println("======================================");
		C b2 = new C(45.32);
		System.out.println("Class C global varibale i = " + b2.i);//45.32
		System.out.println("Main() of Class Cons6 is ends here...");
	}
	

}
