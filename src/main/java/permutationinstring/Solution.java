package permutationinstring;

import java.util.Arrays;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] counts = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i)]++;
        }
        int n = s1.length();

        int left = 0;
        int right = 0;
        char[] arr = s2.toCharArray();
        while (right < arr.length) {
            while (right < arr.length && counts[arr[right]] > 0) {
                counts[arr[right]]--;
                right++;
            }

            if (right - left == n) return true;

            while (right < arr.length && counts[arr[right]] <= 0) {
                counts[arr[left++]]++;
            }
        }

        return false;
    }

    public boolean checkInclusion_2(String s1, String s2) {
        if (s1.length() == 0 || s1.length() > s2.length()) {
            return false;
        }
        char[] s1Chars = s1.toCharArray();
        int[] s1Arr = new int[26];
        for (char c : s1Chars) {
            s1Arr[c - 'a'] += 1;
        }

        int[] copy = Arrays.copyOf(s1Arr, 26);
        char[] s2Chars = s2.toCharArray();
        for (int i = 0; i < s2Chars.length; i++) {
            if (s1Arr[s2Chars[i] - 'a'] > 0) {
                int counter = i;
                for (int j = 0; j < s1Chars.length; j++) {
                    if (counter >= s2Chars.length || copy[s2Chars[counter] - 'a'] <= 0) {
                        break;
                    }
                    copy[s2Chars[counter] - 'a']--;
                    if (j == (s1Chars.length - 1)) {
                        return true;
                    }
                    counter++;
                }
                copy = Arrays.copyOf(s1Arr, 26);
            }
        }

        return false;
    }
}
