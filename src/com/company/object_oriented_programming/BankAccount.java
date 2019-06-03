package com.company.object_oriented_programming;


public class BankAccount {

    private String account;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount() {
//        special use of this keyword: https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
//        this("12345", 0.00, "Alex S", "hello@world.com", "333-555-6666");
        System.out.println("Empty constructor was called");
    }

    public BankAccount(String account, double balance, String name, String email, String phoneNumber) {
        System.out.println("Constructor with parameters was called");
        this.account = account;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

        // Alternative to above is saving values to fields
        // e.g. setAccount(account);
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this("99999", 300, name, email, phoneNumber);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double deposit){
        if( deposit > 0.00){
            double totalBalance =  this.getBalance() + deposit;
            this.setBalance(totalBalance);
        }else{
            System.out.println("Error, the amount you entered is invalid");
        }
    }

    public void withdrawal(double withdrawal){
        if( withdrawal > 0){
            double totalBalance =  this.getBalance() - withdrawal;
            this.setBalance(totalBalance);
        }else{
            System.out.println("Error, withdrawal amount was invalid");
        }
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
