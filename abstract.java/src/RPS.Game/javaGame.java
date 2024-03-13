package RPS.Game;

import java.util.Arrays;
import java.util.Scanner;

public class javaGame {
    public static void main(String[] args){
        // Rock / Paper / Scissors

        int User_win = 0;
        int computer_win = 0;
        String [] options = {"rock", "paper", "scissors"};
        int count = 0;


        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Rock / Paper / Scissors or Quit(q) : ");
            String inpVal = input.nextLine().toLowerCase();


            if (inpVal.equals("q")){
                break;
            }

            if (!Arrays.asList(options).contains(inpVal)){
                System.out.println("Enter the Correct Key word! ");
                continue;
            }

            int random = (int)Math.floor(Math.random()*3);
            String PC_pick = options[random];
            System.out.println("PC pick : " + PC_pick);

            if (inpVal.equals(PC_pick)){
                System.out.println("DRAW !");
            }
            else if (inpVal.equals("rock") && PC_pick.equals("scissors")){
                User_win +=1;
                System.out.println("You won !");
            }else if(inpVal.equals("paper") && PC_pick.equals("rock")){
                User_win +=1;
                System.out.println(("You won !"));
            }else if(inpVal.equals("scissors")  && PC_pick.equals("paper")){
                User_win +=1;
                System.out.println(("You won !"));
            }else {
                computer_win +=1;
                System.out.println("PC won :)");
            }
        }
        System.out.println("User wins " + User_win+ " times" + " PC wins "+ computer_win);

    }

}
