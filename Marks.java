
interface Exam {
    void getMarks(int m1, int m2);
}


class Student {
    int roll;
    String name;

    void getStudent(int r, String n) {
        roll = r;
        name = n;
    }

    void displayStudent() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
    }
}


class Result extends Student implements Exam {
    int mark1, mark2;

    public void getMarks(int m1, int m2) {
        mark1 = m1;
        mark2 = m2;
    }

    void displayResult() {
        int total = mark1 + mark2;
        System.out.println("Marks 1: " + mark1);
        System.out.println("Marks 2: " + mark2);
        System.out.println("Total: " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result();

        r.getStudent(1, "Amit");
        r.getMarks(80, 90);

        r.displayStudent();
        r.displayResult();
    }
}