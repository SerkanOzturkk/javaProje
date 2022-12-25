import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Genel {
    private boolean durum;

    public boolean getDurum() {
        return durum;
    }

    public void setDurum() {
        this.durum = true;
    }

    public void ekle(String mesaj, ArrayList arrayy) {
        arrayy.add(mesaj);
    }

    public void sil(int ind, ArrayList arrayy) {
        arrayy.remove(ind);
    }

    public void guncelle(int index, String mesaj, ArrayList arrayy) {
        arrayy.set(index, mesaj);
    }

    public void anaMenu() {

        int secim1, secim2, secim3;

        setDurum();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nYapmak İstediğiniz İşlemi Seçiniz: ");
        System.out.println("1) Önerileri Düzenle");
        System.out.println("2) Öneri Al");
        System.out.println("3) Çıkış");
        System.out.println("Seçiminiz: ");
        secim1 = scanner.nextInt();

        if (secim1 == 1) {
            System.out.println("Hangisinde düzenleme yapmak istiyorsunuz?\n" +
                    "1)Lise\n" +
                    "2)Üniversite\n" +
                    "Seçiminiz: ");
            secim2 = scanner.nextInt();

            switch (secim2) {
                case 1:
                    Lise lise = new Lise();
                    lise.liseDuzenlemeMenusu();
                    break;

                case 2:
                    Universite universite = new Universite();
                    universite.uniDuzenlemeMenusu();
                    break;

                default:
                    System.out.println("Geçersiz Giriş Yapıldı");

            }
        } else if (secim1 == 2) {
            System.out.println("Hangisinden öneri almak istiyorsunuz?\n" +
                    "1)Lise\n" +
                    "2)Üniversite\n" +
                    "Seçiminiz: ");
            secim3 = scanner.nextInt();

            switch (secim3) {
                case 1:
                    Lise lise = new Lise();
                    lise.liseOneriMenusu();
                    break;

                case 2:
                    Universite universite = new Universite();
                    universite.uniOneriMenusu();
                    break;

                default:
                    System.out.println("Geçersiz Giriş Yapıldı");

            }
        } else if (secim1 == 3) {
            durum = false;
        }

    }

}
