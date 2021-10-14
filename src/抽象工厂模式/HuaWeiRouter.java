package 抽象工厂模式;

public class HuaWeiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("开机...");
    }

    @Override
    public void end() {
        System.out.println("关机...");
    }

    @Override
    public void openWifi() {
        System.out.println("打开Wi-Fi...");
    }
}
