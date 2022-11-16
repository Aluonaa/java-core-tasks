package com.digdes.crp.javacoretasks.chapter6;

public class Exercise4 {
    /** Сделайте вложенным класс Entry из предыдущего упражнения. Должен ли
    этот класс быть обобщенным? Да**/
    public static void main(String[] args) {
        TableWithEntry.Entry<Integer, String> entry = new TableWithEntry.Entry<>(1, "Value");
        TableWithEntry<Integer, String> tableWithEntry = new TableWithEntry<>(entry);
        System.out.println(tableWithEntry.toString());
    }

}
