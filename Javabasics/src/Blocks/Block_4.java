package Blocks;

public class Block_4 {
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}	
	public static void main(String[] args) {
		System.out.println("main() Starts");
		Block_4 b1=new Block_4();
		System.out.println("---------------------------------");
		Block_4 b2=new Block_4();
		System.out.println("main() ends");
	}	
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-2 of class Blocks4..");
	}	

}
