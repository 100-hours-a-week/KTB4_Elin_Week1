package ootd;

public class ClothesMain {
    public static void main(String[] args) {
        MenuView menu = new MenuView();

        int topChoice = menu.getTop();
        int bottomChoice = menu.getBottom();
        int accChoice= menu.getAcc();

        Clothes top = ClothesFactory.createTop(topChoice);
        Clothes bottom = ClothesFactory.createBottom(bottomChoice);
        Clothes acc = ClothesFactory.createAcc(accChoice);

        System.out.println();
        top.wear();
        bottom.wear();
        acc.wear();

        System.out.println("오늘의 코디는 " + top.getName() + " + " + bottom.getName() + " + " + acc.getName() + "입니다.");
        System.out.println("좋은 하루 보내세요 !");
    }
}
