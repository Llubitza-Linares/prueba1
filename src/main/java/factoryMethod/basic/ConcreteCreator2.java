package factoryMethod.basic;

public class ConcreteCreator2 extends Creator{
    @Override
    public ProductConcrete2 factoryMethod() {
        ProductConcrete2 product2 = new ProductConcrete2();
        //atributos que son otros objetos
        return product2;
    }
}
