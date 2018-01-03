package com.company;

public class Main {

    public static void main(String[] args) {
	 IDice d = new Dice();
        for (int i = 0; i<100; i++){
            String dice = "50d3";
            int result = d.throwDice(dice, -100);
            int max = d.maxPossible(dice);
            System.out.println(result + "/"+max + " --- " + d.resultPercentage(result, max) );
        }
    }
}
