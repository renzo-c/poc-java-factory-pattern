package factory;

public class OrderPizza {
    public static void main(String[] args) {
        NYPizzaStore o = new NYPizzaStore();
        Pizza p = o.orderPizza("veggie");
        
        System.out.println(p);
    }
}
