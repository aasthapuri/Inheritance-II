package com.company;

public class BankAccount {
      private String name;
      private double Balance;

    public BankAccount(String name , Double bal) {
        super();
        name = name;
        Balance=Balance;
    }

    public BankAccount(String name) {
        super();
        name=name;
    }
    public BankAccount(String name, Double bal, double interest){
        super();

    }


    public static void main(String[] args) {
	// write your code here
        System.out.println("Banking Stuff");
    }
}
class SavingsAccount extends BankAccount{

    double interestRate;

    public SavingsAccount(String name) {
        this(name,0.0);
    }
    public SavingsAccount(String name, Double bal){
        super(name,bal,0.0);

    }


}
class RegisterAccount extends BankAccount{
    double amortization;

    public RegisterAccount(String name,Double bal, double interest) {
        super(name,bal,interest);

    }
}
