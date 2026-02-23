class NumberCheck {
    int num;   

    NumberCheck(){
        num = -5;   
    }

    
    void checkNumber() {
        if (num > 0) {
            System.out.println(num + " is Positive.");
        } else if (num < 0) {
            System.out.println(num + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }

    public static void main(String[] args) {
        // Creating object
        NumberCheck obj = new NumberCheck();

        // Calling method using object
        obj.checkNumber();
    }
}

