package BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount u1 = new BankAccount(100,"Divyam");
        System.out.println("Owner: "+u1.getOwner()+", Balance: "+u1.getBalance());
        u1.deposit(250.99);
        System.out.println("After deposit: "+u1.getBalance());
        u1.withdraw(10.99);
        System.out.println("After withdrawl: "+u1.getBalance());
    }
}
