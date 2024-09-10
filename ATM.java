import java.util.Scanner;

public class ATM {
          public static void main(String[] args) {
                    try (Scanner sc = new Scanner(System.in)) {
                              int Balance = 10000, Deposite, Withdraw;

                              while (true) {
                                        System.out.println("1. Deposite");
                                        System.out.println("2. Withdraw");
                                        System.out.println("3. Balance");
                                        System.out.println("4. Exit");
                                        System.out.print("Choose Correct Operation To Perform : ");

                                        int ch = sc.nextInt();

                                        switch (ch) {
                                                  case 1:
                                                            System.out.print("Enter Amount You Want To Deposite : ");
                                                            Deposite = sc.nextInt();
                                                            Balance = Balance + Deposite;
                                                            System.out.println("Your Updated Balance Is : " + Balance);
                                                            System.out.println();
                                                            break;

                                                  case 2:
                                                            System.out.print("Enter The Amount You Want To Withdraw : ");
                                                            Withdraw = sc.nextInt();
                                                            if (Balance >= Withdraw) {
                                                                      Balance = Balance - Withdraw;
                                                                      System.out.println("Your Updated Balance : " + Balance);
                                                            } else {
                                                                      System.out.println("InSufficient Balance...!!! ");
                                                            }
                                                            System.out.println();
                                                            break;

                                                  case 3:
                                                            System.out.println("Your Account Balance : " + Balance);
                                                            System.out.println();
                                                            break;

                                                  case 4:
                                                            System.out.println();
                                                            System.out.println("Thank You...!\nYour Transaction is Completed...!\nCollect Your Card...!");
                                                            System.exit(0);
                                        }
                                      
                              }
                    }
          }
}
