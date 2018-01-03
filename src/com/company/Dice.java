package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice implements IDice {

    private Random rand;

    public Dice() {
        rand = new Random();
    }

    private int baseDice(int faces){
        return rand.nextInt(faces) + 1;
    }

    @Override
    public int throwDice(String dice) {
        dice = dice.toLowerCase();
        String[] contents = dice.split("d");
        int numberOfDices = Integer.parseInt(contents[0]);
        int diceType = Integer.parseInt(contents[1]);
        int result = 0;

        for (int i = 0; i < numberOfDices; i++) {
            result += baseDice(diceType);
        }

        return result;
    }

    @Override
    public int throwDice(String dice, int otherStats) {
        return throwDice(dice) + otherStats;
    }

    @Override
    public int maxPossible(String dice) {
        dice = dice.toLowerCase();
        String[] contents = dice.split("d");
        int numberOfDices = Integer.parseInt(contents[0]);
        int diceType = Integer.parseInt(contents[1]);

        return numberOfDices * diceType;
    }

    @Override
    public int bestOfThrows(String dice, int throwNumber) {
        List<Integer> diceThrows = new ArrayList<>();

        for (int i = 0; i < throwNumber; i++) {
            diceThrows.add(throwDice(dice));
        }

        return diceThrows
                .stream()
                .max(Integer::compareTo)
                .get();
    }

    @Override
    public double resultPercentage(int result, int max) {
        return (result * 100.0) / max ;
    }
}
