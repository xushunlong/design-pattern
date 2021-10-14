package 适配器模式;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.net(new Adapter());
    }
}
