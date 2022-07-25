package factory;

public abstract class Pizza {
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
    
    public String toString() {
        return "this is abstract class pizza";
    }
}
