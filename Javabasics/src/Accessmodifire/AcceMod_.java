package Accessmodifire;

class c1{
	public int x=29;
	int y=30;
	protected int z=31;
	private int a=32;

	public void meth1() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);//public every were can be access
	}
}

public class AcceMod_ {
	public static void main(String[] args) {
		c1 c=new c1();
		//c.meth1();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		//System.out.println(c.a);//private can not be access

	}
		

}		
