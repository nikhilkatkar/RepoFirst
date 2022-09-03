package Contructors;

public class contructors_1 {
	public contructors_1() {
		System.out.println("This is a zero-para constructor");
	}

	public contructors_1(char c) {
		System.out.println("This is a single-para constructor");
	}

	public contructors_1(int num1, int num2) {
		System.out.println("This is a int-int parameterized constructor");
	}

	public static void main(String[] args) {
		contructors_1 c1 = new contructors_1();
		contructors_1 c2 = new contructors_1(10, 20);
		contructors_1 c3 = new contructors_1('d');
	}
}

/**
 * Constructor Overloading: more than on constructor in a  class
 * Rule: 
 * 1. type of args differ or
 * 2. number of args differ or
 * 3. position of args differ
 * 
 */



