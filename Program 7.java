class Maximum {
    int a = 25;   
    int b = 40;
    int c = 32;

    void findMaximum() {
        int max;

        if (a > b && a > c) {
            max = a;
        }
        else if (b > c) {
            max = b;
        }
        else {
            max = c;
        }

        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
        System.out.println("Third Number: " + c);
        System.out.println("Maximum Number is: " + max);
    }

    public static void main(String[] args) {
        Maximum obj = new Maximum();

        obj.findMaximum();
    }
}

