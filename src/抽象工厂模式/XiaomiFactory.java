package 抽象工厂模式;

public class XiaomiFactory implements AllFatory {
    @Override
    public IRouterProduct iRouterProduct() {
        return new XiaomiRouter();
    }

    @Override
    public IPhoneProduct phoneProduct() {
        return new XiaomiPhone();
    }
}
