package letterfrequency;

import java.util.*;

class Solution {
    public String frequencySort(String s) {
        List<Character>[] mylist = new ArrayList[s.length() + 1];
        int[] counts = new int[256];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            counts[c]++;
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                if (mylist[counts[i]] == null) {
                    mylist[counts[i]] = new ArrayList<>();
                }
                mylist[counts[i]].add((char) i);
            }
        }

        StringBuilder str = new StringBuilder();
        for (int i = mylist.length - 1; i >= 0; i--) {
            List<Character> characters = mylist[i];
            for (Character c : characters) {
                for (int j = 0; j < i; j++) {
                    str.append(c);
                }
            }
        }

        return str.toString();
    }
}
