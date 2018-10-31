package co.edu.sena.programming.les05.AbstractBanking.src.com.example;

import java.util.Date;

public class TimeDepositAccount extends Account{
    

    private final Date maturityDate; //relacioanda con tiempo
    
    public TimeDepositAccount(double balance, Date maturityDate) {
        super(balance);
        this.maturityDate = maturityDate;
    }

    @Override
    //relacionado con tiempo
    public boolean withdraw(double amount) {
        Date today = new Date();
        if(today.after(maturityDate)) {
            if(amount <= balance) {
                balance -= amount;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "Time Deposit Account " + maturityDate;
    } //relacionado con tiempo
    
}