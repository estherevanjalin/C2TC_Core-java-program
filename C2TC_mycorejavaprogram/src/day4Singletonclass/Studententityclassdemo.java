package day4Singletonclass;

public class Studententityclassdemo {
	public static void main(String[]args) {
		Studententityclass s1 = Studententityclass.getObj();
		s1.setId(201);
		s1.setName("Esther");
		System.out.println(s1);
	}
	
	

}
