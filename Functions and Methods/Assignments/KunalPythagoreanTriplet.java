// KunalPythagoreanTriplet.java
public class KunalPythagoreanTriplet {
    private int a;
    private int b;
    private int c;

    public static boolean isPythagoreanTriplet(double a, double b, double c) {
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            return true;
        }
        else {
            return false;
        }
    }
}