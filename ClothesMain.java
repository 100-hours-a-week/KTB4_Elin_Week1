package ootd;
import java.util.Scanner;

public class ClothesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clothes top = null;
        Clothes bottom = null;
        Clothes acc = null;

            System.out.println("상의를 골라주세요 : ");
            System.out.println("1.블라우스 2.티셔츠 3.니트");
            int topChoice = sc.nextInt();
            switch(topChoice) {
                case 1: top = new Blouse();
                    break;
                case 2: top = new Tshirt();
                    break;
                case 3: top = new Knit();
                    break;
                default : System.out.println("잘못 선택하셨습니다.");
                    break;

            }


            System.out.println("하의를 골라주세요 : ");
            System.out.println("1.바지 2.치마");
            int bottomChoice = sc.nextInt();
            switch(bottomChoice) {
                case 1: bottom = new Pants();
                    break;
                case 2: bottom = new Skirt();
                    break;
                default : System.out.println("잘못 선택하셨습니다.");
                    break;
            }

            System.out.println("액세서리를 골라주세요 : ");
            System.out.println("1.모자 2.안경");
            int accChoice = sc.nextInt();
            switch(accChoice) {
                case 1 : acc = new Cap();
                    break;
                case 2 : acc = new Glasses();
                    break;
                default : System.out.println("잘못 선택하셨습니다.");
                    break;
            }
        System.out.println();
            top.wear();
            bottom.wear();
            acc.wear();
        System.out.println();
        System.out.println("오늘의 코디는 " + top.name + " + " + bottom.name + " + " + acc.name + "입니다.");
        System.out.println("좋은 하루 보내세요 !");
    }
}
