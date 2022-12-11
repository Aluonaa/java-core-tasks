package com.digdes.crp.javacoretasks.chapter6;

public class Exercise4 {
    /** Сделайте вложенным класс Entry из предыдущего упражнения. Должен ли
    этот класс быть обобщенным? Да**/

    public static void main(String[] args) {
        TableWithEntry.Entry<Integer, String> entry = new TableWithEntry.Entry<>(1, "Value1");
        TableWithEntry<Integer, String> tableWithEntry = new TableWithEntry<>();
        tableWithEntry.add(entry);
        tableWithEntry.add(2, "Value2");
        System.out.println(tableWithEntry.toString());
        System.out.println(tableWithEntry.getBykey(1));
        System.out.println(tableWithEntry.setByKey(1, "newValue"));
        System.out.println(tableWithEntry.deleteKey(1));
    }

}
