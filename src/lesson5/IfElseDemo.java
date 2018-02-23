package lesson5;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            checkNumber(i);
        }
    }

    private static void checkNumber(int i) {
        if (i > 0 && i < 10) {
            System.out.println("Положительное число меньше 10");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }

}
