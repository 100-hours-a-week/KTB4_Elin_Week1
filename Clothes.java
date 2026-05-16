package ootd;

public class Clothes implements Wearable {
    String category;
    String name;

    public Clothes(String category, String name) {
        this.category = category;
        this.name = name;
    }

    @Override
    public void wear() {
        System.out.println(name + "를 입습니다.");
    }
}
