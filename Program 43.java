abstract class Accounts {
    double balance;
    int accNo;
    String name;

    Accounts(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    abstract void deposit(double amt);
    abstract void withdraw(double amt);

    void display() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rate = 5;

    SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        balance -= amt;
    }

    void calculateAmount() {
        balance += balance * rate / 100;
    }
}

public class Main2 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1, "Dev", 1000);

        s.deposit(500);
        s.withdraw(200);
        s.calculateAmount();
        s.display();
    }
}