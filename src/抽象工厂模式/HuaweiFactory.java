package 抽象工厂模式;

public class HuaweiFactory implements AllFatory {
    @Override
    public IRouterProduct iRouterProduct() {
        return new HuaWeiRouter();
    }

    @Override
    public IPhoneProduct phoneProduct() {
        return new HuaWeiPhone();
    }
}
