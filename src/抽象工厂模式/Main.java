package 抽象工厂模式;

public class Main {
    public static void main(String[] args) {
        System.out.println("创建小米产品===");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        xiaomiFactory.iRouterProduct().openWifi();
        xiaomiFactory.phoneProduct().callUp();
    }
}
