package muna;
 
import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    void read(Scanner sc) 
   {
        System.out.print("Enter Employee Number: ");
        eNo = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Employee Name: ");
        eName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        eSalary = sc.nextDouble();
    }

    void display()
    {
        System.out.println("Employee Number: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}

public class EmployeeSearch 
    {
    public static void main(String[] args) 
        {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();  
            System.out.println("\nEnter details of Employee " + (i + 1));
            emp[i].read(sc);
        }
        System.out.print("\nEnter Employee Number to search: ");
        int searchNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].eNo == searchNo) {
                System.out.println("\nEmployee Found:");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }

        sc.close();
    }
}