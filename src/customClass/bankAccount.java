package customClass;

public class bankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "bankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

         public void checkBalance() {
        System.out.println("your available balance is:" + balance);

    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.err.println("It can not be negative");
            return;
        }
        balance += amount;

    }
    public void withdraw(double amount){
        if (amount>balance){
            System.err.println("insufficient balance");
            return;
        }
        if (amount<=0){
            System.err.println("withdrawing amount can not be negative or zero");
            return;
        }
        balance-= amount;
    }
}
