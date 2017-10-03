package Decorator;
import java.text.NumberFormat;
public class StarBuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NumberFormat numFormat = NumberFormat.getInstance();
        
		Beverage b1 = new Espresso();
		String str_b1 = numFormat.format(b1.cost());
		System.out.println(b1.getDescription()+ " $ = "+ str_b1 );
		
		Beverage b2 = new HouseBlend();
		b2 = new Mocha(b2);
		b2 = new Whip(b2);
		String str_b2 = numFormat.format(b2.cost());
		System.out.println(b2.getDescription()+ " $ = "+ str_b2 );
		
		Beverage b3 = new DarkRoast();
		b3 = new Milk(b3);
		b3 = new Soy(b3);
		b3 = new Whip(b3);
		String str_b3 = numFormat.format( b3.cost());
		System.out.println(b3.getDescription()+ " $ = "+ str_b3);
		
		Beverage b4 = new DarkRoast();
		b4 = new Mocha(b4);
		b4 = new Soy(b4);
		String str_b4 = numFormat.format( b4.cost());
		System.out.println(b4.getDescription()+ " $ = "+ str_b4);
		
		
    
		
		
		
	}

}
