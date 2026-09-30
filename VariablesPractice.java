public class VariablesPractice {
    public static void main(String[] args) {
int yas = 20;
        System.out.println(yas);
        yas = 21;
        System.out.println(yas);
        int fiyat = 150;
        System.out.println(fiyat);
        String isim = "İbrahim";
        System.out.println(isim);
        System.out.println("Benim adım " + isim + " ve yasım "+ yas);
        int adet = 6;
        int birimfiyat = 25;
        int toplamtutar = adet*birimfiyat;
        System.out.println("Toplam ödeme " + toplamtutar + " TL ");
        if (yas >= 18) {
            System.out.println("Ehliyet alabilirsin.");
        }
         else {
            System.out.println("Ehliyet için yaşın yetmiyor.");
        }
    }
}
