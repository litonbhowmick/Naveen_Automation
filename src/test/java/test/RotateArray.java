package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {78, 99, 776, 10, 61, 6};
        int n = 2;

        // Normalize n if it's greater than array length
        //n = n % arr.length;

        int[] rotated = new int[arr.length];

        // Copy last 'n' elements to the front
        System.arraycopy(arr, arr.length - n, rotated, 0, n);

        // Copy remaining elements after rotation
        System.arraycopy(arr, 0, rotated, n, arr.length - n);

        List<Integer> result = Arrays.stream(rotated)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}