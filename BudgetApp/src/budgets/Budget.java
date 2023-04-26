package budgets;

import accounts.Account;

import java.util.List;

public class Budget {
    private String name;
    private List<Account> accounts;

    public Budget(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
