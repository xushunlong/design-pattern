package 工厂模式;

public class Factory {
    private Shape shape;

    Factory(String type) {
        if (type == "shape1") {
            shape = new Shape1();
        } else if (type == "shape2") {
            shape = new Shape2();
        }
    }
}

interface Shape {
    void drow();
}

class Shape1 implements Shape {

    @Override
    public void drow() {
        System.out.println("shape1 draw ...");
    }
}

class Shape2 implements Shape {

    @Override
    public void drow() {
        System.out.println("shape2 draw ...");
    }
}