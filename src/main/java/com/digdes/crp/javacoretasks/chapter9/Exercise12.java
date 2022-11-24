package com.digdes.crp.javacoretasks.chapter9;

import com.digdes.crp.javacoretasks.chapter3.Employee;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise12 {

    /** Придумайте реальный пример применения ссылок на группы в методе
     Matcher.replaceAll() и реализуйте его на практике. **/

    public static void main(String[] args) {

        String text = "Октябрь, уж наступил — уж роща отр,яхает\n" +
                "Последн,ие листы с нагих своих вет,вей;\n" +
                "Дохнул осенний хлад — дорога промерзает.\n" +
                "Журча, еще бежит за мельницу ру,чей,\n" +
                "Но пруд уж,е застыл; сосед мой поспешает\n" +
                "В отъезжие поля с охотою своей,\n" +
                "И страждут о,зими от бешеной забавы,\n" +
                "И будит лай собак уснувшие ,дубравы.";

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("src/main/resources/textFiles/9.12.bin")))
        {
            objectOutputStream.writeObject(text);
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(
            new FileInputStream("src/main/resources/textFiles/9.12.bin")))
    {
        String regex = ",";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence) objectInputStream.readObject());
        String result = matcher.replaceAll("");
        System.out.println(result);
    } catch (IOException | ClassNotFoundException fileNotFoundException) {
        fileNotFoundException.printStackTrace();
    }

    }
}
