package spin;

import java.util.Arrays;
import java.util.Scanner;

public class donut {
    public static void main(String[] args){
        int user_win = 0;
        int pc_win = 0;
        String [] options = {"rock", "paper", "scissors"};

        while(true){
            Scanner a = new Scanner(System.in);
            System.out.println("Enter the value :");
            String input = a.nextLine().toLowerCase();


            if(input.equals("q")){
                break;
            }else if(!Arrays.asList(options).contains(input)){
                System.out.println("Enter the Correct key to access :");
                continue;
            }

            String rand = options[(int)Math.floor(Math.random()*3)];

            if(input.equals(rand)){
                System.out.println("Draw!");
                continue;
            }else if(input.equals("rock") && rand.equals("scissors")){
                System.out.println("user Win :)");
                user_win +=1;
                continue;
            }else if(input.equals("paper") && rand.equals("rock")){
                System.out.println("user win :) ");
                user_win +=1;
                continue;
            }else if(input.equals("scissors") && rand.equals("paper")){
                System.out.println("User win :) ");
                user_win +=1;
                continue;
            }else {
                System.out.println("PC wins !");
                pc_win +=1;
                continue;
            }
        }
        System.out.println("User wins " + user_win + " times" + "\n" + "Computer wins " + pc_win + " times" );


    }
}
