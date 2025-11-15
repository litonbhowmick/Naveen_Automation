package Demo;

import java.util.ArrayList;
import java.util.Arrays;

public class demoprac {

    public static void main(String[] args) {

        String s1 = "listennn";
        String s2 = "silentnn";

        char[] arr1 = s1.toCharArray();
        
        if (s1.length()==s2.length()) {

            for (int i = 0; i < s1.length(); i++) {
                for (int j = i + 1; j < s1.length(); j++) {
                    if (arr1[i] < arr1[j]) {
                        char temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }


            ArrayList<Character> al1 = new ArrayList<>();
            for (int i = 0; i < arr1.length; i++) {
                al1.add(arr1[i]);
            }

            System.out.println(al1);

            char[] arr2 = s2.toCharArray();

            for (int i = 0; i < s2.length(); i++) {
                for (int j = i + 1; j < s2.length(); j++) {
                    if (arr2[i] < arr2[j]) {
                        char temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }
                }
            }

            ArrayList<Character> al2 = new ArrayList<>();
            for (int i = 0; i < arr2.length; i++) {
                al2.add(arr2[i]);
            }

            System.out.println(al2);

            boolean flag = true;
            for (int i = 0; i < al1.size(); i++) {
                if (!al1.get(i).equals(al2.get(i))) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("anagram");
            } else {
                System.out.println("Not an anagram");
            }
        } else{
            System.out.println("Not an anagram");
        }




    }
}
