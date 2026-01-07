
import java.util.Scanner;

public class BankApp {

    void menu(BankAccount bankAccount) {
        int option = 0;

        while (option != 4) {

            System.out.println("Choose an option:\n"
                    + "1. Deposit money\n2. Withdraw money\n3. Show balance\n4. Exit program");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Type the amount of money you wish to deposit");
                    int depositAmount = scanner.nextInt();
                    bankAccount.deposit(depositAmount);
                    System.out.println("The money has been successfully deposited");
                    break;
                case 2:
                    System.out.println("Type the amount of money you wish to withdraw");
                    int withdrawAmount = scanner.nextInt();
                    bankAccount.withdraw(withdrawAmount);
                    System.out.println("The money has been successfully withdrew");
                    break;
                case 3:
                    System.out.println("Bank balance:\n" + bankAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Please choose a valid option");
            }
        }
    }

}