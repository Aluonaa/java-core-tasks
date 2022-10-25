package chapter1;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Chapter1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        //Выбор задания главы 1
        System.out.println("Введите номер задания (в данный момент выполнены: 1-9, 11 и 13):");
        int numberOfExercise = scanner.nextInt();

        /** ТЕКСТ ЗАДАНИЙ **/
//        1. Напишите программу, вводящую целочисленное значение и выводящую его
//        в двоичной, восьмеричной и шестнадцатеричной форме. Организуйте вывод
//        обратного значения в виде шестнадцатеричного числа с плавающей точкой.

//        2. Напишите программу, вводящую целочисленное (как положительное, так и
//        отрицательное) значение угла и нормализующую его в пределах от 0 до 359
//        градусов. Попробуйте сделать это сначала с помощью операции %, а затем
//        метода floorMod().

//        3. Напишите программу, вводящую три целочисленных значения и выводящую
//        самое большое из них, используя только условную операцию. Сделайте то же
//        самое с помощью метода Math.mах().

//        4. Напишите программу, выводящую наименьшее и наибольшее положительные
//        значения типа double. Подсказка: воспользуйтесь методом Math.nextUp ()
//        из прикладного программного интерфейса Java API.

//        5. Что произойдет, если привести числовое значение типа double к значению
//        типа int, которое больше самого большого значения типа int? Попробуйте
//        сделать это.

//        6. Напишите программу, вычисляющую факториал п ! = 1 х 2 * . . . х n,
//        используя класс BigInteger. Вычислите факториал числа 1000.

//        7. Напишите программу, вводящую два числа в пределах от 0 до 65535,
//        сохраняющую их в переменных типа short и вычисляющую их сумму, разность,
//        произведение, частное и остаток без знака, не преобразуя эти величины в тип int.

//        8. Напишите программу, вводящую символьную строку и выводящую все ее непустые подстроки.

//        9. В разделе 1.5.3 был приведен пример сравнения двух символьных строк s и t
//        при вызове метода s.equals(t), но не с помощью операции s != t. Придумайте
//        другой пример, в котором не применяется метод substring ().

//        10. Напишите программу, составляющую произвольную символьную строку из
//        букв и цифр, генерируя произвольное значение типа long и выводя его по основанию 36.

//        11. Напишите программу, вводящую текстовую строку и выводящую все символы,
//        не представленные в коде ASCII, вместе с их значениями в Юникоде.

//        12. В состав комплекта разработки Java Development Kit входит архивный файл
//        src. zip с исходным кодом библиотеки Java. Разархивируйте этот файл и с помощью
//        избранного вами инструментального средства для поиска текста найдите в этом исходном
//        коде примеры применения последовательностей операторов break и continue с меткой.
//        Выберите один из этих примеров и перепишите его без оператора с меткой.

//        13. Напишите программу, выбирающую и выводящую лотерейную комбинацию
//        из шести отдельных чисел в пределах от 1 до 49. Чтобы выбрать шесть
//        отдельных чисел, начните со списочного массива, заполняемого числами от 1 до 49.
//        Выберите произвольный индекс и удалите элемент массива. Повторите эти
//        действия шесть раз подряд. Выведите полученный результат в отсортированном порядке.

//        14. Напишите программу, вводящую двумерный массив целочисленных значений
//        и определяющую, содержится ли в нем магический квадрат (т.е. одинаковая
//        сумма значений во всех строках, столбцах и диагоналях). Принимая строки
//        вводимых данных, разбивайте их на отдельные целочисленные значения,
//        прекратив этот процесс, когда пользователь введет пустую строку.
//        Например, на следующие вводимые данные:
//        16 3 2 13
//        3 10 11 8
//        9 6 7 12
//        4 15 14 1
//        (Пустая строка)
//        программа должна ответить утвердительно.

//        15. Напишите программу, сохраняющую треугольник Паскаля вплоть до заданной
//        величины п в переменной типа ArrayList<ArrayList<Integer».

