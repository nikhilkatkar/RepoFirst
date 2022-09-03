package Contructors;

public class Contructors_overloading {
	
	int id;  
	String name;  
	  
	Contructors_overloading(){  
	System.out.println("this a default constructor");  
	}  
	  
	Contructors_overloading(int i, String n){  
	id = i;  
	name = n;  
	}  
	  
	public static void main(String[] args) {  
	//object creation  
		Contructors_overloading s = new Contructors_overloading();  
	System.out.println("\nDefault Constructor values: \n");  
	System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);  
	  
	System.out.println("\nParameterized Constructor values: \n");  
	Contructors_overloading student = new Contructors_overloading(10, "David");  
	System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
	}  
	}  


