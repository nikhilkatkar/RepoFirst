package Blocks;

public class Block_7 {
	static int age;
	double salary;
	/* static block or SIB */
	static {
		age = 30;
	}
	/* non-static block or IIB */
	{
		salary = 45000.32;
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		System.out.println("age: " + Block_7.age);
		System.out.println("---------------------------------");
		Block_7 b1 = new Block_7();
		System.out.println("salary: " + b1.salary);
		System.out.println("main() ends..");
	}

}
