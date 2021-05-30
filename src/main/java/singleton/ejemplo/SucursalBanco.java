package singleton.ejemplo;

public class SucursalBanco {
    public SucursalBanco(){

    }

    public void retirarDinero(String cuenta,int cantidad){
        System.out.println("Cuenta: "+cuenta);
        Banco.getInstance().getMoney(cantidad);
    }
}
