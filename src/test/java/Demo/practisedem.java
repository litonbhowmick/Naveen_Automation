package Demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class practisedem {
    public static void main(String[] args) {

        String text = "Bank of baroda";

        String[] words = text.split(" ");
        String rev = "";


        for (int i = 0; i < words.length; i++) {
            String[] arr=words[i].split("");
            for (int j = arr.length -1 ; j >= 0; j--) {
                rev = rev + arr[j];
            }
            words[i] = rev;
            rev = "";
        }

        System.out.println(Arrays.toString(words));







    }
}
