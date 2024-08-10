package NoArgs.StaticFactoryMethod;

public final class Singleton {
    private static Singleton instance;

    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public static void test() {
        System.out.println("<Singleton>::test() is called");
    }
}
