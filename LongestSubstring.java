//Given a string s, find the length of the longest 
//substring
//without repeating characters.

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        // create a Hashset to store characters in current window
        Set<Character> window = new HashSet<>();

        int left = 0; // left pointer of the window
        int right = 0; // right pointer of the window
        int maxLength = 0; // length of longest substring

        while (right < s.length()) {
            // if current character is not in window, add it
            if (!window.contains(s.charAt(right))) {
                window.add(s.charAt(right));
                right++; // move the right pointer
                maxLength = Math.max(maxLength, window.size()); // update maxCount
            } else {
                // if current character exists in window, remove it from left
                window.remove(s.charAt(left));
                left++; // move left pointer
            }
        }

        return maxLength;
    }
}
