package Demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.IntStream;

public class SecondHightest {

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99,99};

        int position = 2;

        System.out.println("Second highest element in the array is: " +
                Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).distinct().skip(position - 1).findFirst().orElse(null));
    }
}
