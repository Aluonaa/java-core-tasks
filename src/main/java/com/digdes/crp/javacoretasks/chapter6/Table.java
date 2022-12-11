package com.digdes.crp.javacoretasks.chapter6;

import java.util.ArrayList;

public class Table <K, V> {

    private final ArrayList<Entry<K, V>> entries;

    public Table(){
        entries = new ArrayList<>();
    }

    public void add(K key, V value){
        entries.add(new Entry<>(key, value));
    }

    public void add(Entry<K, V> entry){
        entries.add(entry);
    }

    public V getBykey(K key){
        V value = null;
        for(Entry<K, V> entry: entries){
            if(entry.getKey() == key){
                value = entry.getValue();
            }
        }
        return value;
    }

    public Entry<K, V> setByKey(K key, V newValue){
        for(Entry<K, V> entry: entries){
            if(entry.getKey() == key){
                entry.setValue(newValue);
                return entry;
            }
        }
        return null;
    }

    public Entry<K, V> deleteKey(K key){
        boolean result = false;
        for(Entry<K, V> entry: entries){
            if(entry.getKey() == key){
                entry.setKey(null);
                return entry;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Table{" +
                "entries=" + entries +
                '}';
    }
}
