package com.oops_concept;


class BankAccount {

 private String accountNumber;
 private String accountHolder;
 private double balance;

 
 public BankAccount(String accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }


 public String getAccountNumber() {
     return accountNumber;
 }

 public String getAccountHolder() {
     return accountHolder;
 }

 public double getBalance() {
     return balance;
 }

 // Deposit Method
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 // Withdraw Method
 public void withdraw(double amount) {
     if (amount > 0 && balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient funds or invalid amount.");
     }
 }

 // Check Balance
 public void checkBalance() {
     System.out.println("Current Balance: " + balance);
 }




 public static void main(String[] args) {
     // Create an account object
     BankAccount account = new BankAccount("12345", "Vaishnavi", 5000);

     // Test functionality
     account.checkBalance();
     account.deposit(1500);
     account.withdraw(2000);
     account.checkBalance();
 
}
}