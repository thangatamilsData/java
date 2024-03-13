package ExCode;

import java.util.Arrays;

public class revNum {
    public static void main(String[] args){

        int a = 1008;

        String b = "Hello World";

        String a1 = new StringBuilder(Integer.toString(a)).reverse().toString();
        String b1 = new StringBuilder(b).reverse().toString();
        display(a, a1);
        display(a, b1);

        String[] arrB = b.split("");
        System.out.println(Arrays.toString(arrB));

        String[] arrA = Integer.toString(a).split("");
        System.out.println(Arrays.toString(arrA));

    }

    static void display(int A, String a1){
        if(!Integer.toString(A).equals(a1)){
            System.out.println(a1);
        }else{
            System.out.println(A);
        }
    }


}
