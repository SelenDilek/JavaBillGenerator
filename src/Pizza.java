
public class Pizza {
	
	private int price ;
	private Boolean veg ;
	private int extraCheesePrice = 100 ;
	private int extraToppingsPrice = 150;
	private int backPackPrice=20;
	private int basePizzaPrice;
	
	private boolean isExtraCheeseAdded = false ;
	private boolean isExtraToppingsAdded=false;
	private boolean isOptedForTakeAway=false;
	
	
	
	
	public Pizza(Boolean veg) {
		this.veg=veg;
		
		if(this.veg) {
			
			this.price=300;
			
		} else {
			this.price=400;
		}
		basePizzaPrice=this.price;
	}
	
	public void getPizzaPrice() {
		
		System.out.println(this.price);
	
	}
	
	public void addExtraCheese() {
		isExtraCheeseAdded=true;
		
		System.out.println("Extra cheese added");
		this.price+=extraCheesePrice;
		
	}
	
	public void addExtraToppings() {
		
		isExtraToppingsAdded=true;
		
		System.out.println("Extra toppings added");
		this.price+=extraToppingsPrice;
		
		
	}
	
	public void takeAway() {
		isOptedForTakeAway=true;
		
		System.out.println("Take away opted");
		this.price+=backPackPrice;
		
	}
	
	public void getBill() {
		
		String bill="";
		System.out.println("Pizza : " + basePizzaPrice);
		if(isExtraCheeseAdded) {
			
			bill+="Extra cheese added: " + extraCheesePrice + "\n";
		}
		if(isExtraToppingsAdded) {
			
			bill+="Extra cheese added: " + extraToppingsPrice + "\n";
		}
		if(isOptedForTakeAway) {
	
			bill+="Extra cheese added: " + backPackPrice + "\n";
}
		
		
		bill+="Bill: " + this.price + "\n";
		System.out.println("bill");
		
	}
	
	
	
	
	
	
	
	
	
	

}
