class OverloadDemo {

    void add(int a, int b) {
        System.out.println("Sum of two numbers = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three numbers = " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Sum of two decimal numbers = " + (a + b));
    }

    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();

        obj.add(5, 10);
        obj.add(5, 10, 15);
        obj.add(5.5, 2.5);
    }
}