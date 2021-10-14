package 适配器模式;

public class Worker {
    public void net(Adapter adapter){
        adapter.handlerRequest();
    }
}
