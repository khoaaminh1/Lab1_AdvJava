package lab1_Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 1. Add multiple students
        students.add(new Student("S01", "Alice", 8.5));
        students.add(new Student("S02", "Bob", 9.0));
        students.add(new Student("S03", "Charlie", 7.5));

        // 2. Display the list of all students
        System.out.println("=== All Students ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // 3. Search for a student by ID
        System.out.print("\nEnter ID to search: ");
        String searchId = scanner.nextLine();
        boolean found = false;
        for (Student s : students) {
            if (s.getId().equalsIgnoreCase(searchId)) {
                System.out.println("Found: " + s);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + searchId + " not found.");
        }

        // 4. Remove a student from the list
        System.out.print("\nEnter ID to remove: ");
        String removeId = scanner.nextLine();
        boolean removed = students.removeIf(s -> s.getId().equalsIgnoreCase(removeId));
        if (removed) {
            System.out.println("Removed student with ID " + removeId);
        } else {
            System.out.println("No student found with ID " + removeId);
        }

        // Display list after removal
        System.out.println("\n=== Students After Removal ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // 5. Sort the list by grade in descending order
        Collections.sort(students, Comparator.comparingDouble(Student::getGrade).reversed());

        System.out.println("\n=== Students Sorted by Grade (Descending) ===");
        for (Student s : students) {
            System.out.println(s);
        }

        scanner.close();
    }
}
