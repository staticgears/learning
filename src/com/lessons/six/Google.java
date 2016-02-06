package com.learnings.six;

import java.util.*;

/**
 * @author Keith Banks.
 */
public class Google implements SearchEngine {
    private final Set<String> words = new HashSet<>();

    public void load(String article) {
        words.clear();
        words.addAll(Arrays.asList(article.split("\\s+")));
    }

    public Collection<String> find(String term) {
        Collection<String> result = new ArrayList<>();
        if(term == null) { return result; }
        for(String word : words) {
            if(word.contains(term)) {
                result.add(word);
            }
        }
        return result;
    }
}
