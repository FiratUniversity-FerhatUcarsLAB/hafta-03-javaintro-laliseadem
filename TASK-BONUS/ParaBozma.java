public class ParaBozma {
    public static void main(String[] args) {
        int miktar = 873; // Örnek tutar (TL)
        int yuzluk = miktar / 100;
        miktar = miktar% 100;
        int ellilik = miktar / 50;
        miktar = miktar% 50;
        int yirmilik = miktar / 20;
        miktar= miktar % 20;
        int onluk = miktar / 10;
        miktar= miktar% 10;
        int beslik = miktar / 5;
        miktar= miktar% 5;
        int birlik = miktar;

        System.out.println("873 TL = " + yuzluk + "x100, " + ellilik + "x50, " + yirmilik + "x20, " + onluk + "x10, " + beslik + "x5, " +
                birlik + "x1");
    }
}
