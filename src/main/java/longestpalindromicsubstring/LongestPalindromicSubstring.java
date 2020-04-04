package longestpalindromicsubstring;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s.isEmpty()) {
            return s;
        }
        int maxLength = 1;
        int startOfPalindrome = 0;
        for(int i = 1; i < s.length();i++) {
            int lowIndex = i;
            int highIndex = i - 1;
            while(lowIndex >= 0 && highIndex < s.length() && s.charAt(lowIndex) == s.charAt(highIndex)) {
                int foundLength = highIndex - lowIndex + 1;
                if (foundLength > maxLength) {
                    startOfPalindrome = lowIndex;
                    maxLength = foundLength;
                }
                lowIndex--;
                highIndex++;
            }

            highIndex = i + 1;
            lowIndex = i - 1;
            while(lowIndex >= 0 && highIndex < s.length() && s.charAt(lowIndex) == s.charAt(highIndex)) {
                int foundLength = highIndex - lowIndex + 1;
                if (foundLength > maxLength) {
                    startOfPalindrome = lowIndex;
                    maxLength = foundLength;
                }
                lowIndex--;
                highIndex++;
            }
        }

        return s.substring(startOfPalindrome, (startOfPalindrome + maxLength));
    }
}
