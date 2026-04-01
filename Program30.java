import java.util.*;

class Tender {
    double cost;
    String company;
}

class Program30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender[] t = new Tender[5];

        
        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            System.out.print("Enter company name: ");
            t[i].company = sc.next();
            System.out.print("Enter cost: ");
            t[i].cost = sc.nextDouble();
        }
        sc.close();

        // Assume first is minimum
        double min = t[0].cost;
        String minCompany = t[0].company;

        // Find minimum
        for (int i = 1; i < 5; i++) {
            if (t[i].cost < min) {
                min = t[i].cost;
                minCompany = t[i].company;
            }
        }

        // Output
        System.out.println("\nCompany with minimum cost: " + minCompany);
    }
}