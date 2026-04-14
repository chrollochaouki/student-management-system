import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add student");
            System.out.println("2. List all students");
            System.out.println("3. Search student");
            System.out.println("4. Delete student");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Grade: ");
                    double grade = scanner.nextDouble();
                    scanner.nextLine();
                    manager.addStudent(new Student(name, age, grade));
                    System.out.println("Student added.");
                    break;
                case 2:
                    manager.listStudents();
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    Student found = manager.searchByName(searchName);
                    if (found != null) {
                        found.displayInfo();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine();
                    boolean deleted = manager.deleteByName(deleteName);
                    if (deleted) {
                        System.out.println("Student deleted.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}