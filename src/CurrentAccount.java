public class CurrentAccount extends Account {
    private double overdraft;

    public CurrentAccount(String accountNo, double opening, double overdraft) {
        super(accountNo, opening);
        this.overdraft = overdraft;
    }

    public boolean withdraw(double money) {
        double lowestAllowed = 0 - overdraft;
        double possibleBalance = balance - money;

        if (money <= 0) {
            return false;
        }

        if (possibleBalance >= lowestAllowed) {
            balance = possibleBalance;
            return true;
        }

        return false;
    }
}
