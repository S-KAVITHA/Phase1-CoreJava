package accessmodifiers;

public class ProtectedAccessModifierDemo {

	public static void main(String[] args) {
		
		Hero hero = new Hero();
		
		//access protected property
		System.out.println("The Power is : "+hero.power);
		hero.usePower();		
		
		//public methods
		hero.showPower();
		
		
		//access public properties and methods defined in another class within same package.
		System.out.println("\n\n------------------");
		
		Father father = new Father();
		System.out.println("Amount : "+father.amount);
		System.out.println("Park Name : "+father.park);
		System.out.println("------------------");
		//access methods
		System.out.println("Amount : "+father.showAmount());
		System.out.println("Park Name : "+father.displayPark());
	}

}