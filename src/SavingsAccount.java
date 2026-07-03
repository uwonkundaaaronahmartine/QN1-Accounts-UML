public class SavingsAccount extends Account {
    private double rate;

    public SavingsAccount(String accountNo, double opening, double rate) {
        super(accountNo, opening);
        this.rate = rate;
    }

    public boolean withdraw(double money) {
        double newBalance = balance - money;

        if (money <= 0) {
            return false;
        }

        if (newBalance >= 0) {
            balance = newBalance;
            return true;
        }

        return false;
    }

    public void addInterest() {
        double extraMoney;
        extraMoney = (rate / 100) * balance;
        balance = balance + extraMoney;
    }
}
