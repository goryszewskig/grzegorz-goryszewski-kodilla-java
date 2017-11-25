package com.kodilla.rps;

import java.util.Random;

public class RandomComputerPlayer implements RPSPlayer{
    private final Random random;

    public RandomComputerPlayer(Random random) {
        this.random = random;
    }

    @Override
    public String play() {
        return OPTIONS[this.random.nextInt(OPTIONS.length)];
    }
}
