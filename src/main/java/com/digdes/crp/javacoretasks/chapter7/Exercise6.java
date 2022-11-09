package com.digdes.crp.javacoretasks.chapter7;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        System.out.println("Предположим, у вас есть параметр метода type Map<String," +
                " Set<Integer>>, и кто-то вызывает ваш метод с помощью a HashMap<String," +
                " HashSet<Integer>>. Что происходит? Какой тип параметра вы можете" +
                " использовать вместо этого?" +
                "" +
                "Решение: в этом случае следует использовать подстановочный знак типа:" +
                " Map<String, ? extends Set<Integer>>");
    }
}
