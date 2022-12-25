import java.util.ArrayList;
import java.util.Scanner;

public class Muhendislik extends Lise implements IGenelMethodlar{

    static ArrayList<String> muhendislikProje = new ArrayList<String>();

    public static void muhendislikProjeEkleme(){

        muhendislikProje.add("Uyandırma Programı");
        muhendislikProje.add("Psikolojik Test Sitesi");
        muhendislikProje.add("Akademik Rota Önerici");
        muhendislikProje.add("Termal Kamera ile Uyku Tespiti");
        muhendislikProje.add("Yolcu Mobil Şikayet");
        muhendislikProje.add("Gasp Alarmı");
        muhendislikProje.add("Cam Kırılma Dedektörü");
        muhendislikProje.add("Mikro Denetleyicili Güvenlik Sistemi");
        muhendislikProje.add("Dijital Anemometre");
        muhendislikProje.add("Optik Termometre");
    }
    @Override
    public void islemSecimi(){

        int secim;
        int j = 1;
        System.out.println("\nMevcut Projeler");
        for(String prj : muhendislikProje){
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
                ekle(msjEkle,muhendislikProje);
                break;

            case 2 :
                scanner = new Scanner(System.in);
                int index;
                System.out.println("Silmek İstediğiniz Projenin Sırasını Giriniz: ");
                index = scanner.nextInt();
                sil(index-1,muhendislikProje);
                break;

            case 3 :
                scanner = new Scanner(System.in);
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Güncellemek İstediğiniz Projenin Sırasını Giriniz: ");
                index= scanner.nextInt();
                System.out.println("Projenin Adını Giriniz: ");
                msjEkle = scanner1.nextLine();
                guncelle(index-1 , msjEkle,muhendislikProje);
                break;

            default: System.out.println("Geçersiz Giriş Yapıldı");
        }
    }

    @Override
    public void oneriAl(){
        int rnd = (int)(Math.random()* muhendislikProje.size());
        System.out.println("\nSizin İçin Önerdiğimiz Proje ---> "+muhendislikProje.get(rnd));
    }
}
