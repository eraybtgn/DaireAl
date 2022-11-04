import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double yariCap;
        double pi=3.14;
        System.out.println("Yarı çapı giriniz..");
        Scanner scan= new Scanner(System.in);
        yariCap=scan.nextInt();
        double alan=pi*(Math.pow(yariCap,2));
        double cevre= 2*pi*yariCap;
        System.out.println("Dairenin alanı:"+alan+" ve çevresi:"+cevre);
    }
}
