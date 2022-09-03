package Operators_1;

public class Operators_4 {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		 
	   //Arthmentic operators
		
		System.out.println(a+b);//30
		System.out.println(a-b);//10
		System.out.println(a*b);//200
		System.out.println(a/b);//0
		System.out.println(a%b);//10
		System.out.println("-----------------");
		
	   // relational operators
		
		System.out.println(a==b);//false
		System.out.println(a<b);//true
		System.out.println(a>b);//false
		System.out.println(a<=b);//true
		System.out.println(a>=b);//false
		System.out.println(a!=b);//true
		System.out.println("-----------------");
		
	//logical operators
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&y);//false
		System.out.println(x||y);//true
		System.out.println(!y);//true
		System.out.println("-----------------");
		
	//increment and decrement operators	
		a=10;
		a++;
		System.out.println(a);//11
		
		b=20;
		b--;
		System.out.println(b);//19
		
		
		
	}

}
