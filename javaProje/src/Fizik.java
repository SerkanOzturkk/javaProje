import java.util.ArrayList;
import java.util.Scanner;

public class Fizik extends Lise implements IGenelMethodlar{

    static ArrayList<String> fizikProje = new ArrayList<String>();
    public static void fizikProjeEkleme(){

        fizikProje.add("Newton Sarkacı Yapımı");
        fizikProje.add("Yerçekimi Kuvveti ile Çalışan Mancınık");
        fizikProje.add("Karadelik Modeli");
        fizikProje.add("Rüzgar Enerjisi ile Çalışan Çıkrık");
        fizikProje.add("Galvonometre Yapımı");
        fizikProje.add("Hidrolik Vinç Yapımı");
        fizikProje.add("Manyetik Salıncak Yapımı");
    }
    @Override
    public void islemSecimi(){

        int secim;
        int j = 1;
        System.out.println("\nMevcut Projeler");
        for(String prj : fizikProje){
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
                ekle(msjEkle,fizikProje);
                break;

            case 2 :
                scanner = new Scanner(System.in);
                int index;
                System.out.println("Silmek İstediğiniz Projenin Sırasını Giriniz: ");
                index = scanner.nextInt();
                sil(index-1,fizikProje);
                break;

            case 3 :
                scanner = new Scanner(System.in);
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Güncellemek İstediğiniz Projenin Sırasını Giriniz: ");
                index= scanner.nextInt();
                System.out.println("Projenin Adını Giriniz: ");
                msjEkle = scanner1.nextLine();
                guncelle(index-1 , msjEkle,fizikProje);
                break;

            default: System.out.println("Geçersiz Giriş Yapıldı");
        }
    }
   @Override
    public void oneriAl(){
        int rnd = (int)(Math.random()* fizikProje.size());
        System.out.println("\nSizin İçin Önerdiğimiz Proje ---> "+fizikProje.get(rnd));
    }
}
