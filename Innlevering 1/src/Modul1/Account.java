package Modul1;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Account {

    private int id;
    private double balance;
    private GregorianCalendar dateCreated;
    private static double annualInterestRate;

    private ArrayList<Transaction> transactions = new ArrayList<>();

    private String name;

    public Account(int id, double balance, String name)
    {
        this.id = id;
        this.balance = balance;
        this.name = name;

        dateCreated = new GregorianCalendar();
        dateCreated.set(GregorianCalendar.DATE, 2);

    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public Account() {
        this(0, 1000, "Random user");
    }

    public int getId () {
        return id;
    }

    public double getBalance () {
        return balance;
    }

    public GregorianCalendar getDate () {
        return dateCreated;
    }

    public static double getAnnualInterestRate () {
        return annualInterestRate;
    }

    public double getMonthlyInterest () {
        return balance * (annualInterestRate / 1200);
    }

    public static void setAnnualInterestRate (double interestRate) {
        annualInterestRate = interestRate;
    }

    public boolean withdraw (double amount, String description) {
        if(amount <= balance) {
            balance -= amount;

            transactions.add(new Transaction('W', amount, balance, description));

            return true;

        }

        return false;
    }

    public String getName (){
        return name;
    }

    public boolean deposit (double amount, String description) {
        if(amount > 0) {
            balance += amount;
            transactions.add(new Transaction('D', amount, balance, description));
            return true;
        }
        return false;

    }


}
