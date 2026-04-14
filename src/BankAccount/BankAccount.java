package BankAccount;

public class BankAccount {
    private double balance;
    private String ownerName;

    BankAccount(){}

    BankAccount(double balance, String ownerName){
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public void deposit(double amount){
        if(amount<1){
            System.out.println("Deposit amount should be greater then 0.");
        } else {
            balance+=amount;
        }
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        } else {
            balance-=amount;
        }
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public double getBalance(){
        return balance;
    }

    public String getOwner(){
        return ownerName;
    }
}
