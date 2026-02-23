class ReverseNumber {
    int number = 12345;   

    void reverse() {
        int n = number;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;   
            rev = rev * 10 + digit;
            n = n / 10;           
        }

        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + rev);
    }

    public static void main(String args[]) {
        ReverseNumber obj = new ReverseNumber();  
        obj.reverse();                            
    }
}

