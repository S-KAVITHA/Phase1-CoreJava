package accessmodifiersB;

public class SuperHero {
	
	// protected properties
	protected int number = 911;
	protected String power = "Thunder";
	
	// protected methods
	protected int showNumber() {
		return number;
	}
	
	protected String showPower() {
		return power;
	}
	
	
	// note: class outside the package can not be instantiated with protected constructor.
	// protected SuperHero() {}
}
