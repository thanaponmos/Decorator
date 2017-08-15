package Decorator;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Beverage b1 = new Espresso();
		System.out.println(b1.getDescription()+ " $ = "+ b1.cost() );
		
		Beverage b2 = new HouseBlend();
		b2 = new Mocha(b2);
		b2 = new Whip(b2);
		System.out.println(b2.getDescription()+ " $ = "+ b2.cost() );
		
		Beverage b3 = new DarkRoast();
		b3 = new Milk(b3);
		b3 = new Soy(b3);
		b3 = new Whip(b3);
		System.out.println(b3.getDescription()+ " $ = "+ b3.cost() );
		
		Beverage b4 = new DarkRoast();
		b4 = new Mocha(b4);
		b4 = new Soy(b4);
		System.out.println(b4.getDescription()+ " $ = "+ b4.cost() );
	}

}
