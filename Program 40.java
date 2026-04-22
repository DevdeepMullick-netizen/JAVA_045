interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String name, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    public void processSale(double amount) {
        System.out.println("Sale Done: " + amount);
    }

    public void generateInvoice(String name, double amount) {
        System.out.println("Invoice for " + name + ": " + amount);
    }

    void showSummary() {
        System.out.println("Work Completed Successfully");
    }

    public static void main(String[] args) {
        CommercialExecutive c = new CommercialExecutive();
        c.processSale(5000);
        c.generateInvoice("Client A", 5000);
        c.showSummary();
    }
}