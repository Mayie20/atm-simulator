/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mycha Shem Jimenea
 */
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 1000.0;
        boolean running = true;
        
        while(running){
            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");
            int choice = input.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Your balance: " + balance);
                    break;
                case 2:
                    System.out.println("Enter deposit amount: ");
                    double deposit = input.nextDouble();
                    if(deposit > 0){
                        balance += deposit;
                        System.out.println("Deposited " + deposit);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                    
                    case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = input.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrew " + withdraw);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        input.close();
            }
        }
