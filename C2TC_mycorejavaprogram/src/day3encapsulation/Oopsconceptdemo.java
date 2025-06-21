package day3encapsulation;

public class Oopsconceptdemo {
	private int serialnum;
	private int age;
	private String name;
	
	

	public int getSerialnum() {
		return serialnum;
	}
	public void setSerialnum(int serialnum) {
		this.serialnum = serialnum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Oopsconceptdemo [serialnum=" + serialnum + ", age=" + age + ", name=" + name + "]";
	}
	
	
	

}
