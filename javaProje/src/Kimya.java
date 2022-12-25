import java.util.ArrayList;
import java.util.Scanner;

public class Kimya extends Lise implements IGenelMethodlar{

    static ArrayList<String> kimyaProje = new ArrayList<String>();

    public static void kimyaProjeEkleme(){

        kimyaProje.add("Kaya Tuzundan Rafine Tuzu Elde Edilmesi");
        kimyaProje.add("Asetilen Gazının Elde Edilmesi");
        kimyaProje.add("Ham Petrolün Ayrıştırılma Methotları");
        kimyaProje.add("İdrarda Şeker Tayini Yapımı");
        kimyaProje.add("Deterjanın Çevre Bilime Etkileri");
        kimyaProje.add("Endüstride Elektroliz");
        kimyaProje.add("En Çok Kullanılan Polimerlerin Eldesi");
    }

    @Override
    public void islemSecimi(){

        int secim;
        int j = 1;
        System.out.println("\nMevcut Projeler");
        for(String prj : kimyaProje){
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
                ekle(msjEkle,kimyaProje);
                break;

            case 2 :
                scanner = new Scanner(System.in);
                int index;
                System.out.println("Silmek İstediğiniz Projenin Sırasını Giriniz: ");
                index = scanner.nextInt();
                sil(index-1,kimyaProje);
                break;

            case 3 :
                scanner = new Scanner(System.in);
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Güncellemek İstediğiniz Projenin Sırasını Giriniz: ");
                index= scanner.nextInt();
                System.out.println("Projenin Adını Giriniz: ");
                msjEkle = scanner1.nextLine();
                guncelle(index-1 , msjEkle,kimyaProje);
                break;

            default: System.out.println("Geçersiz Giriş Yapıldı");
        }
    }

    @Override
    public void oneriAl(){
        int rnd = (int)(Math.random()* kimyaProje.size());
        System.out.println("\nSizin İçin Önerdiğimiz Proje ---> "+kimyaProje.get(rnd));
    }
}
