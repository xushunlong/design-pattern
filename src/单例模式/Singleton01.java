package 单例模式;

/**
 * 饿汉式
 */
public class Singleton01 {

    private static final Singleton01 instance = new Singleton01();

    public static Singleton01 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton01 intance = Singleton01.getInstance();
        Singleton01 intance2 = Singleton01.getInstance();
        System.out.println(intance == intance2);
    }
}
