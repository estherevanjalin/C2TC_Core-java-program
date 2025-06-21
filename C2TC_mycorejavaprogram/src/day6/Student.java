package day6;

public class Student {
	private String name;
	private static int id;
	private int reg;
	private final static int y; // final static can be initialzied only in static block it is unchangeable for many object its has one memory
	private final  int x;     // it has individual memory so changes for different objects
	static {
		y=200;
		System.out.println("static");
	}
	
	
	
	public Student(int x) {
	    this.x=  x;
		id++;   // static variable has only one memory so it will be incremented;
		reg++;  //non static variable has individual memory so it will not incremented
		System.out.println("constructor called");
	}
	
	
	public int getReg() {
		return reg;
	}


	public void setReg(int reg) {
		this.reg = reg;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Student.id = id;
	}
	@Override
	public String toString() {
		return "Student [ id=" +id+ "reg=" +reg+ "name=" + name + ""
				+ "]";
	}
	

}
