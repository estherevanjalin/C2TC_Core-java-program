package day6;

public class Studentdemo {
	
	public static void main(String[]args) {
	
		Student s=new Student(100);// if final this value aloted can be individualbut final static its same
		System.out.println(s);  //static=incremented to 0   //non static =incremented to 0
		
		
		
		Student s1=new Student(200);
		System.out.println(s1);  //static incremented to 1 because same memory //non static = incremented same as o it doesnt has connection on before object it is individual
		
		Student s2=new Student(300);
	
		System.out.println(s2);   //static incremented //non static not incremented
		
		
	}
	public static void main(char c)   // it will not run coz it doesnt has right syntax
	{
		System.out.println("hello");
	}
	public static void main() {
		System.out.println("hello from no args method");   //it will not run it doesnt has string args[]
	}
	
	
}
