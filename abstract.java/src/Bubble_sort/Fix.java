package Bubble_sort;

import java.util.Arrays;

public class Fix {
    public static void main(String[] args){
        int[] array = {9, 2 ,6, 5, 6, 1, 3 ,0};
        int [] newArr = bubble(array);
        System.out.println(Arrays.toString(newArr));
    }

    static int[] bubble(int[] arr){
        int n = arr.length -1;

        for (int i=0; i<=n; i++){

            for (int j=0; j<=n-i-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }return arr;
    }
}