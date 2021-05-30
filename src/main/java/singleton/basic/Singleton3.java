package singleton.basic;

public class Singleton3 {
    //atributo del mismo tipo
    public static Singleton3 instance=null;

    //constructor privado
    private Singleton3(){
        System.out.println("INFO> creando Singleton");
    }

    private synchronized static void makeInstance(){
        if(instance==null)
            instance= new Singleton3();
    }

    //metodo publico que retorne la isntancia
    public static Singleton3 getInstance(){
        if (instance == null)
            instance=new Singleton3();
        return instance;
    }
    public void print(){
        System.out.println("usando Singleton");
    }
}
