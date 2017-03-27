/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class NumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Random random = new Random();
    final int START = 2;
    final int END = 12;
    final int WINNING_NUMBER_1 = 7 ;
    final int WINNING_NUMBER_2 = 11 ;
    final int LOSING_NUMBER_1 = 3 ;
    final int LOSING_NUMBER_2 = 6 ;
    
    
    int luckyNumber ;
    int nextNumber ;
    int gamesWon = 0 ;
    int gamesPlayed = 0 ;
    
    Scanner scan = new Scanner ( System.in ) ;
    String answer = "" ;
    
    do
    {
      gamesPlayed++ ;
      
      luckyNumber = random.nextInt( END - START + 1) + START ;
      System.out.println ( "Winning numbers are 7, 11, or Lucky Number. ");
      System.out.println ( "Losing numbers are 3 and 6. ");
      System.out.println ( "--> Your lucky number is: " + luckyNumber ) ;
      
      if ( ( luckyNumber == WINNING_NUMBER_1 ) || ( luckyNumber == WINNING_NUMBER_2 ) )
      {
        System.out.println ( "WINNER!" );
        gamesWon++ ;
      }
      else if ( ( luckyNumber == LOSING_NUMBER_1 ) || ( luckyNumber == LOSING_NUMBER_2 ) ) 
      {
        System.out.println ( "YOU LOSE!" ) ;
      }
      else
      {
        do
        {
          nextNumber = random.nextInt( END - START + 1) + START   ;
          System.out.println ( "Next number is: " + nextNumber ) ;
          
        } while ( ! ( ( luckyNumber == nextNumber ) || ( nextNumber == LOSING_NUMBER_1 ) || ( nextNumber == LOSING_NUMBER_2 )
                         || ( nextNumber == WINNING_NUMBER_1 ) || ( nextNumber == WINNING_NUMBER_2) ) ) ;
        
        if (( luckyNumber == nextNumber) || (nextNumber == WINNING_NUMBER_1 ) ||  (nextNumber == WINNING_NUMBER_2))
        {
          System.out.println ( "WINNER!" ) ;
          gamesWon++ ;
        }
         else if ( ( nextNumber == LOSING_NUMBER_1 ) || ( nextNumber == LOSING_NUMBER_2 ) ) 
        {
            System.out.println ( "LOSER!" ) ;
        }
      }
      System.out.print( "The game is over, would you like to play again? (yes / no) " );
      answer = scan.next ( ).toLowerCase ( ) ;
      
    } while ( answer.equals( "yes" ) ) ;
    
    System.out.println ( "You won " + gamesWon + " out of " + gamesPlayed + " games played. " ) ;
    }
    
}
