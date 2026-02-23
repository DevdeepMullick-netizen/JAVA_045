class Divisible {
    int number = 25;   
    void check() {
        if (number % 5 == 0)
            System.out.println(number + " is divisible by 5.");
        else
            System.out.println(number + " is not divisible by 5.");
    }

    public static void main(String args[]) {
        Divisible obj = new Divisible();  
        obj.check();                      
    }
}

