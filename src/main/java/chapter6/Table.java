package chapter6;

import java.util.Map;

public class Table <K, V> {
    private Map.Entry<K, V> entry;

    public Table(){};

    public Table(Map.Entry<K, V> entry){
        this.entry = entry;
    }

    public V getEntryValue() {
        return entry.getValue();
    }

    public void deleteKey(V value){
        entry.getKey();
    }

//    public void setEntryValue(V value) {
//        entry.setValue(value);
//    }


}
