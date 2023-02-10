package main.java.ru.furiosaming.javacoretasks.chapter13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Exercise1 {

    /** Напишите программу, демонстрирующую стили форматирования даты и
    времени во французском, китайском и тайском представлении **/

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();

        Locale localeFrance = Locale.FRANCE;
        Locale localeChina = Locale.CHINA;
        Locale localeThailand =  Locale.forLanguageTag("th-TH-u-nu-thai");

        DecimalStyle styleThailand = DecimalStyle.of(localeThailand);
        DecimalStyle styleFrance = DecimalStyle.of(localeFrance);
        DecimalStyle styleChina = DecimalStyle.of(localeChina);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println(formatter.withLocale(localeThailand).withDecimalStyle(styleThailand).format(dateTime));
        System.out.println(formatter.withLocale(localeFrance).withDecimalStyle(styleFrance).format(dateTime));
        System.out.println(formatter.withLocale(localeChina).withDecimalStyle(styleChina).format(dateTime));
    }
}
