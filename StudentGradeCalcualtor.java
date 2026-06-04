import java.util.*;

public class StudentGradeCalcualtor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("    STUDENT GRADE CALCULATOR");
        System.out.println("-----------------------------------");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int Subjects = Integer.parseInt(sc.nextLine());

        String[] Subjname = new String[Subjects];
        int[] marks = new int[Subjects];

        for (int i = 0; i < Subjects; i++) {
            System.out.print("Enter name of Subject" + (i + 1) + ": ");
            Subjname[i] = sc.nextLine();

            
            while (true) {
                System.out.print("Enter marks of Subject" + (i + 1) + ": ");
                int mark = Integer.parseInt(sc.nextLine());

                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    break;
                } else {
                    System.out.println("Invalid! Marks must be between 0 and 100. Try again.");
                }
            }
        }

        int Totalmarks = 0;
        for (int i = 0; i < Subjects; i++) {
            Totalmarks = Totalmarks + marks[i];
        }

        int highest = marks[0];
        int lowest = marks[0];
        String highSubj = Subjname[0];
        String lowSubj = Subjname[0];

        for (int i = 1; i < Subjects; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
                highSubj = Subjname[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
                lowSubj = Subjname[i];
            }
        }

        double AvgPerc = (double) Totalmarks / Subjects;

        String grade;
        String remarks;

        if (AvgPerc >= 90) {
            grade = "A+";
            remarks = "Outstanding";
        } else if (AvgPerc >= 80) {
            grade = "A";
            remarks = "Excellent";
        } else if (AvgPerc >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (AvgPerc >= 60) {
            grade = "C";
            remarks = "Average";
        } else if (AvgPerc >= 50) {
            grade = "D";
            remarks = "Below Average";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        
        String status = (AvgPerc >= 50) ? "PASS ✓" : "FAIL ✗";

        System.out.println("\n-----------------------------------------");
        System.out.println("         GRADE REPORT CARD");
        System.out.println("-----------------------------------------");
        System.out.printf("Student Name  : %s%n", name);
        
        System.out.printf("Total Subjects: %d%n", Subjects);
        System.out.println("----------------------------------------");
        System.out.printf("%-20s %s%n", "Subject", "Marks");
        System.out.println("----------------------------------------");

        for (int i = 0; i < Subjects; i++) {
            String subStatus = (marks[i] >= 50) ? "Pass" : "FAIL ✗";
            System.out.printf("%-20s %d / 100  [%s]%n", Subjname[i], marks[i], subStatus);
        }

        System.out.println("----------------------------------------");
        System.out.printf("Best Subject  : %s (%d)%n", highSubj, highest);
        System.out.printf("Weak Subject  : %s (%d)%n", lowSubj, lowest);
        System.out.println("----------------------------------------");
        System.out.printf("Total Marks   : %d / %d%n", Totalmarks, Subjects * 100);
        System.out.printf("AvgPerc       : %.2f%%%n", AvgPerc);
        System.out.printf("Grade         : %s%n", grade);
        System.out.printf("Remarks       : %s%n", remarks);
        System.out.printf("Status        : %s%n", status);
        System.out.println("-----------------------------------------");

        sc.close();
    }
}