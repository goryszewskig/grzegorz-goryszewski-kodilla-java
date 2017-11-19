package com.kodilla.stream.rockpaperscissors;

import com.sun.javafx.scene.control.skin.ChoiceBoxSkin;

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
        return OPTIONS[choice - 1];

    }
}
