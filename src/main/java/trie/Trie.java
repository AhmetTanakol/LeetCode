package trie;

import java.util.HashMap;
import java.util.Map;

class Trie {
    /**
     * Initialize your data structure here.
     */
    TreeNode root;

    public Trie() {
        root = new TreeNode(null);
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TreeNode parent = root;
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!parent.childNodes.containsKey(chars[i])) {
                TreeNode newNode = new TreeNode(chars[i]);
                parent.childNodes.put(chars[i], newNode);
                parent = newNode;
            } else {
                parent = parent.childNodes.get(chars[i]);
            }
        }
        parent.isTrie = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        TreeNode parent = root;
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!parent.childNodes.containsKey(chars[i])) {
                return false;
            } else {
                parent = parent.childNodes.get(chars[i]);
            }
        }

        return parent.isTrie;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TreeNode parent = root;
        char[] chars = prefix.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!parent.childNodes.containsKey(chars[i])) {
                return false;
            } else {
                parent = parent.childNodes.get(chars[i]);
            }
        }

        return true;
    }

    public static class TreeNode {
        Character val;
        boolean isTrie;
        Map<Character, TreeNode> childNodes;

        public TreeNode(Character val) {
            this.val = val;
            childNodes = new HashMap<>();
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
