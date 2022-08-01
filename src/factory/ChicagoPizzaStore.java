package factory;

public class ChicagoPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (item.equals("claim")) {
			return new ChicagoStyleClaimPizza();
		} else if (item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else return null;
	}
}
