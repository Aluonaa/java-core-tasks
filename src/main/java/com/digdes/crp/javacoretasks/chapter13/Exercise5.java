package com.digdes.crp.javacoretasks.chapter13;

import java.util.*;

public class Exercise5 {
    /** Повторите предыдущее упражнение для наименований денежных единиц.
     *  **/
    public static void main(String[] args) {
        Set<Currency> currencies = Currency.getAvailableCurrencies();
        for(Currency currency: currencies){
            System.out.println(currency.getDisplayName());
        }
    }
}
