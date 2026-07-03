public class Main {
    public static void main(String[] args) {
        Customer client = new Customer("Brian Kato");

        SavingsAccount schoolSavings = new SavingsAccount("KLA-SAV-014", 800000, 3);
        CurrentAccount shopAccount = new CurrentAccount("KLA-CUR-022", 100000, 300000);

        client.addAccount(schoolSavings);
        client.addAccount(shopAccount);

        System.out.println("TESTING THE BANK CLASSES");
        System.out.println("Customer name: " + client.getName());

        schoolSavings.deposit(50000);
        System.out.println("Try to withdraw UGX 900000 from savings: " + schoolSavings.withdraw(900000));
        System.out.println(schoolSavings.generateStatement());

        schoolSavings.addInterest();
        System.out.println("After adding interest:");
        System.out.println(schoolSavings.generateStatement());

        System.out.println("Try to withdraw UGX 350000 from current: " + shopAccount.withdraw(350000));
        System.out.println(shopAccount.generateStatement());

        System.out.println("Customer total worth is UGX " + client.totalWorth());
    }
}
