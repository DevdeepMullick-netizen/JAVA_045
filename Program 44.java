class MotorVehicle {
    String name;
    int number;
    double price;

    MotorVehicle(String name, int number, double price) {
        this.name = name;
        this.number = number;
        this.price = price;
    }

    void display() {
        System.out.println(name + " " + number + " " + price);
    }
}

class Car extends MotorVehicle {
    double discountRate = 10;

    Car(String name, int number, double price) {
        super(name, number, price);
    }

    void discount() {
        double discount = price * discountRate / 100;
        System.out.println("Discount: " + discount);
    }

    void display() {
        super.display();
        System.out.println("Discount Rate: " + discountRate);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Car c = new Car("BMW", 101, 500000);
        c.display();
        c.discount();
    }
}