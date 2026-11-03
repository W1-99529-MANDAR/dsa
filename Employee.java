
import java.util.Scanner;

class Employee {
    int empid;
    String name;

    Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }
}

class EmployeeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee emp[] = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Employee Name: ");
            String name = sc.next();

            emp[i] = new Employee(id, name);
        }

        System.out.println("\n1. Search by Employee ID");
        System.out.println("2. Search by Employee Name");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        boolean found = false;

        if (choice == 1) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if (emp[i].empid == id) {
                    System.out.println("Employee Found!");
                    System.out.println("ID: " + emp[i].empid);
                    System.out.println("Name: " + emp[i].name);
                    found = true;
                    break;
                }
            }
        } else if (choice == 2) {
            System.out.print("Enter Employee Name: ");
            String name = sc.next();

            for (int i = 0; i < n; i++) {
                if (emp[i].name.equalsIgnoreCase(name)) {
                    System.out.println("Employee Found!");
                    System.out.println("ID: " + emp[i].empid);
                    System.out.println("Name: " + emp[i].name);
                    found = true;
                    break;
                }
            }
        } else {
            System.out.println("Invalid choice");
            return;
        }

        if (!found) {
            System.out.println("Employee not found");
        }
    }
}
