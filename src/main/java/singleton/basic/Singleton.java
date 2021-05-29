package singleton.basic;

import java.util.Collections;

public class Singleton {
    //atributo del mismo tipo
    private static Singleton instancia = null;

    //constructor privado
    private Singleton(){
        System.out.println("INFO> Creando Singleton");
    }

    //metodo estatico publico - retorna la instancia unica
    public static Singleton getInstance(){
        if (instancia == null)
            instancia=new Singleton();
        return instancia;
    }

    public void print(){
        System.out.println("Usando el singleton");
    }
}
