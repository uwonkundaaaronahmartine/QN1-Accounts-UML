public abstract class Account implements Statement {
    protected String accountNo;
    protected double balance;

    public Account(String accountNo, double opening) {
        this.accountNo = accountNo;
        balance = opening;
    }

    public void deposit(double money) {
        if (money > 0) {
            balance += money;
        }
    }

    public abstract boolean withdraw(double money);

    public double getBalance() {
        return balance;
    }

    public String generateStatement() {
        String message = "Account " + accountNo + " has balance UGX " + balance;
        return message;
    }
}
