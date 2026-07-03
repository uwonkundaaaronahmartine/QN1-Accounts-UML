import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public double totalWorth() {
        double sum = 0;

        for (int i = 0; i < accounts.size(); i++) {
            Account bankAccount = accounts.get(i);
            sum = sum + bankAccount.getBalance();
        }

        return sum;
    }

    public String getName() {
        return name;
    }
}
