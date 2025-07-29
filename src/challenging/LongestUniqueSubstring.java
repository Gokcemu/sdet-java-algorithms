package challenging;

import java.util.HashSet;

public class LongestUniqueSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring("abcabcbb")); // 3 ("abc")
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring("bbbbb"));    // 1 ("b")
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring("pwwkew"));   // 3 ("wke")
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring(""));         // 0
    }
}
