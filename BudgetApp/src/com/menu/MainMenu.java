package com.menu;

public class MainMenu implements Menu{
    @Override
    public void showMenu() {
        System.out.println("Welcome to the Budget App!");
        System.out.println("Please select an option:");
        System.out.println("1. Create a new budget");
        System.out.println("2. List all budgets");
        System.out.println("3. Access a budget");
        System.out.println("4. Exit");
    }
}
