package 单例模式;

/**
 * 懒汉式，加sync锁，线程安全但是效率低
 */
public class Singleton03 {
    private static Singleton03 intance;

    private static synchronized Singleton03 getInstance(){
        if(intance == null){
            intance = new Singleton03();
        }
        return intance;
    }

    public static void main(String[] args) {

    }
}
