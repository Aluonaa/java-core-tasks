package chapter7;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args)throws IOException {
        Scanner scanner5 = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe.txt"));
        List<String> stringList = new ArrayList<>();
        while(scanner5.hasNext())
        {
            String s = scanner5.next();
            stringList.add(s);
        }
        Collections.shuffle(stringList.subList(1, stringList.size()-1));
        System.out.println(stringList);
    }
}
