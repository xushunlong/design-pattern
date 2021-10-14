package 单例模式;

/**
 * 饿汉式，静态代码块的方式
 */
public class Singleton02 {

    private static  Singleton02 instance;

    static {
        instance = new Singleton02();
    }

    public static Singleton02 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton01 intance = Singleton01.getInstance();
        Singleton01 intance2 = Singleton01.getInstance();
        System.out.println(intance == intance2);
    }
}
