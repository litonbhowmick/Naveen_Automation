package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class HighestNum {

    static ArrayList<String> al = new ArrayList<>();
    static void permute(String str, String index){
        if (str.length()==0){
            al.add(index+"");
        } else {
            for (int i = 0; i < str.length(); i++) {
                String current = String.valueOf(str.charAt(i));
                String remaining = str.substring(0,i)+str.substring(i+1);
                permute(remaining, index+current);
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {3,30,54,9};
        String expected = "1100";

        String str = Arrays.stream(nums).boxed().map(String::valueOf).reduce((x, y)->x+y).get();

        permute(str, "");
        System.out.println(al.stream().map(Integer::parseInt).distinct().sorted(Collections.reverseOrder()).findFirst().get());

    }
}
