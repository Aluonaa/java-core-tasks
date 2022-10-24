import chapterFour.Rectangle;
import chapterSix.Stack;
import chapterTwo.Car;
import chapterTwo.Invoice;
import chapterTwo.RandomNumbers;
import org.omg.CORBA.IntHolder;

import javax.imageio.stream.ImageOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        int number;
        Scanner scanner = new Scanner(System.in);


        /** 1.1 **/
//        System.out.println("Задание 1. Введите целое число:");
//        number = scanner.nextInt();
//        String s2 = Integer.toBinaryString(number);
//        String s8 = Integer.toOctalString(number);
//        String s16 = Integer.toHexString(number);
//        System.out.println("Двоичная система: " + s2 + "  Восьмеричная система: " + s8 + "  Шестнадцатеричная система: " + s16);
//
        /** 1.2 **/
//        System.out.println("Задание 2. Введите значение угла:");
//        number = scanner.nextInt();
//        if (number < 0) {
//            number = 0;
//        }
//        else {
//            //number = number % 360; // способ 1
//            number = Math.floorMod(number, 360); // способ 2
//        }
//        System.out.println(number);
        /** 1.3 **/
//        System.out.println("Задание 3. Введите три числа:");
//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        int number3 = scanner.nextInt();
//        if(number1>=number2 && number1>=number3){
//            number = number1;
//        }
//        else if(number2>=number1 && number2>=number3){
//            number = number2;
//        }
//        else number = number3;
//
//        System.out.println(number);
//
//        // Метод 2: Math.max
//        System.out.println("Задание 3. Метод 2 ");
//        number = Math.max(number1, number2);
//        number = Math.max(number, number3);
//
//        System.out.println(number);
//
        /** 1.4 **/
//
//        System.out.println("Задание 4");
//        double numDouble = Math.nextUp(0f);
//        System.out.println(numDouble);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.MIN_NORMAL);
//
//        double d = 2147483648.0;
//        int a = (int) d;
//        System.out.println(a);

        /** 1.5 **/
//        Если привести числовое значение типа double к значению типа int, которое больше
//        самого большого значения типа int последние разряды(превышающие максимальное значение int),
//        будут отброшены, а последняя цифра будет уменьшена до 7(если она была больше),
//        таким образом число будет равно 2147483647, то есть число без появления ошибок
//        будет приведено к верхней границе int, это может создавать потенциально опасные
//        ситуации при расчетах, подобные особенности необходимо учитывать.
//
        /** 1.6 **/
//        System.out.println("Задание 6. Введите число для вычисления факториала: ");
//        int factori = scanner.nextInt();
//        BigInteger bigInteger = BigInteger.ONE; // При вычислении факториала минимальный результат 1
//        for(int r=1; r<=factori; r++){
//            bigInteger = bigInteger.multiply(BigInteger.valueOf(r));
//        }
//        System.out.println(bigInteger);
//
        /** 1.7 **/
//        System.out.println("Задание 7. Введите числа short: ");
//        short one = scanner.nextShort();
//        short two = scanner.nextShort();
//
//        System.out.println((short) (one + two));
//        System.out.println((short) (one * two));
//        System.out.println((short) (one / two));
//        System.out.println((short) (one % two));
//        System.out.println((short) (one - two));
//
        /** 1.8 **/
//        String stroka = scanner.nextLine();
//        int length = stroka.length();
//        for(int i=0; i<length; i++){
//            stroka = stroka.replaceAll(" ","");
//        }
//        System.out.println(stroka);
//
        /** 1.9 **/
//        В разделе 1.5.3 был приведен пример сравнения двух символьных строк s и t
//        при вызове метода s . equals (t), но не с помощью операции s == t. Придумайте
//        другой пример, в котором не применяется метод substring (). 
//
//        Решение: требуются примеры, когда сравнение двух символьно одинаковых строк
//        методом == даст отрицательный результат.
//
//        1.В случае, если две символьно одинаковые строки создаются через конструктор new String("Строка").
//
//        2. В случае, когда одна строка создается конструктором, а вторая, например, получается с помощью
//        System.out.println("Строка") и уходит в стринг пул (или берется оттуда, если она там уже была),
//        сравнение в виде == также даст отрицательный результат.
//
//        3. Строка, созданная конструктором + строка, созданная через String s = "Строка"; (Тот же случай)
//
//        4. Случай, когда строка или обе строки являются вычисляемыми (если только в конце не добаляется intern())
//



        /** 1.11 **/
