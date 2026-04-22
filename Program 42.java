import java.util.Scanner;

abstract class ThreeDObject {
    abstract double volume();
    abstract double surfaceArea();
}

// Box
class Box extends ThreeDObject {
    double l, w, h;

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    double volume() {
        return l * w * h;
    }

    double surfaceArea() {
        return 2 * (l*w + w*h + h*l);
    }
}

// Cube
class Cube extends ThreeDObject {
    double a;

    Cube(double a) {
        this.a = a;
    }

    double volume() {
        return a * a * a;
    }

    double surfaceArea() {
        return 6 * a * a;
    }
}

// Cylinder
class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double volume() {
        return Math.PI * r * r * h;
    }

    double surfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }
}

// Cone
class Cone extends ThreeDObject {
    double r, h;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double volume() {
        return (Math.PI * r * r * h) / 3;
    }

    double surfaceArea() {
        double l = Math.sqrt(r*r + h*h);
        return Math.PI * r * (r + l);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreeDObject obj;

        // Box
        System.out.print("Enter l w h for Box: ");
        obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Volume: " + obj.volume());
        System.out.println("Surface Area: " + obj.surfaceArea());

        // Cube
        System.out.print("\nEnter side for Cube: ");
        obj = new Cube(sc.nextDouble());
        System.out.println("Volume: " + obj.volume());
        System.out.println("Surface Area: " + obj.surfaceArea());

        // Cylinder
        System.out.print("\nEnter r h for Cylinder: ");
        obj = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println("Volume: " + obj.volume());
        System.out.println("Surface Area: " + obj.surfaceArea());

        // Cone
        System.out.print("\nEnter r h for Cone: ");
        obj = new Cone(sc.nextDouble(), sc.nextDouble());
        System.out.println("Volume: " + obj.volume());
        System.out.println("Surface Area: " + obj.surfaceArea());

        sc.close();
    }
}
