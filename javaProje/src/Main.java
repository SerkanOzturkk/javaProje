public class Main {
    public static void main(String[] args) {

        System.out.println("----------Öneri Sistemine Hoş Geldiniz----------\n");

        Fizik.fizikProjeEkleme();
        Kimya.kimyaProjeEkleme();
        Biyoloji.biyolojiProjeEkleme();
        Muhendislik.muhendislikProjeEkleme();
        Tip.tipProjeEkleme();

        Genel genel = new Genel();
        genel.anaMenu();
        while (genel.getDurum()) {
            genel.anaMenu();
        }
    }

}