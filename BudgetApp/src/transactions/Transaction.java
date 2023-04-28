package transactions;

import com.category.Category;

import java.time.LocalDate;

public class Transaction implements Comparable<Transaction> {

    private Payee payee;
    private LocalDate date;
    private double amount;
    private Category category;

    public Transaction(Payee payee, double amount, Category category) {
        this.payee = payee;
        this.date = LocalDate.now();
        this.amount = amount;
        this.category = category;
        updateCategory();
    }

    public Payee getPayee() {
        return payee;
    }

    public void setPayee(Payee payee) {
        this.payee = payee;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    private void updateCategory() {
        this.category.setUsedAmount(this.category.getUsedAmount() + this.amount);
        this.category.setAvailableAmount(this.category.getAvailableAmount() - this.amount);
    }

    @Override
    public int compareTo(Transaction o) {
        return 0;
    }

    @Override
    public String toString() {
        return date +
                " " + payee +
                " " + category.getName() +
                " " + amount;
    }
}
