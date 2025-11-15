package Practise;

public class SumOfArrayUsingRecurssion {

    static int sum_array_recurr_algo(int[] arr, int index) {

        //base condition
        if (index > arr.length - 1) {
            return 0;
        }

<<<<<<< HEAD
        System.out.println("Sonar Fix number 3 applied");
=======
        System.out.println("Sonar Fix number 2 applied");
>>>>>>> fa7a9c1a1408aa05b27cf27432789900be8317d3

        return arr[index] + sum_array_recurr_algo(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4};

        int sum = sum_array_recurr_algo(arr, 0);
        System.out.println(sum);
<<<<<<< HEAD
        System.out.println("SOME SONAR ISSUES FIXED");
=======
        System.out.println("Sonar fixed applied");
>>>>>>> fa7a9c1a1408aa05b27cf27432789900be8317d3
    }
}
