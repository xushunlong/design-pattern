package 单例模式;

/**
 * 通过枚举创建
 */
public class Singleton06 {
    private Singleton06() {

    }

    /**
     * 枚举类型是线程安全的，并且只会装载一次
     */
    private enum Singleton {
        INSTANCE;

        private final Singleton06 instance;

        Singleton() {
            instance = new Singleton06();
        }

        private Singleton06 getInstance() {
            return instance;
        }
    }

    public static Singleton06 getInstance() {

        return Singleton.INSTANCE.getInstance();
    }

}

