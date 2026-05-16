package ootd;

public class Acc extends Clothes {
    public Acc(String name) {
        super("액세서리", name);
    }

    @Override
    public void wear() {
        System.out.println(name + "(을)를 씁니다.");
    }
}
