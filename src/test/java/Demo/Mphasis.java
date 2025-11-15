package Demo;

import java.util.Arrays;

public class Mphasis {

    public static void main(String[] args) {

        String input = "India is our country";

        String[] arr = input.split(" ");

        String temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].length() > arr[j].length()){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);

    }
}
