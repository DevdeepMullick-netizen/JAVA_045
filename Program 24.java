class Demo2 {

    
    Demo2() {
        System.out.println("No argument constructor");
    }

    
    Demo2(int x) {
        System.out.println("Value = " + x);
    }

    Demo2(int x, int y) {
        System.out.println("Sum = " + (x + y));
    }

    public static void main(String[] args) {
        Demo2 a = new Demo2();
        Demo2 b = new Demo2(10);
        Demo2 c = new Demo2(10, 20);
    }
}
