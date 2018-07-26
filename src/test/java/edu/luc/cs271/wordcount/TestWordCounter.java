package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  private WordCounter wordCounter;

  @Before
  public void setUp() {
    wordCounter = new WordCounter(new HashMap<String, Integer>());
  }

  @After
  public void tearDown() {
    wordCounter = null;
  }

  @Test
  public void testGetCountEmpty() {
    assertTrue(wordCounter.getCounts().isEmpty());

  }

  @Test
  public void testGetCountNonEmpty() {
    wordCounter.countWords(Arrays.asList("test", "test", "test", "test2", "test2").iterator());
    Map counts = wordCounter.getCounts();
    assertEquals(3, counts.get("test"));
    assertEquals(2, counts.get("test2"));
    assertNull(counts.get("random"));
    assertNull(counts.get("random2"));

  }
}
