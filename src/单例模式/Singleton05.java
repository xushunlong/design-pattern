package 单例模式;

/**
 * 静态内部类
 */
public class Singleton05 {

    private static class SingletonInstance {
        private static final Singleton05 INSTANCE = new Singleton05();
    }

    public static Singleton05 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
