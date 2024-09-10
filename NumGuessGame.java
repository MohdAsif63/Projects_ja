import java.util.Random;  // Library for Random Number
import java.util.Scanner; // for Scanner Class 
public class NumGuessGame {
          private static final int MIN_RANGE = 1;      /* Declared Variables  */
          private static final int MAX_RANGE = 100;
          private static final int MAX_ATTEMPTS = 10;
          private static final int MAX_ROUNDS = 2;

          public static void main(String[] args) {
                    Random random = new Random();
                    Scanner Scanner = new Scanner(System.in);
                    int totalScore = 0;

                    System.out.println("Number Guessing Game");
                    System.out.println("Total Number of Rounds : 5");
                    System.out.println("Attempts to Guess Number In Each Round : 10\n");
                    
                    for (int i = 1; i <= MAX_ROUNDS; i++) {
                              int number = random.nextInt(MAX_RANGE) + MIN_RANGE;
                              int attempts = 0;

          System.out.printf("Round %d: Guess The Numbe Between %d and %d in  %d attempts.\n", i,MIN_RANGE, MAX_RANGE, MAX_ATTEMPTS);
                    
            while (attempts < MAX_ATTEMPTS) {
                      System.out.println("Enter Your Guess : ");
                              int guess_num = Scanner.nextInt();
                               attempts += 1;

                       /* check The Input Number Is Greater Less or Equals With The Help of  
                       These condition*/

                     if (guess_num == number) {
                                        int score = MAX_ATTEMPTS - attempts;
                                        totalScore += score;
                                        System.out.printf("Hurray! Number Guessed Successfully. Attempts = %d. Round Score = %d\n",
                                          attempts, score);
                                          break;
                    } 

                              else if (guess_num < number) {
                                System.out.printf("The number is Greater Than %d. Attempts Left = %d\n",  guess_num, MAX_ATTEMPTS - attempts);
                                        } 

                              else if (guess_num > number) {
                               System.out.printf("The Number is Less Than %d. Attempts Left = %d.\n",guess_num, MAX_ATTEMPTS - attempts);
                              }
                    }

                              if (attempts == MAX_ATTEMPTS) {
                                     System.out.printf("\nRound = %d\n", i);
                                     System.out.println("Attempts = 0");
                                     System.out.printf("The Random Number Is : %d\n\n", number);
                              }
                    }
                    System.out.printf("Game Over. Total Score = %d\n", totalScore);
                    Scanner.close();
          }
}