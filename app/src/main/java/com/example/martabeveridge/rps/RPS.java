package com.example.martabeveridge.rps;

import java.util.Random;

public class RPS {


    public static String randomComputerChoice(){
        String result = "";
        Random rand = new Random();
        int randomNumber = rand.nextInt(3) + 1;

        if (randomNumber == 1) {
            result = "Paper";
        } else if (randomNumber == 2) {
            result = "Rock";
        } else {
            result = "Scissors";
        }
        return result;
    }

    public static String compareAnswers(String playerChoice, String computerChoice){

        String winnerBlurb = "";

        if (playerChoice.equals(computerChoice)){
            winnerBlurb = "it's a draw. ";
        }else if ((playerChoice.equals("Rock") && computerChoice.equals("Scissors"))
                || (playerChoice.equals("Paper") && computerChoice.equals("Rock") )
                || (playerChoice.equals("Scissors") && computerChoice.equals("Paper"))){
            winnerBlurb = "you win! ";
        }else{
            winnerBlurb = "the computer wins! ";
        }

        String result = "You played " + playerChoice.toLowerCase() + " and the computer played " +computerChoice.toLowerCase() + ". \n \n Therefore, " + winnerBlurb;

        return result;
    }




}
