package main.java.ru.furiosaming.javacoretasks.chapter6;

import java.util.ArrayList;

public class TableWithEntry<K, V> {

    private final ArrayList<Entry<K, V>> entries;

    public TableWithEntry(){
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

    static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public void deleteKey() {
            key = null;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
}
