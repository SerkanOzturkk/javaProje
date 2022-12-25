import java.util.ArrayList;
import java.util.Scanner;

public class Tip extends Lise implements IGenelMethodlar{

    static ArrayList<String> tipProje = new ArrayList<String>();

    public static void tipProjeEkleme(){

        tipProje.add("Nadir Genetik Hastalıklar");
        tipProje.add("Alzheimer Hastalıkları ile Mücadele");
        tipProje.add("Tıpta Yapay Doku Kullanımı");
        tipProje.add("Lazer ile Tedavi");
        tipProje.add("Tıpta Yapay Zekanın Kullanımı");
        tipProje.add("Hayvanlar Üzerinde Çalışma Etiği");
        tipProje.add("Uyku Kalitesinin Önemi");
        tipProje.add("Modern Yaşamın Halk Sağlığına Etkisi");
    }
    @Override
    public void islemSecimi(){

        int secim;
        int j = 1;
        System.out.println("\nMevcut Projeler");
        for(String prj : tipProje){
            System.out.print(j+"=> ");
            System.out.println(prj);
            j++;
        }

        System.out.println("\nYapmak İstediğiniz İşlem:\n" +
                "1)Yeni Proje Ekle\n" +
                "2)Proje Sil\n" +
                "3)Proje Güncelle\n" +
                "Seçiminiz: ");
        secim = scanner.nextInt();

        switch (secim){

            case 1 :
                Scanner scanner = new Scanner(System.in);
                String msjEkle;
                System.out.println("Eklemek İstediğiniz Proje Adını Giriniz: ");
                msjEkle= scanner.nextLine();
                ekle(msjEkle,tipProje);
                break;

            case 2 :
                scanner = new Scanner(System.in);
                int index;
                System.out.println("Silmek İstediğiniz Projenin Sırasını Giriniz: ");
                index = scanner.nextInt();
                sil(index-1,tipProje);
                break;

            case 3 :
                scanner = new Scanner(System.in);
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Güncellemek İstediğiniz Projenin Sırasını Giriniz: ");
                index= scanner.nextInt();
                System.out.println("Projenin Adını Giriniz: ");
                msjEkle = scanner1.nextLine();
                guncelle(index-1 , msjEkle,tipProje);
                break;

            default: System.out.println("Geçersiz Giriş Yapıldı");
        }
    }

    @Override
    public void oneriAl(){
        int rnd = (int)(Math.random()* tipProje.size());
        System.out.println("\nSizin İçin Önerdiğimiz Proje ---> "+tipProje.get(rnd));
    }
}
