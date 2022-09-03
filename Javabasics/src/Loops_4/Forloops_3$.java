package Loops_4;

public class Forloops_3$ {

	public static void main(String[] args) {

		//1 to 10 No

		for(int i=1;i<=10;i++) {

			System.out.println(i);

		}
		System.out.println("-----------");
		// 10 to 1 No

		for (int i=10;i>0;i--) {

			System.out.println(i);

		}

		System.out.println("-----------");

		//break ---> print to 4

		for(int i=1;i<=10;i++) {

			if(i==5) {

				break;
			}

			System.out.println(i);
		}

		System.out.println("-----------");
		
		//continue--> not print 5
		for(int i=1;i<=10;i++) {

			if(i==5) {

				continue;
			}

			System.out.println(i);
		}
		
		
	}

}
