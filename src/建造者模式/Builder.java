package 建造者模式;

public abstract class Builder {
    abstract Builder builderA(String msg);
    abstract Builder builderB(String msg);
    abstract Builder builderC(String msg);
    abstract Builder builderD(String msg);

    abstract Product getRroduct();
}
