package com.learnings.six;

import java.util.Collection;

/**
 * @author Keith Banks.
 */
public interface SearchEngine {
    void load(String article);
    Collection<String> find(String term);
}
