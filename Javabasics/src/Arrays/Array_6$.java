package Arrays;

public class Array_6$ {
	
	public static void main(String[] args) {
		
		int[] a=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		// or
		
		int[] a1= {100,200,300,400,500};
		
		System.out.println(a1.length);
		System.out.println(a1[2]);
		System.out.println("--------------");
		
		//for loops
		
		for(int i=0;i<a1.length;i++) {
			
			System.out.println(a1[i]);
		}
		System.out.println("--------------");
		
		//for each loops
		
		for(int i:a1) {
			
			System.out.println(i);
		}
		
	}

}
