package singleton.basic;

public class Singleton2 {
    //atributo del mismo tipo
    private static final Singleton2 instancia=new Singleton2();

    //constructor privado
    private Singleton2(){
        System.out.println("INFO> instanciando singleton2");
    }

    //metodo publico que retorne la instancia
    public static Singleton2 getInstance(){
        return instancia;
    }

    public void print(){
        System.out.println("usando Singleton");
    }
}
