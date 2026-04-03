package muna;
import java.util.Scanner;

// Student class
class Student {
    int rollNo;
    int marks;

    void getStudent(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter Academic Marks: ");
        marks = sc.nextInt();
    }
}

// Sports interface
interface Sports {
    // int sportsScore = 0; ← Removed: unused public static final constant
    void getSports(Scanner sc);
}

// Result class extending Student and implementing Sports
class Result extends Student implements Sports {
    int score;

    // Implementing interface method (must be public) ✅
    public void getSports(Scanner sc) {
        System.out.print("Enter Sports Score: ");
        score = sc.nextInt();
    }

    void display() {
        System.out.println("\n--- Result ---");
        System.out.println("Roll Number     : " + rollNo);
        System.out.println("Academic Marks  : " + marks);
        System.out.println("Sports Score    : " + score);
        System.out.println("Total Score     : " + (marks + score));
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();
        r.getStudent(sc);
        r.getSports(sc);
        r.display();

        sc.close();
    }
}