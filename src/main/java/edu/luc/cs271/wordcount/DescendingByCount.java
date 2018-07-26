package edu.luc.cs271.wordcount;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

/** The comparison strategy for sorting the array by the word count. */
public class DescendingByCount implements Comparator<Map.Entry<String, Integer>> {

  public int compare(final Map.Entry<String, Integer> l, final Map.Entry<String, Integer> r) {

    return r.getValue().compareTo(l.getValue());

  }
}
