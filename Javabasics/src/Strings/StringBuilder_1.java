package Strings;

public class StringBuilder_1 {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Tony");
		//set char
		System.out.println(sb.charAt(0));
		System.out.println(sb.charAt(3));
		
		//Get Char
		sb.setCharAt(0, 'P');
		System.out.println(sb);
		
		//insert char
		sb.insert(0,'S');
		System.out.println(sb);
		
		//delete char
		sb.delete(0, 1);
		System.out.println(sb);
		
		//Append means to add something at the end.
		sb.append("Stark");
		System.out.println(sb);
//		sb.append(" "+"Stark");
//		System.out.println(sb);
		System.out.println(sb.length());
	}

}
