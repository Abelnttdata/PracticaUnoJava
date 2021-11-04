package com.company;

public class Main {

    public static void main(String[] args) {

        //Cliente uno
        Account a = new Account();
        Customer c = new Customer("Abel ", "Martinez");
        c.setAccount(a);
        a.deposit(1500);
        a.withdraw(1200);
        System.out.println("Mi nombre es: "+ c.getFirstName() + c.getLastName());
        System.out.println("Y mi balance es: "+ c.getAccount().getBalance());

        //Cliente dos
        Account a2 = new Account();
        Customer c2 = new Customer("Cristopher ", "Gonzalez");
        c2.setAccount(a2);
        a2.deposit(1500);
        a2.withdraw(1700);
        System.out.println("Mi nombre es: "+ c2.getFirstName() + c2.getLastName());
        System.out.println("Y mi balance es: "+ c2.getAccount().getBalance());

    }
}
