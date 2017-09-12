package Decorator;

public class Milk extends CondimentDecorator {
      Beverage beverage;
	
	public Milk(Beverage beverage){
		 this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return  beverage.getDescription()+", Milk";
	}
	public double cost(){
		return 0.10 + beverage.cost();
	}
	 
}
