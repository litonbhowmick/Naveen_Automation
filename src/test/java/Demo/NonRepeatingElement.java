package Demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingElement {
    public static void main(String[] args) {

        String text = "Hehhloo";

         Optional<String> first = Arrays.stream(text.toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        first.ifPresent(System.out::println);

    }
}
