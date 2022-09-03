package Non_Staticveriable;

public class Nonstatic_2 {
	
		// TODO Auto-generated method stub
	 //Global Variable
		int mobileNum=123;//non-static Global Variable
		char grade;//non-static Global Variable
		
			
			public static void main(String[] args) {
			System.out.println("Program Starts...");
			//create an object
			System.out.println("*************r1 Object****************");
			Nonstatic_2 r1=new Nonstatic_2();
			System.out.println("mobilenum with r1 reference: "+r1.mobileNum);//123
			System.out.println("grade with r1 reference: "+r1.grade);// 
			System.out.println("*************x1 Object****************");
			Nonstatic_2 x1=new Nonstatic_2();
			System.out.println("mobilenum with x1 reference: "+x1.mobileNum);//123
			System.out.println("grade with x1 reference: "+x1.grade);// 
			System.out.println("*************updated x1 Object variables****************");
			x1.mobileNum=987;
			x1.grade='A';
			System.out.println("updated, mobilenum with x1 reference: "+x1.mobileNum);//987
			System.out.println("updated, grade with x1 reference: "+x1.grade);//A 
			System.out.println("*************r1 Object****************");
			System.out.println("mobilenum with r1 reference: "+r1.mobileNum);//123
			System.out.println("grade with r1 reference: "+r1.grade);// 
			System.out.println("Program Ends...");
		
	}

}
