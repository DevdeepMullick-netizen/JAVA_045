class BankAccount {
    String accNo;
    double balance;

    BankAccount(String a, double b) {
        accNo = a;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void display() {
        System.out.println(accNo + " " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double rate;

    SavingsAccount(String a, double b, double r) {
        super(a, b);
        rate = r;
    }

    void addInterest() {
        balance += balance * rate / 100;
    }
}

class FixedDepositAccount extends SavingsAccount {
    int period;

    FixedDepositAccount(String a, double b, double r, int p) {
        super(a, b, r);
        period = p;
    }

    void maturity() {
        double m = balance + (balance * rate * period / 100);
        System.out.println("Maturity = " + m);
    }
}

class Main {
    public static void main(String[] args) {
        FixedDepositAccount f = new FixedDepositAccount("101", 10000, 5, 12);

        f.deposit(2000);
        f.addInterest();
        f.display();
        f.maturity();
    }
}