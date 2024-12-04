package Bank_account;

import java.util.Scanner;

public class Bank {
    public static void main(String args[]) {
        int pin = 1234;
        int balance = 1000;
        int AddAmount = 0;
        int TakeAmount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin");

        int password = scanner.nextInt();

        if (password == pin) {
            System.out.println("enter your name");
            String name = scanner.next();
            System.out.println("welcome " + name);
            boolean ex = true;
            while (ex) {

                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to AC Detail");
                System.out.println("Press 5 to exit");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("your current balance is " + balance);
                        break;
                    case 2:
                        System.out.println("How much did you want to add to your amount");
                        AddAmount = scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance = AddAmount + balance;
                        break;

                    case 3:
                        System.out.println("How much amount did you want to take");
                        TakeAmount = scanner.nextInt();
                        if (TakeAmount > balance) {
                            System.out.println("InSufficient balance");
                            System.out.println("try less than your balance");
                        } else {
                            System.out.println("Successfully taken");
                            balance = balance - TakeAmount;
                        }
                        break;
                    case 4:
                        System.out.println("Account detail");
                        System.out.println("available balance is" + balance);
                        System.out.println("amount deposited" + AddAmount);
                        System.out.println("amount taken" + TakeAmount);
                        System.out.println("Thank you");
                        break;
                    default:
                        // System.out.println("exit press 5");
                        break;

                }
                if (opt == 5) {
                    System.out.println("thankyou");
                    ex = false;
                }
            }
        } else {
            System.out.println("your pin number is wrong!! chech the pin number");

        }

    }

}
