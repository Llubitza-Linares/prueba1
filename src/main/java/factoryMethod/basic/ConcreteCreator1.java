package factoryMethod.basic;

public class ConcreteCreator1 extends Creator{
    @Override
    public ProductConcrete1 factoryMethod() {
        ProductConcrete1 product = new ProductConcrete1();
        //atributos que son otros objetos
        return product;
    }
}
