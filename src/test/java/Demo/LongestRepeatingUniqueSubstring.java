package Demo;

import java.util.*;

public class LongestRepeatingUniqueSubstring {
    public static void main(String[] args) {
        String text = "pwwkew";  // Example input string

        int longestLength = 0;
        int start = 0;
        int end = 0;
        HashSet<Character> set = new HashSet<>();

        while (end < text.length()) {
            Character currentChar = text.charAt(end);
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                longestLength = Math.max(longestLength, text.substring(start, end + 1).length());
                end++;
            } else {
                set.remove(text.charAt(start));
                start++;
            }
        }
        System.out.println("Longest length -> " + longestLength);
    }
}