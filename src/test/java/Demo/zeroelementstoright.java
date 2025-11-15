package Demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class zeroelementstoright {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 2, 3, 12, 0, 5, 0};

        int[] nonzeroarr = new int[arr.length];

        int index = 0;
        for (int i = 0; i < nonzeroarr.length; i++) {
            if (arr[i] != 0) {
                nonzeroarr[index] = arr[i];
                index++;
            }
        }
        Arrays.stream(nonzeroarr).forEach(System.out::println);
    }

}
