package 单例模式;

/**
 * 懒汉式，双重检索机制
 */
public class Singleton04 {
    private static volatile Singleton04 intance;

    private static Singleton04 getInstance(){
        if(intance == null){
            synchronized (Singleton04.class){
                if(intance == null){
                    intance = new Singleton04();
                }
            }
        }
        return intance;
    }
}
