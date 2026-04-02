class BankAccount {

    private double balance;

    public void setBalance(double balance) { // setter
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Input not valid");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount debited:" + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Credited:" + amount);
        } else {
            System.out.println("Entered invalid amount");
        }
    }

    public double getBalance() { // getter
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(1000);
        b.withdraw(100);
        b.deposit(1000);
        System.out.println(b.getBalance());
    }
}