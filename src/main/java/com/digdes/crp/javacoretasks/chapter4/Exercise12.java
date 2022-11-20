package com.digdes.crp.javacoretasks.chapter4;

import java.lang.reflect.Method;

public class Exercise12 {
    /** Определите отличие в производительносги обычного вызова метода от его вызова через рефлексию. **/

    private static final String STRINGFORCHECK = "erkvbhterjwqslxertbhrgedlsx;ax,cmdvefjkcwlsx;a,dverjdskopa[;dlrthrgefwdefrgtgtrnjelkd,.x";
    private static final int COUNTOFITERATIONS = 100000000;

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
        for (int i = 0; i < COUNTOFITERATIONS; i++) {
            STRINGFORCHECK.indexOf("rjd");
        }
        System.out.println("Обычный вызов метода: " + (System.currentTimeMillis() - start));


        Method method = String.class.getMethod("indexOf", String.class);
        start = System.currentTimeMillis();
        for (int i = 0; i < COUNTOFITERATIONS; i++) {
            method.invoke(STRINGFORCHECK, "rjd");
        }
        System.out.print("Вызов с помощью рефлексии: " + (System.currentTimeMillis() - start));

    }
}