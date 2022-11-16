package com.digdes.crp.javacoretasks.chapter6;


public class Table <K, V> {

    private Entry<K, V> entry;

    public Table(){};

    public Table(Entry<K, V> entry){
        this.entry = entry;
    }

    public Entry<K, V> getEntry() {
        return entry;
    }

    @Override
    public String toString() {
        return "Table{" +
                "entry=" + entry +
                '}';
    }
}
