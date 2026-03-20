import java.util.Scanner;

class Commission {
    double sales;
    Commission(double sales) {
        this.sales = sales;
    }

    double commission() {
        if (sales <= 100) return 0;
        else if (sales <= 1000) return sales * 0.10;
        else if (sales <= 10000) return sales * 0.15;
        else return sales * 0.20;
    }

    
}
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales: ");
        double sales = sc.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission c = new Commission(sales);
            double result = c.commission();
            System.out.println("Commission = " + result);
        }

        sc.close();
    }
}