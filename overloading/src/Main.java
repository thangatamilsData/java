import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(first(5.5F, 1.2F));
        System.out.println("Method overloading "+first(5, 1));


        Scanner val = new Scanner(System.in);
        System.out.println("Enter the value :");
        int a = val.nextInt();

        if(a <= 0){
            System.out.println("Enter a larger number");
        }else {
            System.out.println("Factorial of "+a +"is "+ recursion(a));
        }

    }
    static int first(int a, int b){
        return a<b?b:a;
    }

    static float first(float a, float b){
        return a<b?a:b;
    }


    static int recursion(int n){
        if(n <= 1){
            return n;
        }else {
            return n * recursion(n-1);
        }
    }
}

