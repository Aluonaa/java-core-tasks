package com.digdes.crp.javacoretasks.chapter6;

public class TableWithEntry<K, V> {
    private Entry<K, V> entry;

    public TableWithEntry(){};

    public TableWithEntry(Entry<K, V> entry){
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

    public static class Entry<K, V> {
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
