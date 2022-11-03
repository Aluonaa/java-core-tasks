package com.digdes.crp.javacoretasks.chapter7;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cache extends LinkedHashMap {

    public static final int MAX_ENTRIES = 10;

    public Cache(){
        super();
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_ENTRIES;
    }
}
