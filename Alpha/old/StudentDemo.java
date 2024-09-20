import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private int marks;

    private static int studentCount = 0;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        studentCount++;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static int getStudentCount() {
        return studentCount;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[4];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.print("Marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine(); 

            students[i] = new Student(name, rollNumber, marks);
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.displayDetails();
        }

        System.out.println("Total number of students: " + Student.getStudentCount());
    }
}