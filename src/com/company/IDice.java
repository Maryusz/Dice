package com.company;

/**
 * This interface represents all the possible and usefull methods for a dice or its result
 * manipulation.
 * @Author: Mariusz A. Bilda
 */
public interface IDice {

    /**
     * Throw a Dice from a String interpretation es "1d3"
     * @param dice
     * @return result of the throw
     */
    int throwDice(String dice);

    /**
     * Permits to throw a desidered dice and add (or subtract) other stats
     * @param dice
     * @param otherStats
     * @return
     */
    int throwDice(String dice, int otherStats);

    /**
     * Max value of a String interpreatation of a Dice
     * @param dice
     * @return es. 2d20 = 40 1d6 = 6
     */
    int maxPossible(String dice);

    /**
     * Throw dices passed as a String throwNumber times
     * @param dice
     * @param throwNumber
     * @return
     */
    int bestOfThrows(String dice, int throwNumber);

    /**
     * Given a result and its max it returns a percentage
     * @param result
     * @param max
     * @return percentage of the reult on it max
     */
    double resultPercentage(int result, int max);
}
