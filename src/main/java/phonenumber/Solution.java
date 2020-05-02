package phonenumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.



Example:

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
class Solution {
    Map<Character, Character[]> chars = new HashMap<Character, Character[]>() {{
        put('2', new Character[]{'a', 'b', 'c'});
        put('3', new Character[]{'d', 'e', 'f'});
        put('4', new Character[]{'g', 'h', 'i'});
        put('5', new Character[]{'j', 'k', 'l'});
        put('6', new Character[]{'m', 'n', 'o'});
        put('7', new Character[]{'p', 'q', 'r', 's'});
        put('8', new Character[]{'t', 'u', 'v'});
        put('9', new Character[]{'w', 'x', 'y', 'z'});
    }};

    public List<String> letterCombinations(String digits) {
        char[] nums = digits.toCharArray();
        List<String> combinations = new ArrayList<>();
        letterUtil("", 0, nums, combinations);
        return combinations;
    }

    private String letterUtil(String combination, int index, char[] digits, List<String> combinations) {
        if (index >= digits.length) {
            return combination;
        }
        Character digit = digits[index];
        Character[] letters = chars.get(digit);
        for (Character letter : letters) {
            String newCombination = combination + letter;
            String next = letterUtil(newCombination, index + 1, digits, combinations);
            if (next.length() != 0) {
                combinations.add(next);
            }
        }

        return "";
    }

}
