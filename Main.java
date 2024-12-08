// package JustGpa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade1 = 0.0;

        // Get the student's marks
        System.out.print("Enter the student's marks (0 to 100): ");
        int marks1 = sc.nextInt();

        // Check for valid marks input
        if (marks1 < 0 || marks1 > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
            System.exit(1);
        } else {
            // Calculate GPA
            if (marks1 >= 70 && marks1 <= 100) {
                grade1 = 5.0;
            } else if (marks1 >= 60 && marks1 <= 69) {
                grade1 = 4.0;
            } else if (marks1 >= 50 && marks1 <= 59) {
                grade1 = 3.0;
            } else if (marks1 >= 40 && marks1 <= 49) {
                grade1 = 2.0;
            } else {
                grade1 = 0.0;
            }

            // Display the grade
            System.out.println("The Grade  for marks " + marks1 + " is: " + grade1);
        }
        // BLOCK 2

        double grade2 = 0.0;

        // Get the student's marks
        System.out.print("Enter the student's marks (0 to 100): ");
        int marks2 = sc.nextInt();

        // Check for valid marks input
        if (marks2 < 0 || marks2 > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
            System.exit(1);
        } else {
            // Calculate GPA
            if (marks2 >= 70 && marks2 <= 100) {
                grade2 = 5.0;
            } else if (marks2 >= 60 && marks2 <= 69) {
                grade2 = 4.0;
            } else if (marks2 >= 50 && marks2 <= 59) {
                grade2 = 3.0;
            } else if (marks2 >= 40 && marks2 <= 49) {
                grade2 = 2.0;
            } else {
                grade2 = 0.0;
            }

            // Display the grade
            System.out.println("The Grade  for marks " + marks2 + " is: " + grade2);
        }

        // BLOCK 3

        double grade3 = 0.0;
        // Get the student's marks
        System.out.print("Enter the student's marks (0 to 100): ");
        int marks3 = sc.nextInt();

        // Check for valid marks input
        if (marks3 < 0 || marks3 > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
            System.exit(1);
        } else {
            // Calculate GPA
            if (marks3 >= 70 && marks3 <= 100) {
                grade3 = 5.0;
            } else if (marks3 >= 60 && marks3 <= 69) {
                grade3 = 4.0;
            } else if (marks3 >= 50 && marks3 <= 59) {
                grade3 = 3.0;
            } else if (marks3 >= 40 && marks3 <= 49) {
                grade3 = 2.0;
            } else {
                grade3 = 0.0;
            }

            // Display the grade
            System.out.println("The Grade  for marks " + marks3 + " is: " + grade3);
        }

        // BLOCK 4

        double grade4 = 0.0;

        // Get the student's marks
        System.out.print("Enter the student's marks (0 to 100): ");
        int marks4 = sc.nextInt();

        // Check for valid marks input
        if (marks4 < 0 || marks4 > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
            System.exit(1);
        } else {
            // Calculate GPA
            if (marks4 >= 70 && marks4 <= 100) {
                grade4 = 5.0;
            } else if (marks4 >= 60 && marks4 <= 69) {
                grade4 = 4.0;
            } else if (marks4 >= 50 && marks4 <= 59) {
                grade4 = 3.0;
            } else if (marks4 >= 40 && marks4 <= 49) {
                grade4 = 2.0;
            } else {
                grade4 = 0.0;
            }

            // Display the grade
            System.out.println("The Grade  for marks " + marks4 + " is: " + grade4);
        }

        // BLOCK 5
        double grade5 = 0.0;

        // Get the student's marks
        System.out.print("Enter the student's marks (0 to 100): ");
        int marks5 = sc.nextInt();

        // Check for valid marks input
        if (marks5 < 0 || marks5 > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
            System.exit(1);
        } else {
            // Calculate GPA
            if (marks5 >= 70 && marks5 <= 100) {
                grade5 = 5.0;
            } else if (marks5 >= 60 && marks5 <= 69) {
                grade5 = 4.0;
            } else if (marks5 >= 50 && marks5 <= 59) {
                grade5 = 3.0;
            } else if (marks5 >= 40 && marks5 <= 49) {
                grade5 = 2.0;
            } else {
                grade5 = 0.0;
            }

            // Display the grade
            System.out.println("The Grade  for marks " + marks5 + " is: " + grade5);
        }

        // BLOCK 6

        
        double grade6 = 0.0;

        // Get the student's marks
        System.out.print("Enter the student's marks (0 to 100): ");
        int marks6 = sc.nextInt();

        // Check for valid marks input
        if (marks6 < 0 || marks6 > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
            System.exit(1);
        } else {
            // Calculate GPA
            if (marks6 >= 70 && marks6 <= 100) {
                grade6 = 5.0;
            } else if (marks6 >= 60 && marks6 <= 69) {
                grade6 = 4.0;
            } else if (marks6 >= 50 && marks6 <= 59) {
                grade6 = 3.0;
            } else if (marks6 >= 40 && marks6 <= 49) {
                grade6 = 2.0;
            } else {
                grade6 = 0.0;
            }

            // Display the grade
            System.out.println("The Grade  for marks " + marks6 + " is: " + grade6);
        }
        sc.close();

        double gpa;

        gpa = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6) / 6.0;

        System.out.print("GPA for those marks=" + gpa);
    }
}