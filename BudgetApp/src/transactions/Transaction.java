package transactions;

import java.time.LocalDate;

public class Transaction implements Comparable<Transaction> {

    private Payee payee;
    private LocalDate date;
    private double amount;

    public Transaction(Payee payee, LocalDate date, double amount) {
        this.payee = payee;
        this.date = date;
        this.amount = amount;
    }

    @Override
    public int compareTo(Transaction o) {
        return 0;
    }
}
