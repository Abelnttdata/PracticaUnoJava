package com.company;

public class Account {
    private double Balance;

    public Account() {

    }

    public double getBalance() {
        return Balance;
    }

    public void deposit(double amt){
        Balance = Balance + amt;
    }

    public void withdraw(double amt){
        if((Balance - amt) <= 0){
            Balance = Balance;
        }else{
            Balance = Balance - amt;
        }
    }
}

