
package bankapplication;
import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Welcome to ________ Bank");
       System.out.println("Enter your name and customer ID: ");
       String name = sc.nextLine();
       String customerID = sc.nextLine();
       BankAccount obj1 = new BankAccount(name, customerID);
       obj1.menu();
       
    }
    
}
class BankAccount{
    double bal;
    double prevTrans;
    String customerName;
    String customerID;
    
    BankAccount(String customerName, String customerID){
        this.customerName = customerName;
        this.customerID = customerID;
    }
    
    void deposit(double amount){
        if(amount!=0){
            bal+=amount;
            amount = prevTrans;
        }
    }
    
    void withdraw(double amt){
        if(amt != 0){
            bal-=amt;
            prevTrans=-amt;
        }
        else if(bal<amt){
            System.out.println("Bank balance inssufecient");
        }
    }
    
    void getPreviousTrans(){
        if(prevTrans>0){
            System.out.println("Deposited: " + prevTrans);
        }
        else if(prevTrans<0){
            System.out.println("Withdrawn: " + Math.abs(prevTrans));
        }
        else{
            System.out.println("No transaction occured");
        }
    }
    
    void menu(){
        char option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID: " + customerID);
        System.out.println("\n");
        System.out.println("a) Check balance");
        System.out.println("b) Deposit amount");
        System.out.println("c) Withdraw amount");
        System.out.println("d) View previous transaction");
        System.out.println("e) Exit");
        
        do{
            System.out.println("**********************");
            System.out.println("Choose an option");
            option = sc.next().charAt(0);
            System.out.println("\n");
            
            switch(option){
                case 'a':
                    System.out.println("......................");
                    System.out.println("Balance: " + bal);
                    System.out.println("......................");
                    System.out.println("\n");
                    
                case 'b':
                    System.out.println("......................");
                    System.out.println("Enter amount to deposit:");
                    System.out.println("......................");
                    double amt = sc.nextDouble();
                    deposit(amt);
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("......................");
                    System.out.println("Enter withdrawal amount: ");
                    System.out.println("......................");
                    double amtW = sc.nextDouble();
                    withdraw(amtW);
                    System.out.println("\n");
                    break;
                case 'd':
                    System.out.println("......................");
                    System.out.println("Previous Transaction: ");
                    getPreviousTrans();
                    System.out.println("......................");
                    System.out.println("\n");
                    break;
                case 'e':
                    System.out.println("......................");
                    break;
                default:
                    System.out.append("Choose a valid option to proceed");
                    break;
            }
        }
        while(option != 'e');
        
        System.out.println("Thank you for using our banking system");
    }
}