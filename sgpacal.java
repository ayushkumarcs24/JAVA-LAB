import java.util.Scanner;

class Student {
    String usn;
    String name;
    int[] credits;
    int[] marks;

    // Method to read student details
    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        credits = new int[n];
        marks = new int[n];

        System.out.println("\nEnter credits and marks for each subject:");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + " credits: ");
            credits[i] = sc.nextInt();

            System.out.print("Subject " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();
        }
    }

    // Method to calculate SGPA
    double calculateSGPA() {
        int totalCredits = 0;
        int totalPoints = 0;

        for (int i = 0; i < credits.length; i++) {
            int gradePoint = getGradePoint(marks[i]);
            totalPoints += gradePoint * credits[i];
            totalCredits += credits[i];
        }

        return (double) totalPoints / totalCredits;
    }

    // Helper method to convert marks to grade points
    int getGradePoint(int marks) {
        if (marks >= 90) return 10;
        else if (marks >= 80) return 9;
        else if (marks >= 70) return 8;
        else if (marks >= 60) return 7;
        else if (marks >= 50) return 6;
        else if (marks >= 45) return 5;
        else if (marks >= 40) return 4;
        else return 0;
    }

    // Method to display details
    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("USN  : " + usn);
        System.out.println("Name : " + name);

        System.out.println("\nSubject-wise Credits and Marks:");
        for (int i = 0; i < credits.length; i++) {
            System.out.println("Subject " + (i + 1) + " - Credits: " + credits[i] + ", Marks: " + marks[i]);
        }

        System.out.printf("\nSGPA: %.2f\n", calculateSGPA());
    }
}

public class sgpacal {
    public static void main(String[] args) {
        Student s = new Student();
        s.accept();
        s.display();
    }
}
