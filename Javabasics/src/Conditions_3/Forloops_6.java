package Conditions_3;

public class Forloops_6 {

	public static void main(String[] args) {
		int count=1;
		int sum=0;

		for(int i=2;i<=50;i=i+2) {

			if(count%2==0) {

				sum= sum -i;

			}else {

				sum= sum +i;
			}
			count++;
		}
		System.out.println(sum);
	}
}	
