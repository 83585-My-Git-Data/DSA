package com.sunbeam;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static Map<String, Integer> countWords(String line) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = line.split("\\s+");
        
        for (String word : words) {
            word = word.toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        return wordCountMap;
    }
}
