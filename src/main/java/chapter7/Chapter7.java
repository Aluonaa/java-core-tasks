package chapter7;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Chapter7 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        //Выбор задания главы 7
        System.out.println("Введите номер задания (в данный момент выполнены: 2-4, 7-8, 11):");
        int numberOfExercise = scanner.nextInt();

        /** ТЕКСТ ЗАДАНИЙ **/


        switch (numberOfExercise) {
            case (2):
                List<String> listString = new ArrayList<>();
                System.out.println("Задание 7.2. Введите строку");
                //Это просто для ввода нескольких строк, можно было вообще их в коде задать
                for(int i = 0; i<3; i++) {
                    listString.add(scanner.next());
                }

                // Метод 1
                ListIterator<String> iterator = listString.listIterator();
                while (iterator.hasNext()){
                    iterator.set(iterator.next().toUpperCase());
                }

                // Метод 2
                for(int i = 0; i<listString.size(); i++){
                    String s = listString.get(i);
                    listString.set(i, s.replace(s, s.toUpperCase()));
                }

                // Метод 3
                listString.replaceAll(String::toUpperCase);


                //Вывод результата
                System.out.println(listString);
                break;

            case (3):
                System.out.println("Как вычислить объединение, пересечение и разность двух множеств, используя\n" +
                        "//        только методы из интерфейса Set, но не организуя циклы?\n" +
                        "//        Ответ: пересечение можно вычислить методом retainAll\u200B()\n" +
                        "//        Сохраняет в этом наборе только те элементы, которые содержатся в указанной коллекции\n" +
                        "//        Разность с помощью метода removeAll\u200B(Collection<?> c)\n" +
                        "//        Он удаляет из этого набора все его элементы, содержащиеся в указанной коллекции\n" +
                        "//        Для объединения метод addAll\u200B(Collection<? extends E> c)\n" +
                        "//        Он добавляет все элементы в указанной коллекции в этот набор, если они еще не присутствуют");
                break;

            case (4):
                System.out.println("Воспроизведите ситуацию, когда возникает исключение типа ConcurrentModificationException.\n" +
                        "\n" +
                        "//        Ответ: Если для обхода структуры данных имеется несколько итераторов и один из них изменяет ее,\n" +
                        "//        то другой может стать недействительным. Если же и дальше пользоваться недействительным\n" +
                        "//        итератором, он может сгенерировать исключение типа ConcurrentModificationException");
                break;

            case (7):
                Scanner scanner1 = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe.txt"));
                Map<String, Integer> uniqueStringsOfFile = new TreeMap<>();

                while(scanner1.hasNext())
                {
                    int count = 0;
                    String s = scanner1.next();
                    Scanner scanner2 = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe.txt"));
                    if (!uniqueStringsOfFile.containsKey(s)) {
                        while(scanner2.hasNext()) {
                            String s2 = scanner2.next();
                            if(s2.equals(s)){
                                count++;
                            }
                        }
                        uniqueStringsOfFile.put(s, count);
                    }
                }
                System.out.println(uniqueStringsOfFile);
                break;

            case (8):
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
                break;

            case (11):
                Scanner scanner5 = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe.txt"));
                List<String> stringList = new ArrayList<>();
                while(scanner5.hasNext())
                {
                    String s = scanner5.next();
                    stringList.add(s);
                }
                Collections.shuffle(stringList.subList(1, stringList.size()-1));
                System.out.println(stringList);
                break;
            }


        }
    }