//
//        String stroka = scanner.nextLine();
//        for(int i=0; i<stroka.length(); i++){
//            char d = stroka.charAt(i);
//            if(!StandardCharsets.US_ASCII.newEncoder().canEncode(d)){
//                int code = (int) d;
//                System.out.println(code);
//            }
//        }
//        /** 1.12 **/
//
//
        /** 1.13 **/
//
//        List<Integer> integerList = new ArrayList<>();
//        for(int i=1; i<=49; i++){
//            integerList.add(i);
//        }
//        int size = 49;
//        List<Integer> newIntegerList = new ArrayList<>();
//        Random random = new Random();
//        for(int i=0; i<6; i++) {
//            int deletedNumber = (random.nextInt(size)+1)%size;
//            integerList.remove(random.nextInt(size));
//            size--;
//            newIntegerList.add(deletedNumber);
//        }
//        Collections.sort(newIntegerList);
//        System.out.println(newIntegerList);
//        }

        /** 2.2 **/
//        Проанализируйте метод nextlnt() из класса S c a n n e r. Является ли он методом
//        доступа или модифицирующим методом и почему? А что можно сказать о методе n e x t l n t () из класса Random
//
//        Решение: метод класса Scanner является модифицирующим, так как при исключении
//        NumberFormatException меняется поле position. Также он является считывает информацию,
//        вводимую пользователем, поэтому является методом доступа.
//        Метод класса Random является модифицирующим, так как в процессе генерирования
//        псевдорандома меняется поле seed.
//

        /** 2.3 **/
//        Может ли модифицирующий метод вообще возвращать что-нибудь, кроме
//        типа void ? Можно ли создать метод доступа с возвращаемым типом void , т.е.
//        ничего фактически не возвращающий? Приведите по возможности примеры
//        таких методов
//
//        Решение: ответ на оба вопроса - да, может. В первом случае тип возвращаемого значения
//        вообще никак не характеризует метод как модифицирующий или не модифицирующий.
//        Для него оценивается сам факт модификации объекта, для которого был вызван метод.
//        Во втором вопросе да, потому что доступ к полю, например, может быть получен путем
//        присваивания ссылки на это поле другому полю. Внешнему. То есть в метод должно
//        передаваться поле с изменяемым типом, которое  при присваивании скопирует ссылку первого поля.
//        Тогда ничего возвращать не нужно.


        /** 2.4 **/
//        Почему в Java нельзя реализовать метод, меняющий местами содержимое двух
//        переменных типа int ? Можно ли поменять местами содержимое двух объектов типа Integer?

//        Решение: потому что переменные в метод будут передаваться по значению. То есть значение просто будет
//        скопировано. А старое переданное значение не изменится.  поменять местами содержимое двух объектов типа Integer
//        нельзя, так как оболочки всех типов являются неизменяемыми. Это из-за отсутствия эквивалента setValue. Данное устройство
//        позволяет повысить безопасность и избежать постоянного контроля за методами, в случае, если они вдруг изменят данные
//        оболочки

        /** 2.9 **/
//
//        Car car = new Car(20);
//        car.refueling(100);
//        car.ride(600);
//        System.out.println(car.getDistance());
//
        /** 2.15 **/
//        Invoice invoice = new Invoice();
//        Invoice.Item newltem1 = new Invoice. Item ("Тостер", 2, 1900);
//        Invoice.Item newltem2 = new Invoice. Item ("Микроволновка", 2, 2300);
//        Invoice.Item newltem3 = new Invoice. Item ("Холодильник", 2, 3300);
//        invoice.add(newltem1);
//        invoice.add(newltem2);
//        invoice.add(newltem3);
//        invoice.showInvoice();


        /** 3.3 **/
//        Каковы все супертипы для типа String , Scanner или
//        ImageOutputStream? Следует иметь в виду, что у
//        каждого типа имеется свой супертип. Класс или интерфейс без явно
//        объявленного супертипа имеет супертип Object.
//        Решение: у String Object
//        У Scanner Iterator<String>(у него Object), Closeable(у него AutoCloseable, у которого,
//        в свою очередь, Object)
//        У ImageOutputStream ImageInputStream(у него DataInput, Closeable(у него AutoCloseable) и
//        далее у них Object), DataOutput(у него только Object)

        /** 4.8 **/
//        System.out.println(void.class.getName());
//        System.out.println(int.class.getName());
//        System.out.println(double.class.getName());
//        System.out.println(double[].class.getName());
//        System.out.println(byte[].class.getName());
//        System.out.println(boolean[].class.getName());
//        System.out.println(String.class.getName());
//        System.out.println((new Object[3]).getClass().getName());
//        System.out.println((new int[3][4][5][6][7][8][9]).getClass().getName());
//        System.out.println(Set.class.getName());
//        System.out.println(Set.class);
//        System.out.println((new HashSet<String>()).getClass().getName());
//        System.out.println(Rectangle.class.getName());


        /** 6.1 **/

