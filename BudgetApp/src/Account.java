import java.util.List;

public class Account {

    private String name;
    private Double balance;
    private AccountType type;
    private List<Transaction> transactions;
    private Integer assignedMoney;

    public Account(String name, Double balance, AccountType type, List<Transaction> transactions, Integer assignedMoney) {
        this.name = name;
        this.balance = balance;
        this.type = type;
        this.transactions = transactions;
        this.assignedMoney = assignedMoney;
    }


}
