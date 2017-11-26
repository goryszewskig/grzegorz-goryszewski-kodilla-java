package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    private static boolean playAgain(Scanner scanner){
        System.out.println("Do You want to play (n) or end (x) ?");
        switch (scanner.next()){
            case "n":
                return areYouSure(scanner);
             case "x" :
                 return !areYouSure(scanner);

             default:
                    System.out.println("Invalid option!");
                    break;
        }
        return false;
    }

    private static boolean areYouSure(Scanner scanner){
        System.out.println("Are You sure y/n ?");
        switch (scanner.next()){
            case "y" :
                return true;
             case   "n":
                return false;
            default:
                System.out.println("Invalid option!");
                break;
        }

        return false;
    }

    private static void checkScore(String name, int p1, int p2){
        System.out.println(name + " vs Computer: " + p1 + "<->" + p2);
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        RPSPlayer computer = new RandomComputerPlayer(new Random());
        RPSPlayer human = new HumanPlayer(scanner);

        int humanScore = 0 ;
        int comScore = 0 ;

        String first_name;
        int endingScore;


        System.out.print("Enter your name: ");
        first_name = scanner.next();

        System.out.print("How much wins to end? ");
        endingScore = scanner.nextInt();


        System.out.println("Rock Paper Scissors");
        while (playAgain(scanner)){
            String com = computer.play();
            String player = human.play();

            System.out.println(com + " <-> "+ player);
            if (player.equals(com)){
                System.out.println("TIE!");
                System.out.println(first_name + " vs Computer: " + humanScore + "<->" + comScore);
                checkScore(first_name,humanScore,comScore);

            } else if (("Rock".equals(player) && "Scissors".equals(com)) ||
                    ("Scissors".equals(player) && "Paper".equals(com)) ||
                    ("Paper".equals(player) && "Rock".equals(com)) ) {
                System.out.println(first_name + " wins!");
                humanScore++;
                checkScore(first_name,humanScore,comScore);
            } else {
                assert (("Rock".equals(com) && "Scissors".equals(player)) ||
                        ("Scissors".equals(com) && "Paper".equals(player)) ||
                        ("Paper".equals(com) && "Rock".equals(player)));
                System.out.println(first_name + " lost!");
                comScore++;
                checkScore(first_name,humanScore,comScore);
            }
            if(humanScore == endingScore || comScore == endingScore){
                System.out.println("Ending Score!");
                break;
            }
        }


    }
}
