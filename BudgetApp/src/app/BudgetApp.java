package app;


import budgets.Budget;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {

    private List<Budget> budgets;
    private Scanner scanner;

    public BudgetApp() {
        budgets = new ArrayList<Budget>();
        scanner = new Scanner(System.in);
    }
    public void run() {
        while (true) {
            printMenu();
            int option = scanner.nextInt();
            if (option >4 || option < 1) {
                throw new IllegalArgumentException("Invalid option");
            }
        }
    }

    public void printMenu() {
        System.out.println("Welcome to the Budget App!");
        System.out.println("Please select an option:");
        System.out.println("1. Create a new budget");
        System.out.println("2. List all budgets");
        System.out.println("3. Access a budget");
        System.out.println("4. Exit");
    }
}

