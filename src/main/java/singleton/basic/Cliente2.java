package singleton.basic;

public class Cliente2 {
    public static void main(String[] args) {
        Singleton.getInstance().print();
        Singleton.getInstance().print();
        Singleton.getInstance().print();
        usingS();
        Singleton.getInstance().print();
        Singleton.getInstance().print();
        Singleton.getInstance().print();
    }

    public static void usingS() {
        Singleton.getInstance().print();
    }
}
