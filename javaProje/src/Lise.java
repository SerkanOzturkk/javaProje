import java.util.ArrayList;
import java.util.Scanner;

public class Lise extends Genel {

    Scanner scanner = new Scanner(System.in);

    public void liseDuzenlemeMenusu() {

        int secim;

        System.out.println("Ders seçiniz:\n" +
                "1)Fizik\n" +
                "2)Kimya\n" +
                "3)Biyoloji\n" +
                "Seçiminiz: ");
        secim = scanner.nextInt();


        switch (secim) {

            case 1:
                Fizik fizik = new Fizik();
                fizik.islemSecimi();
                break;
            case 2:
                Kimya kimya = new Kimya();
                kimya.islemSecimi();
                break;
            case 3:
                Biyoloji biyoloji = new Biyoloji();
                biyoloji.islemSecimi();
                break;
            default:
                System.out.println("Geçersiz Giriş Yapıldı");
        }
    }


    public void liseOneriMenusu() {

        int secim;

        System.out.println("Ders seçiniz:\n" +
                "1)Fizik\n" +
                "2)Kimya\n" +
                "3)Biyoloji\n" +
                "Seçiminiz: ");
        secim = scanner.nextInt();


        switch (secim) {

            case 1:
                Fizik fizik = new Fizik();
                fizik.oneriAl();
                break;
            case 2:
                Kimya kimya = new Kimya();
                kimya.oneriAl();
                break;
            case 3:
                Biyoloji biyoloji = new Biyoloji();
                biyoloji.oneriAl();
                break;
            default:
                System.out.println("Geçersiz Giriş Yapıldı");
        }
    }

}
