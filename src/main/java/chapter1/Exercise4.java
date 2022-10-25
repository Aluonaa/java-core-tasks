package chapter1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        double numDouble = Math.nextUp(0f);
        System.out.println(numDouble);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_NORMAL);

        double d = 2147483648.0;
        int a = (int) d;
        System.out.println(a);
    }
}
