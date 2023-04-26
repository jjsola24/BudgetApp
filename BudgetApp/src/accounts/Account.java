package accounts;

import transactions.Transaction;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private String name;
    private Double balance;

    private List<Transaction> transactions;

    public Account(String name, Double balance) {
        this.name = name;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public boolean withdraw(Double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
}
