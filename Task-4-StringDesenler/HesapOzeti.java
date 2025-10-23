public class HesapOzeti {
    public static void main(String[] args) {
        // use '=' sign to drow horizontal line.
        System.out.println("======================================");
        // use '|' to drow vertical line.
        System.out.println("|      Ürün    | Miktar  |  Fiyat   |");
        System.out.println("======================================");
        System.out.println("| Muz          |   2 kg  |  90 TL   |");
        System.out.println("| Ayran        |   1 lt  |  10 TL   |");
        System.out.println("| Süt          |   2 lt  |  40 TL   |");
        System.out.println("| Cekirdek     |   1 kg  |  45 TL   |");
        System.out.println("======================================");
        //calculate the the total price.
        System.out.println("| Toplam Tutar:| " +  (90 + 10 + 40 + 45) + " TL");
        System.out.println("======================================");
    }
}
