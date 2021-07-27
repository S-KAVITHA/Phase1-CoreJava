package accessmodifiers;

public class Hero {
	
	// protected properties
	protected String power = "Healing Power";
	
	// protected methods
	protected void usePower() {
		System.out.println("The Best power is "+ power );
	}
	
	public void showPower() {
		System.out.println("The power is :"+power);
	}
	
	protected Hero() {}
}
