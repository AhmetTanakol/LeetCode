package groupanagrams;

import java.util.*;
import java.util.stream.Collectors;

/*
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            String key = generateKey(str);
            if(anagramMap.containsKey(key)) {
                anagramMap.get(key).add(str);
            } else {
                anagramMap.putIfAbsent(key, new ArrayList<String>(){{add(str);}});
            }
        }

        return anagramMap
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    private String generateKey(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        return String.valueOf(chars);
    }
}
