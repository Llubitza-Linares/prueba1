package factoryMethod.basic;

public class ConcreteCreator3 extends Creator{
    @Override
    public ProductConcrete3 factoryMethod() {
        ProductConcrete3 productConcrete3 = new ProductConcrete3();
        //atributos que son otros objetos
        return productConcrete3;
    }
}
