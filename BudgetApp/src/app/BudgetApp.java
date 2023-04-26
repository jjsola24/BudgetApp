package app;


import budgets.Budget;

import java.util.*;

public class BudgetApp {

    private Map<String,Budget> budgets;
    private Scanner scanner;

    public BudgetApp() {
        budgets = new HashMap<>();
        scanner = new Scanner(System.in);
    }
    public void run() {
        while (true) {
            printMenu("main");
            int option = scanner.nextInt();
            if (option >4 || option < 1) {
                throw new IllegalArgumentException("Invalid option");
            }
            switch (option) {
                case 1:
                    //Create a new budget
                    System.out.println("What is the name of the budget?");
                    String name = scanner.next();
                    if (createBudget(name)) {
                        //print name of created budget
                        System.out.println("Budget " + name + " created");
                    }
                    break;
                case 2:
                    //List all budgets
                    listBudgets();
                    break;
                case 3:
                    //Access a budget
                    Budget workingBudget = null;
                    System.out.println("What is the name of the budget?");
                    String budgetName = scanner.next();
                    workingBudget = accessBudget(budgetName);
                    if (workingBudget != null) {
                        printMenu("budget");
                        break;
                    }
                    break;
                case 4:
                    return;
            }
        }
    }

    public void printMenu(String menu) {
        switch (menu) {
            case "main":
                System.out.println("Welcome to the Budget App!");
                System.out.println("Please select an option:");
                System.out.println("1. Create a new budget");
                System.out.println("2. List all budgets");
                System.out.println("3. Access a budget");
                System.out.println("4. Exit");
                break;
            case "budget":
                System.out.println("What do you want to do?");
                System.out.println("1. Create a new transaction");
                System.out.println("2. List all transactions");
                System.out.println("3. Edit budget's name");
                System.out.println("4. Exit");
                break;
        }
    }

    public boolean createBudget(String name) {
        if (budgets.containsKey(name)) {
            System.out.println("Budget already exists");
            return false;
        }

        budgets.put(name, new Budget(name));
        return true;
    }

    public void listBudgets() {
        for (Map.Entry<String, Budget> kv : budgets.entrySet()) {
            System.out.println(kv.getKey());
        }
    }

    public Budget accessBudget(String name) {
        Budget workingBudget = null;
        for (Map.Entry<String, Budget> kv : budgets.entrySet()) {
            if (kv.getKey().equals(name)) {
                workingBudget = kv.getValue();
                return workingBudget;
            }

            System.out.println("Budget " + name + " does not exist");
            break;
        }
        return workingBudget;
    }
}

