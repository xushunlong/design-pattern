package 抽象工厂模式;

public class XiaomiPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("开机。。。");
    }

    @Override
    public void end() {
        System.out.println("关机。。。");
    }

    @Override
    public void callUp() {
        System.out.println("打电话。。。");
    }
}
