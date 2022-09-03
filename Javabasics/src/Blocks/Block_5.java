package Blocks;

public class Block_5 {
	/* static block or SIB */
	static {
		System.out.println("running static-block-1 of class Blocks5..");
	}
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block-1 of class Blocks5..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		Block_5 b1 = new Block_5();
		System.out.println("---------------------------------");
		Block_5 b2 = new Block_5();
		System.out.println("main() ends");
	}

}
