class Area {

    
    void area(double r) {
        double result = 3.14 * r * r;
        System.out.println("Area of Circle = " + result);
    }


    void area(double l, double b) {
        double result = l * b;
        System.out.println("Area of Rectangle = " + result);
    }

    
    void area(int side) {
        int result = side * side;
        System.out.println("Area of Square = " + result);
    }

    public static void main(String[] args) {
        Area obj = new Area();

        obj.area(5);       
        obj.area(4.5);      
        obj.area(4, 6);    
    }
}