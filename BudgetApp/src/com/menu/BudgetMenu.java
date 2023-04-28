package com.menu;

import java.sql.SQLOutput;

public class BudgetMenu implements Menu {
    @Override
    public void showMenu() {
        System.out.println("1. Create a new account");
        System.out.println("2. List all accounts");
        System.out.println("3. Edit budget's name");
        System.out.println("4. Go back");
        System.out.println("5. Exit");
    }
}
