public class VucutkitleIndeksi {
    public static void main(String[] args) {
        //Given values for mass and height
        double kilo = 75;
        double boy = 1.70;
        //calculate body mass index
        double bmi = kilo / (boy * boy);
        System.out.printf("Vücut Kitle İndeksi (BMI): %.2f\n", bmi);
    }
}
