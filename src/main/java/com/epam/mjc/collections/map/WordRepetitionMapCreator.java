package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> keyCount = new HashMap<>();

        if(!sentence.isEmpty()) {
            String[] sentenceArra = sentence.toLowerCase().split(",?[\\s.]");

            for (int i = 0; i < sentenceArra.length; i++) {
                int count = 0;

                for (int j = 0; j < sentenceArra.length; j++) {
                    if (sentenceArra[i].equalsIgnoreCase(sentenceArra[j])) {
                        count++;
                    }
                }
                keyCount.put(sentenceArra[i], count);
            }
        }

        return keyCount;
    }
}
