package day4Singletonclass;

public class Studententityclass {
	private static Studententityclass s1 = new Studententityclass();
	public static Studententityclass getObj()
	{
		return s1;
	}
	private int id;
	private String name;
	
	private Studententityclass() {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Studententityclass [id=" + id + ", name=" + name + "]";
	}
	

}
