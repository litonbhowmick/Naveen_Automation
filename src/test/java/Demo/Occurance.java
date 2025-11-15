package Demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurance {
    public static void main(String[] args) {

        String str = "Hello World";

        Map<String, Long> collect = Arrays.stream(str.toLowerCase().replaceAll("\\s", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Occurance -> " + collect);

        List<String> duplicates = collect.entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("Duplicate chars -> " + duplicates);

    }
}
