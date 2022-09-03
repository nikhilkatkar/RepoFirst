package Overloadings;

public class MethodOverloading {
	/**
	 * Method Overloading: any method declare more than once in class body with
	 * anyone of below rules: 
	 * 1. type of argument differ or 
	 * 2. number of arguments/parameter should differ or 
	 * 3. position of arguments/parameter should differ
	 */
	static double res;
	static public void square() {
		System.out.println("No Parameter Method Called");
	}
	static public void square(int number) {
		res = number * number;
		System.out.println("Method with Integer Argument Called:" + res);
	}
	static public void square(double number) {//6.25
		res = number * number;
		System.out.println("Method with float Argument Called:" + res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result: "+res);//0.0
		MethodOverloading.square(2.5f);
		System.out.println("Result: "+res);//6.25
		MethodOverloading.square();
		MethodOverloading.square(5);
		System.out.println("Result: "+res);//25

	}

}
