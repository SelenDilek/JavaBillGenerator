
public class DeluxPizza extends Pizza {
	public DeluxPizza(Boolean veg) {
		
		super(veg);
		super.addExtraCheese();
		super.addExtraToppings();
		super.getBill();
	}
	

}
