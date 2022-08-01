package factory;

public class NYStyleCheesePizza extends Pizza{
	
	public NYStyleCheesePizza( ) {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
	
    public String toString() {
        return "This is a NYStyleCheesePizza pizza";
    }
}
