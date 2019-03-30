package trie;

public class Trie {
  // Data structure for the Trie
  private class TrieNode {
    public boolean isWord;
    // One for each lower case letter a - z (26)
    public TrieNode[] children = new TrieNode[26];
    public TrieNode() {};
  }
  
  private TrieNode root;
  
  // Initializing the Trie
  public Trie() {
    root = new TrieNode();
  }
  
  // Add a word into the Trie
  public void addWord(String word) {
    if(word == null || word.length() == 0)
      return;
    
    TrieNode temp = root;
    // Check each character in the word
    for(int i = 0; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a';
      if(temp.children[idx] == null)
        temp.children[idx] = new TrieNode();
      
      temp = temp.children[idx];
    }
    temp.isWord = true;
  }
  
  // Search for word in the Trie
  public boolean searchWord(String word) {
    if(word == null || word.length() == 0)
      return false;
    
    TrieNode temp = root;
    // Check each character in the word
    for(int i = 0; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a';
      if(temp.children[idx] == null)
        return false;
      
      temp = temp.children[idx];
    }
    return temp.isWord;
  }
  
  // Search if the prefix can form a word in the Trie
  public boolean searchPrefix(String prefix) {
    if(prefix == null || prefix.length() == 0)
      return false;
    
    TrieNode temp = root;
    // Check each character in the prefix
    for(int i = 0; i < prefix.length(); i++) {
      int idx = prefix.charAt(i) - 'a';
      if(temp.children[idx] == null)
        return false;
      
      temp = temp.children[idx];
    }
    return true;
  }
}
