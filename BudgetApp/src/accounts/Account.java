package accounts;

public abstract class Account {
    private String name;
    private Double balance;

    public Account(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
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
