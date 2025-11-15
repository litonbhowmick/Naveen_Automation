package test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class sorting {

    public static void main(String[] args) {

        int[] a1 = {6,8,3,1};
        int[] a2 = {8,10};
        int[] arr = IntStream.concat(Arrays.stream(a1),Arrays.stream(a2)).toArray();
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println(set);

    }
}
