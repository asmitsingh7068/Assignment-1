package Github;

import java.util.Scanner;

public class ATMSimulatorWithOopsConcept {
    private double balance;

    // Constructor
    ATMSimulatorWithOopsConcept(double balance) {
        this.balance = balance;
    }

    // Check balance user ,...........
    void checkBalance() {
        System.out.println("Your Balance is: " + balance);
    }

    // Deposit money user .....
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("You deposited: " + amount + " | Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw money ......
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("You withdrew: " + amount + " | Current Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }

    // Menu for checking
    void menu() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <1000; i++) {
            System.out.println("----- ATM Menu -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    return; // Exit loop
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static void main(String[] args) {
        ATMSimulatorWithOopsConcept atm = new ATMSimulatorWithOopsConcept(0.0);
        atm.menu();
    }
}
