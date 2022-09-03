package Contructors;

public class contructors_4 {
	int roll;
	double salary;
	
	contructors_4(int r,double s){
		roll=r;
		salary=s;
		
	}

	void display() {
		System.out.println(roll + " " + salary);
	}
	public static void main(String args[]) {
		contructors_4 c1 = new contructors_4(101,250045.45);
		contructors_4 c2 = new contructors_4(201,550045.45);
		c1.display();
		c2.display();
	}

}
