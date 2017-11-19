package com.kodilla.stream.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class RockPaperScissors {
    private static boolean playAgain(Scanner scanner){
        System.out.println("Do You want to play again? Y(6),N(7)?");
        switch (scanner.nextInt()){
            case 6:
                System.out.println("Rock, Paper, Scissors!");
                return true;
            default:
                System.out.println("Thanks for playing Dude!");
                return false;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        RPSPlayer computer = new RandomComputerPlayer(new Random());
        RPSPlayer human = new HumanPlayer(scanner);

        System.out.println("Rock Paper Scissors");
        do {
            String com = computer.play();
            String player = human.play();

            System.out.println(com + " 1<-> "+ player);
            if (player.equals(com)){
                System.out.println("TIE!");

            } else if (("Rock".equals(player) && "Scissors".equals(com)) ||
                    ("Scissors".equals(player) && "Paper".equals(com)) ||
                    ("Paper".equals(player) && "Rock".equals(com)) ) {
                System.out.println("Human Player wins!");
            } else {
                assert (("Rock".equals(com) && "Scissors".equals(player)) ||
                        ("Scissors".equals(com) && "Paper".equals(player)) ||
                        ("Paper".equals(com) && "Rock".equals(player)));
                System.out.println("Human Player lost!");
            }
        } while (playAgain(scanner));


    }
}
