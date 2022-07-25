package factory;

public class PizzaStore {
    SimplePizzaFactory factory;
    
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    
    public PizzaStore() {
        this.factory = new SimplePizzaFactory();
    }
    
    public Pizza orderPizza(String type) {
        
        Pizza pizza = factory.createPizza(type);
     
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}
