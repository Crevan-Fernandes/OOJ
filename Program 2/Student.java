import java.util.*;
class Student {
    String usn;
    String name;
    int[] credits;
    int[] marks;
    
    Student(int numSubjects) {
        credits = new int[numSubjects];
        marks = new int[numSubjects];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students (minimum 2): ");
        int numStudents = sc.nextInt();
        while (numStudents < 2) {
            System.out.print("Please enter at least 2 students: ");
            numStudents = sc.nextInt();
        }

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        sc.nextLine(); // Consume newline

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            students[i] = new Student(numSubjects);

            System.out.print("Enter USN: ");
            students[i].usn = sc.nextLine();

            System.out.print("Enter Name: ");
            students[i].name = sc.nextLine();

            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter credits for subject " + (j + 1) + ": ");
                students[i].credits[j] = sc.nextInt();
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                students[i].marks[j] = sc.nextInt();
            }
            sc.nextLine(); // Consume newline after reading marks
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + " Details:");
            System.out.println("USN: " + students[i].usn);
            System.out.println("Name: " + students[i].name);
            
            for (int j = 0; j < numSubjects; j++) {
                System.out.println("Subject " + (j + 1) + " - Credits: " + students[i].credits[j] + ", Marks: " + students[i].marks[j]);
            }

            int totalCredits = 0;
            double totalPoints = 0.0;

            for (int j = 0; j < numSubjects; j++) {
                int mark = students[i].marks[j];
                int gradePoint;

                if (mark >= 90) gradePoint = 10;
                else if (mark >= 80) gradePoint = 9;
                else if (mark >= 70) gradePoint = 8;
                else if (mark >= 60) gradePoint = 7;
                else if (mark >= 50) gradePoint = 6;
                else if (mark >= 40) gradePoint = 5;
                else gradePoint = 0;

                totalPoints += gradePoint * students[i].credits[j];
                totalCredits += students[i].credits[j];
            }

            double sgpa = totalCredits == 0 ? 0.0 : totalPoints / totalCredits;
            System.out.printf("\nSGPA for student %d: %.2f\n", i + 1, sgpa);
        }
      System.out.println("Name:Crevan Neil Fernandes");
      System.out.println("USN:1BM23CS082");
    }
}
