package lesson13;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar1 = new GregorianCalendar(1988, 12, 17);
        System.out.println(calendar1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar1.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar1.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar1.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar1.getTimeInMillis());
    }
}
