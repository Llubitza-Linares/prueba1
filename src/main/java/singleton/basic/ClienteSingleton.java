package singleton.basic;

public class ClienteSingleton {
    public static void main(String[] args) {
        Singleton.getInstance().print();
        Singleton.getInstance().print();
        Singleton.getInstance().print();
        usingS();
        Singleton.getInstance().print();
        Singleton.getInstance().print();
        Singleton.getInstance().print();
    }

    public static void usingS(){
        Singleton.getInstance().print();
    }
}
