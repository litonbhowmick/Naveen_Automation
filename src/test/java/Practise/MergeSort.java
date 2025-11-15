package Practise;

import java.util.Arrays;

public class MergeSort {

    static void sorting_algo(int[] left_array, int[] right_array, int[] final_array) {

        //compare first index from the left array to first index of right array
        //if content/element in fisrt left array is < right array then push that element to final array
        //or else keep on iterating on the right array until left array
        int left_index = 0;
        int right_index = 0;
        int final_index = 0;

        while (left_index < left_array.length && right_index < right_array.length) {
            if (left_array[left_index] < right_array[right_index]) {
                final_array[final_index] = left_array[left_index];
                left_index++;
            } else {
                final_array[final_index] = right_array[right_index];
                right_index++;
            }
            final_index++;
        }

        while (left_index < left_array.length) {
            final_array[final_index] = left_array[left_index];
            left_index++;
            final_index++;
        }

        while (right_index < right_array.length) {
            final_array[final_index] = right_array[right_index];
            right_index++;
            final_index++;
        }

    }

    static void merge_sort(int[] array) {

        if (array.length == 1) {
            return;
        }

        //break into left and right array until length of the array is 1
        int left = 0;
        int right = array.length;
        int middle = (left + right) / 2;

        //left array
        int[] left_array = new int[middle];
        for (int i = 0; i < left_array.length; i++) {
            left_array[i] = array[i];
        }

        //right array
        int[] right_array = new int[right - middle];
        for (int i = middle; i < array.length; i++) {
            right_array[i - middle] = array[i];
        }

        merge_sort(left_array);
        merge_sort(right_array);

        sorting_algo(left_array, right_array, array);
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 1, 10, 6, 8};
        merge_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
