package singleton.basic;

public class Singleton3 {
    //atributo del mismo tipo
    public static Singleton3 instance=null;

    //constructor privado
    private Singleton3(){
        System.out.println("INFO> creando Singleton");
    }

    //metodo publico que retorne la isntancia
    public static Singleton3 getInstance(){
        if (instance == null)
            instance=new Singleton3();
        return instance;
    }
}
