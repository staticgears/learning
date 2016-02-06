package com.learnings.six;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Keith Banks.
 */
public class DuckDuckGo implements SearchEngine {
    private String article;

    @Override
    public void load(String article) {
        this.article = article;
    }

    @Override
    public Collection<String> find(String term) {
        String expression = String.format("\\S*%s\\S*", term);
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(article);
        Set<String> results = new HashSet<>();
        while(matcher.find()) {
            results.add(matcher.group());
        }
        return results;
    }
}
