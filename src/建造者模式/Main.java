package 建造者模式;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println(worker.builderA("A_").builderB("B_").getRroduct().toString());
    }
}
