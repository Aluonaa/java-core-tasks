package com.digdes.crp.javacoretasks.chapter13;

import java.awt.*;
import java.text.MessageFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.ResourceBundle;

public class Exercise9 {
    /** Попробуйте осуществить интернационализацию всех сообщений в одной из
    ваших прикладных программ хотя бы на двух языках, используя комплекты
    ресурсов. **/

    public static void main(String[] args) {

        double money = 3000.0;
        String template ="Your current total is {0,number,currency}.";


        Locale localeFrance = Locale.FRANCE;
        Locale localeUS = Locale.US;
        ResourceBundle bundleFrance =
                ResourceBundle.getBundle("com.digdes.crp.javacoretasks.chapter13.MyAppResources_fr_FR", localeFrance);
        ResourceBundle bundleUS =
                ResourceBundle.getBundle("com.digdes.crp.javacoretasks.chapter13.MyAppResources_en", localeUS);


//        ResourceBundle resFrance = ResourceBundle.getBundle("MyAppResources_en");
//        ResourceBundle resUS = ResourceBundle.getBundle("MyAppResources_fr");
//        Locale localeFrance = (Locale) resFrance.getObject("locale");
//        Locale localeUS = (Locale) resUS.getObject("locale");

        Currency currencyFrance = (Currency) bundleFrance.getObject("currency");
        Currency currencyUS = (Currency) bundleUS.getObject("currency");

        MessageFormat mfFrance = new MessageFormat(template, localeFrance);
        String messageFrance = mfFrance.format(new Object[]{ money, currencyFrance});
        System.out.println(messageFrance);

        MessageFormat mfUS = new MessageFormat(template, localeUS);
        String messageUS = mfUS.format(new Object[]{ money, currencyUS});
        System.out.println(messageUS);

//        ResourceBundle bundle =
//                ResourceBundle.getBundle("com.mycompany.MyAppResources", localeFrance);
//        Color backgroundColor = (Color) bundle.getObject("backgroundColor");
//        double[] paperSize = (double[]) bundle.getObject("defaultPaperSize");




    }

}
