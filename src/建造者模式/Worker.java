package 建造者模式;

public class Worker extends Builder {

    private Product product;

    Worker() {
        product = new Product();
    }

    @Override
    Builder builderA(String msg) {
        product.setA(msg);
        return this;
    }

    @Override
    Builder builderB(String msg) {
        product.setB(msg);
        return this;
    }

    @Override
    Builder builderC(String msg) {
        product.setC(msg);
        return this;
    }

    @Override
    Builder builderD(String msg) {
        product.setD(msg);
        return this;
    }

    @Override
    Product getRroduct() {
        return product;
    }
}
