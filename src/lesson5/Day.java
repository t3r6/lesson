package lesson5;

public class Day {
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]);
        if (i == 1) {
            System.out.println("Monday");
        } else if (i == 2) {
            System.out.println("Tuesday");
        } else if (i == 3) {
            System.out.println("Wednesday");
        } else if (i == 4) {
            System.out.println("Thursday");
        } else if (i == 5) {
            System.out.println("Friday");
        } else if (i == 6 || i == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Incorrect number");
        }
    }
}
