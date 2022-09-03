package Blocks;

public class Block_3 {
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block1 of class Blocks3..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		Block_3 b1 = new Block_3();
		System.out.println("---------------------------------");
		Block_3 b2 = new Block_3();
		System.out.println("main() ends");
	}

}
