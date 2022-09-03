package StaticG.Veriyable;

public class G_Veriyable2 {
	
	static int age=25;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts....");
		System.out.println("SGV : "+age);//25
		System.out.println("SGV with standard: "+G_Veriyable2.age);//25
		System.out.println("**********************************");
		age=30;	
		System.out.println("SGV : "+age);//30
		System.out.println("SGV with standard: "+G_Veriyable2.age);//30
		System.out.println("Program Ends...");

	}

}
