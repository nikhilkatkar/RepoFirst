package Obj_class;
class TestSample{
	void callMe() {
		System.out.println("Hello");
	}
}

public class Obj_5 extends TestSample {
	

	static int last_roll = 100;
	int roll_no;
	// Constructor
	Obj_5()
    {
        roll_no = last_roll;
        last_roll++;
    }
	@Override
	public int hashCode() {
		return 505;
	}
	@Override
    public String toString()
    {
        return "BasicCoreJava";
    }
	// Driver code
	public static void main(String args[]) {
		Obj_5 s = new Obj_5();
		// Below two statements are equivalent
		System.out.println(s.hashCode());
		System.out.println(s.toString());
		 TestSample t1=new TestSample();
		 System.out.println(t1);
		 System.out.println(t1.hashCode());
	}

}
