import java.util.*;

interface Department {
    void printDept();
}

// Hostel class
class Hostel {
    String hostelName, hostelLocation;
    int numberOfRooms;

    void getHostelData(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();
        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();
        System.out.print("Enter Number of Rooms: ");
        numberOfRooms = sc.nextInt();
        sc.nextLine();
    }

    void printHostelData() {
        System.out.println(hostelName + ", " + hostelLocation + ", Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName, regdNo, electiveSubject;
    double avgMarks;
    String deptName, deptHead;

    void getData(Scanner sc) {
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter Reg No: ");
        regdNo = sc.nextLine();
        System.out.print("Enter Subject: ");
        electiveSubject = sc.nextLine();
        System.out.print("Enter Avg Marks: ");
        avgMarks = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Dept Name: ");
        deptName = sc.nextLine();
        System.out.print("Enter Dept Head: ");
        deptHead = sc.nextLine();

        getHostelData(sc);
    }

    void printData() {
        System.out.println(studentName + " (" + regdNo + ")");
        System.out.println("Subject: " + electiveSubject + ", Marks: " + avgMarks);
        printDept();
        printHostelData();
    }

    public void printDept() {
        System.out.println("Dept: " + deptName + ", Head: " + deptHead);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        while (true) {
            System.out.println("\n1. Admit\n2. Migrate\n3. Display\n4. Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    s.getData(sc);
                    break;

                case 2:
                    System.out.print("Enter Reg No: ");
                    String r = sc.nextLine();
                    if (s.regdNo.equals(r)) {
                        System.out.println("Student Migrated");
                    } else {
                        System.out.println("Not Found");
                    }
                    break;

                case 3:
                    s.printData();
                    break;

                case 4:
                    return;
            }
        }
    }
}
