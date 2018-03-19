package lesson12;

import java.util.Formatter;

public class FormatDemo {
    public static void main(String[] args) {
        createString("Dezl", "Biology", 5);
    }

    public static void createString(String fullName, String subject, int mark) {
        /*Formatter f = new Formatter();
        f.format("Студент %-15s получил %3d по %10s\n", fullName, mark, subject);
        System.out.print(f);*/
        System.out.printf("Студент %-15s получил %3d по %10s\n", fullName, mark, subject);
        String str = String.format("Студент %-15s получил %3d по %10s\n", fullName, mark, subject);

        for (int i = 0; i < 10; i++) {
            System.out.print(str);
        }
    }
}
