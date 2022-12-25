import java.util.ArrayList;
import java.util.Scanner;

public class Biyoloji extends Lise implements IGenelMethodlar{

    static ArrayList<String> biyolojiProje = new ArrayList<String>();

    public static void biyolojiProjeEkleme(){

        biyolojiProje.add("Gen Teknolojilerinin Araştırılması");
        biyolojiProje.add("Endemik Bir Türün Tanıtımı");
        biyolojiProje.add("Bitkilerde Geotropizma");
        biyolojiProje.add("Türkiyede Doku ve Organ Nakilleri");
        biyolojiProje.add("Hayatın Başlangıcı ve Evrim");
        biyolojiProje.add("DNA Parmak İzi Analizi");
        biyolojiProje.add("Genetik Mühendisliğinin Araştırma Alanları");
    }
    @Override
    public void islemSecimi(){

        int secim;
        int j = 1;
        System.out.println("\nMevcut Projeler");
        for(String prj : biyolojiProje){
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
                ekle(msjEkle,biyolojiProje);
                break;

            case 2 :
                scanner = new Scanner(System.in);
                int index;
                System.out.println("Silmek İstediğiniz Projenin Sırasını Giriniz: ");
                index = scanner.nextInt();
                sil(index-1,biyolojiProje);
                break;

            case 3 :
                scanner = new Scanner(System.in);
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Güncellemek İstediğiniz Projenin Sırasını Giriniz: ");
                index= scanner.nextInt();
                System.out.println("Projenin Adını Giriniz: ");
                msjEkle = scanner1.nextLine();
                guncelle(index-1 , msjEkle,biyolojiProje);
                break;

            default: System.out.println("Geçersiz Giriş Yapıldı");
        }
    }

    @Override
    public void oneriAl(){
        int rnd = (int)(Math.random()* biyolojiProje.size());
        System.out.println("\nSizin İçin Önerdiğimiz Proje ---> "+biyolojiProje.get(rnd));
    }
}
