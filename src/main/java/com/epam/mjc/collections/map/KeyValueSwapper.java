package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        TreeMap<Integer, String> newMap = new TreeMap<>(Comparator.reverseOrder());

        newMap.putAll(sourceMap);
        Map<String,Integer> reversed = new HashMap<>();

        for (Map.Entry<Integer,String> s : newMap.entrySet()){
            reversed.put(s.getValue(),s.getKey());
        }
    return reversed;
    }
}
