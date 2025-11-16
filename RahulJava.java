import java.util.*;

abstract class BankAccount{
    double balance;
    BankAccount(double balance){
        this.balance = balance;
    }
    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount{
    SavingsAccount(double balance){
        super(balance);
    }
    double calculateInterest(){
        return balance * 0.04;
    }
}

class CurrentAccount extends BankAccount{
    CurrentAccount(double balance){
        super(balance);
    }
    double calculateInterest(){
        return balance * 0.02;
    }
}

class FixedDeposit extends BankAccount{
    FixedDeposit(double balance){
        super(balance);
    }
    double calculateInterest(){
        return balance * 0.06;
    }
}

public class RahulJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accountType = sc.nextInt();
        double balance = sc.nextDouble();
        BankAccount account;
        switch(accountType){
            case 1:
                account = new SavingsAccount(balance);
                break;
            case 2:
                account = new CurrentAccount(balance);
                break;
            case 3:
                account = new FixedDeposit(balance);
                break;
            default:
                System.out.println("Invalid account type.");
                return;
        }
        double interest = account.calculateInterest();
        System.out.printf("%.2f\n", interest);
    }
}