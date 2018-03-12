package lesson11;

public class DoubleDemo {
    public static void main(String[] args) {
        Double double1 = new Double(2.0);
        Double double2 = new Double("2.0");
        Double double3 = Double.valueOf(3.0);
        Double double4 = Double.valueOf("3.0");
        double double5 = Double.parseDouble("6.24");
        Double double6 = 2.3;
        Double double7 = 3.0;
        System.out.println(double1 + " " + double2 + " " + double3 + " " + double4 + " " + double5 + " " + double6);
    }
}
