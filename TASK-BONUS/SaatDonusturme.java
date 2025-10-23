public class SaatDonusturme {
    public static void main(String[]args){
        // store given value
        int toplamSaniye = 4000;
        //change given seconds to hour,minutes and seconds.
        int saat = toplamSaniye / 3600;
        int dakika = (toplamSaniye % 3600) / 60;
        int saniye = toplamSaniye % 60;
        // formated output.
        String sonuc = String.format("%d:%02d:%02d", saat, dakika, saniye);
        System.out.println(toplamSaniye + " saniye = " + sonuc);
    }
}
