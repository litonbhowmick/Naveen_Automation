package Demo;

import java.util.Arrays;

public class Prac {

    public static void main(String[] args) {

        int input = 1230;
        int sum = 0;
        int reminder;

        while(input > 0){
            reminder = input % 10;
            sum = sum * 10 + reminder;
            input = input / 10;
        }

        System.out.println(sum);

    }
}
