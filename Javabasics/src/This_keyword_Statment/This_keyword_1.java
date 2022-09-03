package This_keyword_Statment;

public class This_keyword_1 {
	void show() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		
		This_keyword_1 r=new This_keyword_1();
		System.out.println(r);
		r.show();
		//same ref id print karta hey:1@15db9742 

	}

}
