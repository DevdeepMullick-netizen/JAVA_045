
interface Gross {
    double calculateGross();
}


class Employee {
    int empId;
    String name;

    void getEmployeeDetails(int id, String n) {
        empId = id;
        name = n;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
    }
}

class Salary extends Employee implements Gross {
    double basic, hra, da;

    void getSalaryDetails(double b, double h, double d) {
        basic = b;
        hra = h;
        da = d;
    }

    public double calculateGross() {
        return basic + hra + da;
    }

    void displaySalary() {
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGross());
    }
}


public class Main {
    public static void main(String[] args) {
        Salary s = new Salary();

        s.getEmployeeDetails(101, "Rahul");
        s.getSalaryDetails(20000, 5000, 3000);

        s.displayEmployee();
        s.displaySalary();
    }
}