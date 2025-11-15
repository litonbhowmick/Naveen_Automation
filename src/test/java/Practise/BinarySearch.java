package Practise;

public class BinarySearch {

    static int binary_search(int[] arr, int search, int left, int right) {
        //dig deep into the middle element untill the element is found and extract the index out of it
        //condition : if search element < middle then the element is on the left side
        //or else right side

        int middle = (left + right) / 2;

        if (search == arr[middle]) {
            return middle;
        }

        if (search < arr[middle]) {
            return binary_search(arr, search, left, middle);
        } else {
            return binary_search(arr, search, middle, right);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 7, 8};
        int search = 8;
        int index = binary_search(arr, search, 0, arr.length);
        System.out.println(index);

    }
}
