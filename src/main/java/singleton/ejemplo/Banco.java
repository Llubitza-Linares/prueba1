package singleton.ejemplo;

public class Banco {
    private static Banco instance = null;
    private int saldo;
    private Banco(){
        saldo = 900;
        System.out.println("INFO> Iniciando Saldo" +saldo);
    }

    public static void makeInstance(){
        if(instance==null)
            instance=new Banco();
    }
    public static Banco getInstance(){
        if (instance==null)
            makeInstance();
        return instance;
    }

    public synchronized void getMoney(int amount){
        if (amount <= saldo){
            System.out.println("****"+saldo);
            saldo=saldo-amount;
            System.out.println("INFO> ---saldo"+saldo+"cantidad retirada"+amount);
        }else{
            System.out.println("WARN>--- no existe la cantidad ["+amount+"] saldo actual: ["+saldo+"]");
        }
    }
}
