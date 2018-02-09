package Modul1;

public class Test_Account {
    public static void main(String[] args) {
        Account.setAnnualInterestRate(10);

        Account acc = new Account(0, 1000, "Danny boi");
        acc.withdraw(100, "Taxes");
        acc.deposit(250, "Sold stuff");
        acc.withdraw(500, "Bought PC");
        acc.deposit(225, "Bus tour");
        acc.withdraw(10.5, "Snacks");
        acc.deposit(1000, "Savings");

        String text = String.format("Name: %s \nAnnual interest rate: %s\nBalance: %s\n", acc.getName(), Account.getAnnualInterestRate(), acc.getBalance());
        text +=  "Date\t\t\t\t    Type\tAmount\t\tBalance\t\tDescription\n";
        for(Transaction t : acc.getTransactions())
        {
            text += t.toString() + "\n";
        }

        System.out.println(text);
    }
}
