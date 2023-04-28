package com.menu;

public class AccountMenu  implements Menu {
    @Override
    public void showMenu() {
        System.out.println("1. Add transaction");
        System.out.println("2. List all transactions");
        System.out.println("3. Edit transaction");
        System.out.println("3. Reconcile balance");
        System.out.println("4. Go back");
        System.out.println("5. Exit");
    }
}
