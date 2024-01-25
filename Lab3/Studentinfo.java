import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    double cgpa;


    public Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class Studentinfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Enter Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter CGPA: ");
            double cgpa = scanner.nextDouble();

            students[i] = new Student(rollNo, name, cgpa);
        }

     
        System.out.println("\nDetails of all students:");
        for (Student student : students) {
            System.out.println("Roll No: " + student.rollNo + ", Name: " + student.name + ", CGPA: " + student.cgpa);
        }

        double lowestCGPA = students[0].cgpa;
        String lowestCGPAStudentName = students[0].name;

        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowestCGPA) {
                lowestCGPA = students[i].cgpa;
                lowestCGPAStudentName = students[i].name;
            }
        }

        System.out.println("\nStudent with the lowest CGPA: " + lowestCGPAStudentName);
    }
}
