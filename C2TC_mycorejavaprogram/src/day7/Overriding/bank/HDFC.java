package day7.Overriding.bank;       //Program to demonstrate method overriding - Runtime Polymorphism

public class HDFC extends RBI {  //subclass
	@Override
	public float getRateOfInterest() {
		return 6.8f;
	}


}
