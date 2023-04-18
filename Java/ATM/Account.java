package ATM;

public class Account {
    private double balance;
    
    public Account(){
        balance = 0;
    }
    
    public Account(double b){
        balance = b;
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    
    public void withdraw(double amount){
        balance -= amount;
    }
    
    public double getBalance(){
        return balance;
    }
}
