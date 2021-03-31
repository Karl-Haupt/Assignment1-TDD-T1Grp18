/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.tdd.assignment1;

import java.util.Scanner;

/**
 *
 * @author Karl H - (220236585)
 */

public class BankAccount {
  private int balance;
  private int previousTransaction;
  private final String customerName;
  private final String customerID;
  
  BankAccount(String customerName, String customerID) {
      this.customerName = customerName;
      this.customerID =  customerID;
  }
  
  public void setBalance(int balance) {
      this.balance = balance;
  }
  
  public int getBalance() {
      return this.balance;
  }
  
  public void deposit(int amount) {
      if(amount != 0) {
      balance = balance + amount;
      previousTransaction = amount;
        }
  }
    
 public int withdraw(int amount) {
     if(amount != 0) {
     balance = balance - amount;
     previousTransaction = amount;
     }
     return amount;
 } 

    public void getPreviousTransaction() {
        if(previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        }
        else if(previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }
        else {
            System.out.println("Error: No Transaction Occured");
        }
    }
    
    public int getTotal() {
        return balance;
    }
    
   public void showMenu() {
       
       char option;
       Scanner scanner =new Scanner(System.in);
       System.out.println("Welcome to Triple K Bank: Mr" + customerName);
       System.out.println("Your ID number is:" + customerID);
       System.out.println("\n");
       System.out.println("1. Check balance");
       System.out.println("2. Deposit");
       System.out.println("3. Withdraw");
       System.out.println("4. Previous Transaction");
       System.out.println("5. Exit");
       
       
       
       
       do {
            System.out.println("************************************************");
            System.out.println("Enter in the options number you want to do");
            System.out.println("************************************************");
            option = scanner.next().charAt(0);
            System.out.println("\n");
            
           switch(option) {
               case '1':
                   System.out.println("Balance: " + balance);
                   break;
               case '2':
                   System.out.println("Enter the amount you want to deposit: ");
                   
                   int amount = scanner.nextInt();
                   deposit(amount);
                   System.out.println("\n");
                   break;
               case '3':
                   System.out.println("Enter the amount you want to withdraw");
                     int amount1 = scanner.nextInt();
                   withdraw(amount1);
                   System.out.println("\n");
                    break;
               case '4':
                   getPreviousTransaction();
                   System.out.println("\n");
                   break;
                   
               default:
                   System.out.println("Invalid number option... Please try again");
                   break;
           }
        } while(option != 'E' || option != 'e'); {
            System.out.println("Thank You for using Triple K");
                   
        }        
          }
}