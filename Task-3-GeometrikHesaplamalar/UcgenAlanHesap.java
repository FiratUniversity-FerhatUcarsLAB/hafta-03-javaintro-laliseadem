public class UcgenAlanHesap {
    public static void main (String[]args){
        // store the value of the rectangle side using different variables
        double a = 3;
        double b = 4;
        double c = 5;
        //calculate the "s" of Heron formula
        double s = (a+b+c)/2;
        // calculate the area using Heron formula
        double alan =Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
        System.out.println("Alan: " + alan);

    }
}
