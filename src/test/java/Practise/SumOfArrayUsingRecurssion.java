package Practise;

public class SumOfArrayUsingRecurssion {

    static int sum_array_recurr_algo(int[] arr, int index) {

        //base condition
        if (index > arr.length - 1) {
            return 0;
        }

        return arr[index] + sum_array_recurr_algo(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4};

        int sum = sum_array_recurr_algo(arr, 0);
        System.out.println(sum);
        System.out.println("This is my master branch code changes and sonar shouldn't override it");
    }
}
