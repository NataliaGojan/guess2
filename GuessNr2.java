package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessNr2 {
    public static void main(String[] args) {

        Random r = new Random();
        int randomNr = r.nextInt(30) + 1;

        int nrOftries=0;

        Scanner input = new Scanner(System.in);

        boolean win = false;
        while (win==false) {
            System.out.println("Guess a random nr. form 1 to 30: ");
            int guessNr = input.nextInt();
            nrOftries++;

            if (guessNr == randomNr) {
                win = true;

            } else if (guessNr < randomNr) {
                System.out.println("Too low.");

            } else if (guessNr > randomNr) {
                System.out.println("Too high.");
            }
        }

        System.out.println("Right!");
        System.out.println("The nr. is " + randomNr + ".");
        System.out.println("It took you " + nrOftries + " tries. ");
    }
}