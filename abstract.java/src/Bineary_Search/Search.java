package Bineary_Search;

import java.util.Arrays;

public class Search {
    public static void main(String[] args){
        int[] array = {1, 2, 15, 10, 6, 7, 8, 9};
        int[] newArr = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(newArr));
        int target = 6;
        System.out.println("Target is "+ target);
        int b = bineary_search(newArr, target);

        System.out.println("the index of "+ target + " is " + b);
    }

    static int bineary_search(int [] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
