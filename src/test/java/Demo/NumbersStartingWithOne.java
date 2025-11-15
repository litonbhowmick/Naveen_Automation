package Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWithOne {

    public static void main(String[] args) {

        int[] arr = {1,2,12,32,45,11,110};

        List<Integer> list =
                Arrays.stream(arr).mapToObj(String::valueOf).filter(x -> x.startsWith("1")).map(Integer::parseInt).collect(Collectors.toList());

        System.out.println(list);

    }
}
