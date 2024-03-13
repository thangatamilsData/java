package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the value :");
            int a = input.nextInt();

            if(a <= 0){
                System.out.println("Please Enter the larget number :");
            }else{
                System.out.println("the factorial of your number is : " + recursion(a));
            }
        }
    }

    static int recursion(int n){
        if(n == 1){
            return (n);
        }else{
            return (n * recursion(n - 1));
        }
    }
}
