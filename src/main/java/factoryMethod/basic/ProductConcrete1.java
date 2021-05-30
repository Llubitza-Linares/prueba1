package factoryMethod.basic;

public class ProductConcrete1 implements IProduct{

    public ProductConcrete1(){}


    @Override
    public void create() {
        System.out.println("productConcrete1");
    }
}
