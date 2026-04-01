import java.util.Scanner;

public class Program33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String newStr = str.replace('d', 'f');

        System.out.println("New string: " + newStr);

        sc.close();
    }
}
