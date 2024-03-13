package ExCode;

import java.util.Scanner;

public class RecurOnString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String a = input.nextLine();

        if(a.equals("")){
            System.out.println("Enter the String ::");
        }else{
            System.out.println(recursion(a));
        }

    }

    static String recursion(String n){
        if(n.equals("")){
            return "";
        }else{
            return n.charAt(n.length() - 1) + recursion(n.substring(0, n.length() - 1));
        }
    }
}
