package com.kodilla.rps;

import java.util.Scanner;

public class HumanPlayer implements RPSPlayer {
    private final Scanner scanner ;

    public HumanPlayer(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String play() {
        System.out.println("Select 1,2,3 for Rock, Paper, Scissors");
        int choice = this.scanner.nextInt();
        return RPSPlayer.OPTIONS[choice - 1];

    }
}
