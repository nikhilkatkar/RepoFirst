package Methods;

public class method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=getAdditionResult(25, 30);
		
		sum =sum*100;
		System.out.println("Result of addition: "+sum);
		System.out.println("Result of addition2: "+method4.getAdditionResult(250.36, 45));
	}
	static double getAdditionResult(double num1,double num2) {
		double res = num1+num2;
		return res;

	}

}
