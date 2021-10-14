package 适配器模式;

public class Adapter implements NetToUsb{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void handlerRequest() {
        adaptee.handleNet();
    }
}
