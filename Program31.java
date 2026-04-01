import java.util.Scanner;

class Point {
    int x, y;
}

class Circle {
    double radius;
    Point p;   // object of Point class

    void getData(Scanner sc) {
        p = new Point();   // create Point object

        System.out.print("Enter x coordinate: ");
        p.x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        p.y = sc.nextInt();

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }

    void display() {
        double area = 3.14 * radius * radius;

        System.out.println("\nCenter Point: (" + p.x + ", " + p.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
    }

}

public class Program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        c.getData(sc);
        c.display();
    }
}

