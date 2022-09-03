package Arrays;

public class M_Array_7$ {
	
	public static void main(String[] args) {
		
		int[][] a=new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		//or
		
		//int[][] a1= { {100,200} , {300,400} , {500,600}};
		
		System.out.println(a.length);//row
		System.out.println(a[0].length);//colam
		System.out.println("***************");
		
		// for loops
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
				System.out.println(a[i][j]);
				
			}
		
	    }
		System.out.println("***************");
		// for each loops
		for(int r[]:a) {
			
			for(int i:r) {
				
				System.out.println(i);
			}
		}
	}

}
