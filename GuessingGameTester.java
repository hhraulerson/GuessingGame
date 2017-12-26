/**
 Program that tests the GuessingGame class.
 
 @author Hiram Raulerson
 @version 2.0
 
 E-mail Address: hhr3@students.uwf.edu.
 
 Last Changed: September 4, 2015.
 
 COP5007	Project #: 1
 File Name: GuessingGameTester.java
*/

import java.util.Scanner;

public class GuessingGameTester
{
   public static void main(String[] args)
   {
      char playGame = 'Y';
      String stringToParse = "";
      
      System.out.println("Welcome to the Guessing Game!");
      
      while (playGame == 'Y' || playGame == 'y')
      {
         int userGuess = 0;
         Scanner keyboard = new Scanner(System.in);
         
         System.out.println("Enter the maximum number that you want to try to guess:");          
         int maxNumber = keyboard.nextInt();
         
         System.out.println("Enter the max number of guesses allowed:");
         int guessesAllowed = keyboard.nextInt();
         
         GuessingGame newGuessGame = new GuessingGame(maxNumber);
         newGuessGame.newGame(guessesAllowed);
         
         // loop condition tests whether gameOver is set to true
         while (!newGuessGame.isGameOver())
         {
            System.out.println("Enter your guess.  Remember it must be between 0 and " + maxNumber);
            userGuess = keyboard.nextInt();
            
            System.out.println(newGuessGame.guess(userGuess));
            System.out.println();
         }
         
         System.out.println("Would you like to play another game?  Enter Y or N.");
         
         // sets stringToParse to the next String entered by the user
         stringToParse = keyboard.next();
         
         // sets playGame to the first char of stringToParse
         playGame = stringToParse.charAt(0);
      }
   }
}