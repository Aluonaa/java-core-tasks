package chapter7;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise8 {
    public static void main(String[] args) throws IOException {
        Scanner scanner3 = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe.txt"));
        Scanner scanner4 = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe.txt"));
        Set<String> uniqueStringsOfFile2 = new HashSet<>();

        while(scanner3.hasNext())
        {
            String s = scanner3.next();
            if (!uniqueStringsOfFile2.contains(s)) {
                uniqueStringsOfFile2.add(s);
            }
        }
        while (scanner4.hasNext()){
            String s = scanner4.nextLine();
            boolean containsAllWords = true;
            for(String b: uniqueStringsOfFile2) {
                if (!s.contains(b)){
                    containsAllWords = false;
                    break;
                }
            }
            if(containsAllWords == true){
                System.out.println(s);
            }
        }
    }
}
