package factory;

public class OrderPizza {
    public static void main(String[] args) {
        PizzaStore o = new PizzaStore();
        Pizza p = o.orderPizza("cheese");
        
        System.out.println(p);
    }
}
