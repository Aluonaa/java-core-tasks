package main.java.ru.furiosaming.javacoretasks.chapter12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Exercise4 {
    /** Напишите программу, выполняющую такие же функции, как и команда cal
    в Unix, выводящая календарь на текущий месяц. **/

    public static void main(String[] args) {
        displayConsoleCalendar(Calendar.JANUARY, 2023);
    }
    public static void displayConsoleCalendar(int month, int year) {
        String red = "\033[0;31m";
        String blue = "\033[0;34m";
        String reset = "\033[0m";
        Calendar calendar = new GregorianCalendar(year, month, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1); //Set the day of month to 1
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); //get day of week for 1st of month
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(new SimpleDateFormat("MMMM YYYY").format(calendar.getTime()));
        System.out.println(blue + " S  M  T  W  T  F  S" + reset);

        StringBuilder initialSpace = new StringBuilder();
        for (int i = 0; i < dayOfWeek - 1; i++) {
            initialSpace.append("   ");
        }
        System.out.print(initialSpace);

        for (int i = 0, dayOfMonth = 1; dayOfMonth <= daysInMonth; i++) {
            for (int j = ((i == 0) ? dayOfWeek - 1 : 0); j < 7 && (dayOfMonth <= daysInMonth); j++) {
                Calendar currentCalendar = new GregorianCalendar(year, month, dayOfMonth);
                int currentDayOfWeek = currentCalendar.get(Calendar.DAY_OF_WEEK);
                if (currentDayOfWeek == 7 || currentDayOfWeek == 1) {
                    System.out.printf(red + "%2d " + reset, dayOfMonth);
                }
                else {
                    System.out.printf("%2d ", dayOfMonth);
                }
                dayOfMonth++;
            }
            System.out.println(" ");
        }
    }
}
