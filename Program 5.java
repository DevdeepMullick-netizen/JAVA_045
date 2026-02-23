class OddEven {

    
    void check() {
        int number = 7;   

        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");
    }

    public static void main(String[] args) {

        
        OddEven obj = new OddEven();

        
        obj.check();
    }
}


    
