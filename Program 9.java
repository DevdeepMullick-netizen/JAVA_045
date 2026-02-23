class LeapYear {
    int year = 2024;   

    void checkLeapYear() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }
    }

    public static void main(String args[]) {
        LeapYear obj = new LeapYear();  
        obj.checkLeapYear();            
    }

}

