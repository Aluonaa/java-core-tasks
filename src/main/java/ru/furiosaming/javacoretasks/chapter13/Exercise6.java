package main.java.ru.furiosaming.javacoretasks.chapter13;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Exercise6 {

    /** Напишите программу, выводящую списком все денежные единицы,
     *  обозначаемые разными знаками хотя бы в двух региональных настройках **/

    public static void main(String[] args) {

        NumberFormat dollarFormatter =
                NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat euroFormatter =
                NumberFormat.getCurrencyInstance(Locale.GERMANY);

        euroFormatter.setCurrency(Currency.getInstance("EUR"));
        dollarFormatter.setCurrency(Currency.getInstance("USD"));
        double money = 3000.0;
        System.out.println(dollarFormatter.format(money));
        System.out.println(euroFormatter.format(money));
    }
}
