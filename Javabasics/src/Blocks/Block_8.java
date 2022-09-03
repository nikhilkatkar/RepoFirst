package Blocks;

public class Block_8 {
	int age = 25;
	double salary = 15000.57;

	void print() {
		System.out.println("age: " +age);
		System.out.println("salary: " +salary);
	}
		
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		Block_8 b1 = new Block_8();
		
		System.out.println("main() ends..");
		Block_8 b2 = new Block_8();
		b2.print();
			
		
	}
	/* non-static block or IIB */
	{
		age=26;
		salary = 45000.32;
	}
	
	
	

}
