package System_Scanner;

class training{
	training(){
		System.out.println("Training class const");
	}
	void manualTesting() {
		System.out.println("I am from manual Testing");
	}
	void automationTesting() {
		System.out.println("I am from Automation Testing");
	}
}

public class System_2 {
	
	static training t1=new training();
	public static void main(String args[]) {

		System_2.t1.manualTesting();
		System_2.t1.automationTesting();
	  //classname.staticRefVar.method
		
		training t2=new training();
		t2.manualTesting();
		t2.automationTesting();
	}
	
	

}
