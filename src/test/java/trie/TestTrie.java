package trie;

import trie.Trie;
import org.junit.Assert;
import org.junit.Test;

public class TestTrie {
  @Test
  public void testProblemCase1() {
    Trie solution = new Trie();
    solution.addWord(null);
    solution.addWord("");
    Assert.assertFalse(solution.searchWord(null));
    Assert.assertFalse(solution.searchWord(""));
    Assert.assertFalse(solution.searchPrefix(null));
    Assert.assertFalse(solution.searchPrefix(""));
    Assert.assertFalse(solution.searchWord("apple"));
    Assert.assertFalse(solution.searchPrefix("apple"));
    
    solution.addWord("apple");
    solution.addWord("snapple");
    solution.addWord("banana");
    solution.addWord("bananas");
    Assert.assertTrue(solution.searchWord("snapple"));
    Assert.assertTrue(solution.searchWord("banana"));
    Assert.assertTrue(solution.searchPrefix("snapple"));
    Assert.assertTrue(solution.searchPrefix("banana"));
    
    Assert.assertFalse(solution.searchWord("a"));    
    Assert.assertFalse(solution.searchWord("ap"));    
    Assert.assertFalse(solution.searchWord("app"));    
    Assert.assertFalse(solution.searchWord("appl"));    
    Assert.assertTrue(solution.searchWord("apple"));
    Assert.assertFalse(solution.searchWord("apples"));    
    
    Assert.assertTrue(solution.searchPrefix("a"));    
    Assert.assertTrue(solution.searchPrefix("ap"));    
    Assert.assertTrue(solution.searchPrefix("app"));    
    Assert.assertTrue(solution.searchPrefix("appl"));    
    Assert.assertTrue(solution.searchPrefix("apple"));
    Assert.assertFalse(solution.searchPrefix("apples"));    
  }
}
