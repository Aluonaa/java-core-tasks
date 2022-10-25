package chapter1;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lookingForCharsOutOfASCII = scanner.nextLine();
        for (int i = 0; i < lookingForCharsOutOfASCII.length(); i++) {
            char currentChar = lookingForCharsOutOfASCII.charAt(i);
            if (!StandardCharsets.US_ASCII.newEncoder().canEncode(currentChar)) {
                int code = currentChar;
                System.out.println(code);
            }
        }
    }
}