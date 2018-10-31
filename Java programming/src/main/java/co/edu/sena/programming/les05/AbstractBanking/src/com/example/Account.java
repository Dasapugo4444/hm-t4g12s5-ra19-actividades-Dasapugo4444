package co.edu.sena.programming.les05.AbstractBanking.src.com.example;

import java.util.Date;

public abstract class Account {

    protected double balance; //tipo de cuenta
    public double getBalance() {
        return balance;
    } //tipo de cuenta

    public Account(double balance){
        this.balance=balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }//tipo de cuenta

    @Override
    public String toString() {
        return getDescription() + ": current balance is " + balance;
    }//tipo de cuenta

    public abstract String getDescription();

    //relacionado con tiempo
    public abstract boolean withdraw(double amount);
}
