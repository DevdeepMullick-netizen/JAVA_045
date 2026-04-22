abstract class AbstractProduct {
    int product_id;

    AbstractProduct(int id) {
        this.product_id = id;
    }

    abstract void display();
}

class Book extends AbstractProduct {
    Book(int id) { super(id); }

    void display() {
        System.out.println("Travel Guide Book ID: " + product_id);
    }
}

class CD extends AbstractProduct {
    CD(int id) { super(id); }

    void display() {
        System.out.println("CD ID: " + product_id);
    }
}

public class Main4 {
    public static void main(String[] args) {
        AbstractProduct p;

        p = new Book(1);
        p.display();

        p = new CD(2);
        p.display();
    }
}