import java.util.Scanner;

class Item {
    int code;
    double price;
}

public class Program29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[5];
        double total = 0;

        // Input
        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            System.out.print("Enter code: ");
            items[i].code = sc.nextInt();
            System.out.print("Enter price: ");
            items[i].price = sc.nextDouble();
        }

        // Output
        System.out.println("\nCode\tPrice");
        for (int i = 0; i < 5; i++) {
            System.out.println(items[i].code + "\t" + items[i].price);
            total += items[i].price;
        }

        System.out.println("\nTotal Price = " + total);
    }
}