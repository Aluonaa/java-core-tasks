package com.digdes.crp.javacoretasks.chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise17 {
    public static void main(String[] args){
        System.out.println("Покажите, каким образом проверяемое представление может сообщить" +
                " о кон\u0002кретной ошибке, ставшей причиной загрязнения \"кучи\"." +
                "" +
                "Решение: Элементы неверного типа можно незаконным путем \n" +
                "переместить в обобщенную коллекцию (это явление называется загрязнением “кучи\"), а ошибка \n" +
                "времени выполнения возникнет при попытке извлечь, а не ввести элемент неподходящего типа в \n" +
                "такую коллекцию. Чтобы устранить подобную ошибку, следует воспользоваться проверяемым пред\u0002ставлением." +
                " Например, в том месте, где строится списочный массив типа ArrayList<String>,\n" +
                "следует построить проверяемое представление следующим образом:\n" +
                "List<String> strings = Collections.checkedList(new ArrayList(), String.class);\n" +
                "Такое представление контролирует все операции ввода элементов в список" +
                " и генерирует исключе\u0002ние, если в него вводится объект неверного типа.");
        List<Object> strings = Collections.checkedList(new ArrayList(), String.class);

        Cache cache1 = new Cache();
        strings.add(cache1);

        /** Тут при запуске появится исключение:
         * Exception in thread "main" java.lang.ClassCastException:
         * Attempt to insert class com.digdes.crp.javacoretasks.chapter7.Cache element into
         * collection with element type class java.lang.String
         */
    }
}
