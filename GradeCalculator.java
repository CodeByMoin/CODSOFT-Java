// Task - 2

/*
Input: Take marks obtained (out of 100) in each subject.

Calculate Total Marks: Sum up the marks obtained in all subjects.

Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.

Grade Calculation: Assign grades based on the average percentage achieved.

Display Results: Show the total marks, average percentage, and the corresponding grade to the user
*/

import java.util.Scanner;

public class GradeCalculator {

    
    private static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        if (numSubjects <= 0) {
            System.out.println("Number of subjects must be greater than zero.");
            sc.close();
            return;
        }
    
        int totalMarks = 0;
            
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks entered");
                i--;
                continue;
            }

            totalMarks += marks;
        }

            
        double averagePercentage = (double) totalMarks / numSubjects;
            
        String grade = calculateGrade(averagePercentage);

            
        System.out.println("\nTotal Marks: " + totalMarks + " out of " + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%%n", averagePercentage);
        System.out.println("Grade: " + grade);
        
        sc.close(); 
    }
}