//        16. Усовершенствуйте упоминавшийся ранее метод average () таким образом,
//        чтобы он вызывался хотя бы с одним параметром


        switch (numberOfExercise) {
            case (1):

                System.out.println("Задание 1. Введите целое число:");
                number = scanner.nextInt();
                String s2 = Integer.toBinaryString(number);
                String s8 = Integer.toOctalString(number);
                String s16 = Integer.toHexString(number);
                System.out.println("Двоичная система: " + s2 + "  Восьмеричная система: " + s8 + "  Шестнадцатеричная система: " + s16);
                break;

            case (2):

                System.out.println("Задание 2. Введите значение угла:");
                number = scanner.nextInt();
                if (number < 0) {
                    number = 0;
                } else {
                    System.out.println("Способ выполнения 1: ");
                    number = number % 360;
                    System.out.println(number);

                    System.out.println("Способ выполнения 2: ");
                    number = Math.floorMod(number, 360);
                    System.out.println(number);
                }
                break;


            case (3):

                System.out.println("Задание 3. Введите три числа:");
                int number1 = scanner.nextInt();
                int number2 = scanner.nextInt();
                int number3 = scanner.nextInt();

                System.out.println("Метод 1: ");
                if (number1 >= number2 && number1 >= number3) {
                    number = number1;
                } else if (number2 >= number1 && number2 >= number3) {
                    number = number2;
                } else number = number3;

                System.out.println(number);

                System.out.println("Метод 2, Math.max: ");
                number = Math.max(number1, number2);
                number = Math.max(number, number3);

                System.out.println(number);
                break;


            case (4):

                double numDouble = Math.nextUp(0f);
                System.out.println(numDouble);
                System.out.println(Double.MAX_VALUE);
                System.out.println(Double.MIN_NORMAL);

                double d = 2147483648.0;
                int a = (int) d;
                System.out.println(a);
                break;


            case (5):

                System.out.println("Если привести числовое значение типа double к значению типа int, которое больше\n" +
                        "        самого большого значения типа int последние разряды(превышающие максимальное значение int),\n" +
                        "        будут отброшены, а последняя цифра будет уменьшена до 7(если она была больше),\n" +
                        "        таким образом число будет равно 2147483647, то есть число без появления ошибок\n" +
                        "        будет приведено к верхней границе int, это может создавать потенциально опасные\n" +
                        "        ситуации при расчетах, подобные особенности необходимо учитывать.");
                break;


            case (6):

                System.out.println("Задание 6. Введите число для вычисления факториала: ");
                int factori = scanner.nextInt();
                BigInteger bigInteger = BigInteger.ONE; // При вычислении факториала минимальный результат 1
                for (int r = 1; r <= factori; r++) {
                    bigInteger = bigInteger.multiply(BigInteger.valueOf(r));
                }
                System.out.println(bigInteger);
                break;


            case (7):

                System.out.println("Введите числа short: ");
                short one = scanner.nextShort();
                short two = scanner.nextShort();

                System.out.println((short) (one + two));
                System.out.println((short) (one * two));
                System.out.println((short) (one / two));
                System.out.println((short) (one % two));
                System.out.println((short) (one - two));
                break;


            case (8):

                String stroka = scanner.nextLine();
                int length = stroka.length();
                for (int i = 0; i < length; i++) {
                    stroka = stroka.replaceAll(" ", "");
                }
                System.out.println(stroka);
                break;


            case (9):

                System.out.println("В разделе 1.5.3 был приведен пример сравнения двух символьных строк s и t\n" +
                        "        при вызове метода s . equals (t), но не с помощью операции s == t. Придумайте\n" +
                        "        другой пример, в котором не применяется метод substring (). \n" +
                        "\n" +
                        "        Решение: требуются примеры, когда сравнение двух символьно одинаковых строк\n" +
                        "        методом == даст отрицательный результат.\n" +
                        "\n" +
                        "        1.В случае, если две символьно одинаковые строки создаются через конструктор new String(\"Строка\").\n" +
                        "\n" +
                        "        2. В случае, когда одна строка создается конструктором, а вторая, например, получается с помощью\n" +
                        "        System.out.println(\"Строка\") и уходит в стринг пул (или берется оттуда, если она там уже была),\n" +
                        "        сравнение в виде == также даст отрицательный результат.\n" +
                        "\n" +
                        "        3. Строка, созданная конструктором + строка, созданная через String s = \"Строка\"; (Тот же случай)\n" +
                        "\n" +
                        "        4. Случай, когда строка или обе строки являются вычисляемыми (если только в конце не добаляется intern())");

                break;

            case (11):

                String lookingForCharsOutOfASCII = scanner.nextLine();
                for (int i = 0; i < lookingForCharsOutOfASCII.length(); i++) {
                    char currentChar = lookingForCharsOutOfASCII.charAt(i);
                    if (!StandardCharsets.US_ASCII.newEncoder().canEncode(currentChar)) {
                        int code = (int) currentChar;
                        System.out.println(code);
                    }
                }
                break;

            case (13):

                List<Integer> integerList = new ArrayList<>();
                for (int i = 1; i <= 49; i++) {
                    integerList.add(i);
                }
                int size = 49;
                List<Integer> newIntegerList = new ArrayList<>();
                Random random = new Random();
                for (int i = 0; i < 6; i++) {
                    int deletedNumber = (random.nextInt(size) + 1) % size;
                    integerList.remove(random.nextInt(size));
                    size--;
                    newIntegerList.add(deletedNumber);
                }
                Collections.sort(newIntegerList);
                System.out.println(newIntegerList);
                break;
            }
        }
    }

        

