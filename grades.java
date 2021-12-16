
/*
Name: Cannon Flinders        Program: Grades
Description: This program take the number grade of the user and puts it into a letter grade
*/
import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // all the var I will use
        double grade;
        String letter = "m";

        // asking the questions and storing the results
        System.out.print("please enter your grade: ");
        grade = reader.nextDouble();

        // if statement to see which one the grade goes too
        // && is because it is inbetween 2 values so I only want it if its inside those
        // 2 values
        if (grade >= 96 && grade <= 100) {
            letter = "A+"; // setting letter as the grade so I could use it if needed
            // I realized the step of storing the grade as a string doesnt help but I kept
            // it in
            System.out.println("Grade: " + letter);
            System.out.println("Wow you got an A+!!! Thats awsome!! ");
        } else if (grade >= 92 && grade <= 95) {
            letter = "A";
            System.out.println("Grade: " + letter);
            System.out.println("An A! Thats a really good grade!! ");
        } else if (grade == 91 || grade == 90) {
            letter = "A-";
            System.out.println("Grade: " + letter);
            System.out.println("A- is such a good grade!! ");
        } else if (grade >= 86 && grade <= 89) {
            letter = "B+";
            System.out.println("Grade: " + letter);
            System.out.println("B+ is so close to an A but still awesome! ");
        } else if (grade >= 82 && grade <= 85) {
            letter = "B";
            System.out.println("Grade: " + letter);
            System.out.println("B is a great grade  ");
        } else if (grade == 80 || grade == 81) {
            letter = "B-";
            System.out.println("Grade: " + letter);
            System.out.println("So close to a C but its not so good work ");
        } else if (grade >= 76 && grade <= 79) {
            letter = "C+";
            System.out.println("Grade: " + letter);
            System.out.println("Thats still passing but may want to move it up a couple points ");
        } else if (grade >= 72 && grade <= 75) {
            letter = "C";
            System.out.println("Grade: " + letter);
            System.out.println("Almost to a B... You've got this ");
        } else if (grade == 70 || grade == 71) {
            letter = "C-";
            System.out.println("Grade: " + letter);
            System.out.println("Almost a D so may want to start trying ");
        } else if (grade >= 66 && grade <= 69) {
            letter = "D+";
            System.out.println("Grade: " + letter);
            System.out.println("Still passing I think but not good");
        } else if (grade >= 62 && grade <= 65) {
            letter = "D";
            System.out.println("Grade " + letter);
            System.out.println("I think this counts as passing but still bad ");
        } else if (grade == 60 || grade == 61) {
            letter = "D-";
            System.out.println("Grade " + letter);
            System.out.println("Borderline passing...");
        } else if (grade <= 59) {
            letter = "F";
            System.out.println("Grade " + letter);
            System.out.println("Not even close buddy, start trying ");
        }
    }
}
