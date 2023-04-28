package com.menu;

public class TransactionMenu implements Menu {
    @Override
    public void showMenu() {
        System.out.println("1. Change name");
        System.out.println("2. Change amount");
        System.out.println("3. Change category");
        System.out.println("4. Change date");
        System.out.println("5. Change payee");
        System.out.println("6. Go back");
        System.out.println("7. Exit");
    }
}
