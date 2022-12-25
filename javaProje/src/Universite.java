import java.util.ArrayList;
import java.util.Scanner;

public class Universite extends Genel {
    public void uniDuzenlemeMenusu() {
        Scanner scanner = new Scanner(System.in);
        int secim;

        System.out.println("Bölüm Seçiniz:\n" +
                "1)Mühendislik\n" +
                "2)Tıp\n" +
                "Seçiminiz: ");
        secim = scanner.nextInt();


        switch (secim) {

            case 1:
                Muhendislik muhendislik = new Muhendislik();
                muhendislik.islemSecimi();
                break;
            case 2:
                Tip tip = new Tip();
                tip.islemSecimi();
                break;
            default:
                System.out.println("Geçersiz Giriş Yapıldı");
        }
    }

    public void uniOneriMenusu() {
        Scanner scanner = new Scanner(System.in);
        int secim;

        System.out.println("Bölüm Seçiniz:\n" +
                "1)Mühendislik\n" +
                "2)Tıp\n" +
                "Seçiminiz: ");
        secim = scanner.nextInt();


        switch (secim) {

            case 1:
                Muhendislik muhendislik = new Muhendislik();
                muhendislik.oneriAl();
                break;
            case 2:
                Tip tip = new Tip();
                tip.oneriAl();
                break;
            default:
                System.out.println("Geçersiz Giriş Yapıldı");
        }
    }
}
