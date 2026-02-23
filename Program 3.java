class Temperature {

    void convert() {
        double celsius = 25;   
        double fahrenheit;

        fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    public static void main(String[] args) {

        
        Temperature obj = new Temperature();

        
        obj.convert();
    }
}



