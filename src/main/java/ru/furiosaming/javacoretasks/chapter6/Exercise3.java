package main.java.ru.furiosaming.javacoretasks.chapter6;


public class Exercise3 {
    /** Реализуйте обобщенный класс Table<K, V>, управляющий списочным массивом,
    состоящим из элементов типа Entry<K, V>. Предоставьте методы для
    получения значения, связанного с ключом, установки значения по заданному
    ключу и удаления ключа. **/

    public static void main(String[] args) {
        Entry<Integer, String> entry1 = new Entry<>(1, "Value1");
        Entry<Integer, String> entry2 = new Entry<>(2, "Value2");
        Entry<Integer, String> entry3 = new Entry<>(3, "Value3");
        Table<Integer, String> table = new Table<>();
        table.add(entry1);
        table.add(entry2);
        table.add(entry3);
        table.add(4, "Value4");
        System.out.println(table.getBykey(2));
        System.out.println(table.setByKey(3, "newValue"));
        System.out.println(table.deleteKey(1));
    }
}
