package singleton.ejemplo;

public class Cajero {

    public Cajero(){

    }

    public void retirarDinero(String cuenta, int cantidad){
        System.out.println("Cuenta"+cuenta);
        Banco.getInstance().getMoney(cantidad);
    }
}
