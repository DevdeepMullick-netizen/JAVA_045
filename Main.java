interface bank{
    double getIntRate();
    String BankName();
}
class Customer{
    String name;
    String customerID;
    Customer(String name, String customerID){
        this.name = name;
        this.customerID = customerID;
    }
    void displayCustInfo(){
        System.out.println("Customer: " + name + "(ID:" + customerID + ")");
    }
}
class Account extends Customer implements Bank{
    String accountNumber;
    double balance;
    String bankName;
    double intRate;
    Account(String name, String customerID, String accountNumber, double balance, String bankName, double intRate){
        super(name, customerID);
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankName = bankName;
        this.intRate = intRate;
    }
    @Override
    public double getIntRate(){
        return intRate;
    }
    @Override
    public String BankName(){
        return bankName;
    }
    void displayAccountInfo(){
        displayCustInfo();
        System.out.println("Bank: " + BankName());
        System.out.println("Account Number " + accountNumber);
        System.out.println("Balance " + balance);
        System.out.println("Interest rate " + getIntRate());
    }
}
public class Main{
    public static void main(String[] args){
        Account acc = new Account("Virat Kohli","C123","AC001", 5000.0, "SBI", 4.5);
        acc.displayAccountInfo();
    }
}