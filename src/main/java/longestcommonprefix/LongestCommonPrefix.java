package longestcommonprefix;

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];
            if (str.length() == 0) {
                return "";
            }
            for (int j = 0; j < prefix.length(); j++) {
                if (j < str.length()) {
                    if (str.charAt(j) != prefix.charAt(j)) {
                        prefix = prefix.substring(0, j);
                        break;
                    }
                } else {
                    prefix = prefix.substring(0, j);
                    break;
                }
            }
        }

        return prefix;
    }
}
