public class DaireHesap {
    public static void main (String[]args){
        double r = 5.5;
        // calculate the area
        double alan = Math.pow(r,2) * Math.PI;
        // calculate the circumstance
        double cevre = 2 * Math.PI * r;
        //print the results
        System.out.println ("Yericap: " + r) ;
        System.out.println("Alan: " + alan);
        System.out.println("cevre: " + cevre);
    }
}
