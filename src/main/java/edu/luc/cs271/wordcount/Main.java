package edu.luc.cs271.wordcount;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map.Entry;

public class Main {

  public static void main(final String[] args) throws InterruptedException, FileNotFoundException {

    File file = new File("src/book.rtf");
    final Scanner input = new Scanner (file).useDelimiter("[^\\p{Alnum}]+");

    //1.
    WordCounter wordCounter = new WordCounter(new HashMap<String, Integer>());
    //2.
    wordCounter.countWords(input);
    //3.
    Map<String, Integer> map = wordCounter.getCounts();
    System.out.println("Map size: " + map.size());
    //4.
    List<Entry<String, Integer>> list = new ArrayList(map.size());
    //5.
    list.addAll(map.entrySet());
    //6.
    Collections.sort(list, new DescendingByCount());
    //7.
    for (int i = 0; i < 10; i++) {
      System.out.println(list.get(i).getValue() + "=" + list.get(i).getKey());
    }

  }
}
