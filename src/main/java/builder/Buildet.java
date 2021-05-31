package builder;

public abstract class Buildet {
    protected Product product;

    public Product getProduct() {
        return product;
    }

    public void createProduct(){
        product= new Product();
    }

    public abstract void buildAttribute1();
    public abstract void buildAttribute2();
    public abstract void buildAttribute3();
    public abstract void buildAttribute4();
    public abstract void buildAttribute5();

}