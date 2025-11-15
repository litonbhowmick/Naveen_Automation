package Demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestString {

    static String apply(String a, String b) {
        return a.length() > b.length() ? a : b;
    }

    public static void main(String[] args) {

        String[] words = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape"};

        System.out.println(Arrays.stream(words).max(Comparator.comparingInt(String::length)).get());
        System.out.println(Arrays.stream(words).reduce(LongestString::apply).get());
    }
}