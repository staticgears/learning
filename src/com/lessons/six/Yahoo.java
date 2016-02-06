package com.learnings.six;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Keith Banks.
 */
public class Yahoo implements SearchEngine {
    private final Map<String, Integer> words = new HashMap<>();

    @Override
    public void load(String article) {
        words.clear();
        String[] tokens = article.split("\\s+");
        for(String token : tokens) {
            String input = normalize(token);
            if(words.containsKey(input)) {
                words.computeIfPresent(input, (k, v) -> v + 1 );
            } else {
                words.put(input, 1);
            }
        }
    }

    @Override
    public Collection<String> find(String term) {
        String input = normalize(term);
        return words.entrySet().stream().filter(e -> e.getKey().contains(input))
                .flatMap(e -> Collections.nCopies(e.getValue(), e.getKey()).stream())
                .collect(Collectors.toList());
    }


    private String normalize(String input) {
        String lower = input.toLowerCase();
        return input;
    }
}
