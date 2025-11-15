package test;

import java.util.HashSet;

public class LongestSubstring {

    static boolean isPanagram(String text) {
        char[] chars_array = text.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = chars_array.length - 1; i >= 0; i--) {
            reversed.append(chars_array[i]);
        }
        return text.equals(reversed.toString());
    }

    public static void main(String[] args) {
        String text = "abaghhdabbad";
        /*
        using window slider
        start and end will be implemented
        hashset will be implemented for repeating elements
        longSub string will store the largest string
        Assuming longSub is largest
         */
        int start = 0;
        int end = 0;
        HashSet<Character> basket = new HashSet<>();
        String longsub = "";
        String panagram_longsub="";

        while (end < text.length()) {
            if (!basket.contains(text.charAt(end))) {
                basket.add(text.charAt(end));
                String current_subString = text.substring(start, end + 1);
                if (longsub.length() < current_subString.length()) {
                    longsub = current_subString;
                    if (isPanagram(longsub)){
                        panagram_longsub = longsub;
                    }
                }
                end++;
            } else {
                basket.remove(text.charAt(start));
                start++;
            }
        }
        System.out.println(longsub);
        System.out.println(panagram_longsub);
    }
}