//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Hello1");
//        arrayList.add("Hello2");
//        arrayList.add("Hello3");
//        arrayList.add("Hello4");
//        arrayList.add("Hello5");
//        Stack<String> stringStack = new Stack<String>(arrayList);
//        System.out.println(stringStack.isEmpty());
//        System.out.println(stringStack.pop());
//        stringStack.push("Hello0");
//        System.out.println(stringStack);


        /** 6.24 **/

//        Class<?> aClass = null;
//        aClass.toString();
//        aClass.desiredAssertionStatus();
//        aClass.getAnnotatedInterfaces();
//        aClass.getAnnotations();
//        aClass.getCanonicalName();
//        aClass.getClasses();
//        aClass.getClassLoader();
//        aClass.getComponentType();
//        aClass.getConstructors();
//        aClass.getDeclaredAnnotations();
//        aClass.getDeclaredClasses();
//        aClass.getDeclaredFields();
//        aClass.getDeclaredConstructors();
//        aClass.getFields();
//        aClass.getMethods();
//        aClass.getModifiers();

        /** 7.2 **/

//        Сделайте все буквы прописными в символьных строках, содержащихся в массиве.
//        С этой целью воспользуйтесь сначала итератором, затем перебором индексных
//        значений в цикле и, наконец, методом replaceAll ().


//        List<String> listString = new ArrayList<>();
//        System.out.println("Задание 7.2. Введите строку");
//        //Это просто для ввода нескольких строк, можно было вообще их в коде задать
//        for(int i = 0; i<3; i++) {
//            listString.add(scanner.next());
//        }

//        // Метод 1
//        ListIterator<String> iterator = listString.listIterator();
//        while (iterator.hasNext()){
//            iterator.set(iterator.next().toUpperCase());
//        }

//        // Метод 2
//        for(int i = 0; i<listString.size(); i++){
//            String s = listString.get(i);
//            listString.set(i, s.replace(s, s.toUpperCase()));
//        }

//        // Метод 3
//        listString.replaceAll(String::toUpperCase);


//        //Вывод результата
//        System.out.println(listString);


        /** 7.3 **/
//        Как вычислить объединение, пересечение и разность двух множеств, используя
//        только методы из интерфейса Set, но не организуя циклы?
//        Ответ: пересечение можно вычислить методом retainAll​()
//        Сохраняет в этом наборе только те элементы, которые содержатся в указанной коллекции
//        Разность с помощью метода removeAll​(Collection<?> c)
//        Он удаляет из этого набора все его элементы, содержащиеся в указанной коллекции
//        Для объединения метод addAll​(Collection<? extends E> c)
//        Он добавляет все элементы в указанной коллекции в этот набор, если они еще не присутствуют

        /** 7.4 **/
//        Воспроизведите ситуацию, когда возникает исключение типа ConcurrentModificationException.

//        Ответ: Если для обхода структуры данных имеется несколько итераторов и один из них изменяет ее,
//        то другой может стать недействительным. Если же и дальше пользоваться недействительным
//        итератором, он может сгенерировать исключение типа ConcurrentModificationException


        /** 7.7 **/
//    Напишите программу для чтения всех слов из файла и вывода частоты,
//    с которой каждое слово встречается в нем. Воспользуйтесь для этой
//    цели классом TreeMap<String, Integer>

        Scanner scanner1 = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe.txt"));
        Scanner scanner2 = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe.txt"));
        Map<String, Integer> uniqueStringsOfFile = new TreeMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        while(scanner1.hasNext())
        {
            int count = 0;
            String s = scanner1.next();
            if (!uniqueStringsOfFile.containsKey(s)) {
                while(scanner2.hasNext()) {
                    String s2 = scanner2.next();
                    if(s2.equals(s)){
                        count++;
                    }
                }
            }
            uniqueStringsOfFile.put(s, count);
        }
        System.out.println(uniqueStringsOfFile);
    }

        /** 7.5 **/
////        Реализуйте метод public static void swap(List<?> list, int i, int j),
////        выполняющий перестановку элементов обычным образом, когда класс,
////        определяющий тип параметра list, реализует интерфейс RandomAccess, а иначе
////        сводящий к минимуму обход элементов на позициях, обозначаемых индексами i и j.
//
//    public static void swap(List<?> list, int i, int j) {
//        if (list instanceof RandomAccess) {
//            Collections.swap(list, i, j);
//        } else {
//            ListIterator<?> listIterator = list.listIterator();
//
//        }


    }














