package UOperators_2;

public class UOperators6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = a;
		System.out.println("a: " + a);//10
		System.out.println("b: " + b);//10
		/**
		 * pre: first perform the operation dn use the updated value 
		 * post: first use the value dn perform the operation
		 */
		int k = ++a;
		System.out.println("k: " + k);//
		System.out.println("a: " + a);//
		int j = k++;//
		System.out.println("k: " + k);//
		System.out.println("j: " + j);//

		int r = 21;
		System.out.println("r=: " + r++);//
		System.out.println("r=: " + r);//
		System.out.println("r=: " + ++r);//
		System.out.println("r=: " + r);//

		int x = 105;
		System.out.println("x=: " + --x);//
		System.out.println("x=: " + x);// 
		System.out.println("x=: " + x--);// 
		System.out.println("x=: " + x);// 

	}

}
