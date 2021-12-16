
/*
Name: Cannon Flinders        Program: Grades but with methods
Description: This program asks the user to input mulitple grades and then also finds the min, max, and avg of them
*/
import java.util.Scanner;

public class gradesStatic {
    // universal varibles
    static int max;
    static int min;
    static int avg;
    static int total;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int gradey;
        System.out.println("Welcome to the grade calculator.");
        System.out.println("Please enter a numeric grade.  After the last student in the class, enter a grade of -1");
        gradey = reader.nextInt();
        // setting the values to the input
        max = gradey;
        min = gradey;
        avg = gradey;
        total++;
        while (gradey != -1) { // while loop until grade is -1
            makeGrades(gradey);// putting the grade into the method to give a letter grade then printing it
            System.out
                    .println("Please enter a numeric grade.  After the last student in the class, enter a grade of -1");
            gradey = reader.nextInt();
            if (gradey > max) {// setting the max
                max = gradey;
            }
            if (gradey < min && gradey != -1) {// setting the min
                min = gradey;
            }

            avg = avg + gradey;// adding them all up inside the average
            total++;
        }
        total--;// total is -- because when -1 is put in it adds 1 to total and it messes
                // everything up
        avg = avg / total;
        System.out.print("min: ");
        makeGrades2(min); // makeGrades2 is so it doesnt print "the grade is" like makeGrades does
        System.out.print("Max: ");
        makeGrades2(max);
        System.out.print("Average: ");
        makeGrades2(avg);

    }

    static void makeGrades(int grade) {
        String letter = "m";
        if (grade >= 96 && grade <= 100) {
            letter = "A+"; // setting letter as the grade so I could use it if needed
            System.out.println("Grade: " + letter);
        } else if (grade >= 92 && grade <= 95) {
            letter = "A";
            System.out.println("Grade: " + letter);
        } else if (grade == 91 || grade == 90) {
            letter = "A-";
            System.out.println("Grade: " + letter);
        } else if (grade >= 86 && grade <= 89) {
            letter = "B+";
            System.out.println("Grade: " + letter);
        } else if (grade >= 82 && grade <= 85) {
            letter = "B";
            System.out.println("Grade: " + letter);
        } else if (grade == 80 || grade == 81) {
            letter = "B-";
            System.out.println("Grade: " + letter);
        } else if (grade >= 76 && grade <= 79) {
            letter = "C+";
            System.out.println("Grade: " + letter);
        } else if (grade >= 72 && grade <= 75) {
            letter = "C";
            System.out.println("Grade: " + letter);
        } else if (grade == 70 || grade == 71) {
            letter = "C-";
            System.out.println("Grade: " + letter);
        } else if (grade >= 66 && grade <= 69) {
            letter = "D+";
            System.out.println("Grade: " + letter);
        } else if (grade >= 62 && grade <= 65) {
            letter = "D";
            System.out.println("Grade " + letter);
        } else if (grade == 60 || grade == 61) {
            letter = "D-";
            System.out.println("Grade " + letter);
        } else if (grade <= 59) {
            letter = "F";
            System.out.println("Grade " + letter);
        }
    }

    // the only difference is makeGrades2 doesnt have the "Grades " + letter
    // Could I of just changed my code to print it instead? Yes. Is it easier to
    // copy and paste a method and delete part? Yes.
    static void makeGrades2(int grade) {
        String letter = "m";
        if (grade >= 96 && grade <= 100) {
            letter = "A+"; // setting letter as the grade so I could use it if needed
            System.out.println(letter);
        } else if (grade >= 92 && grade <= 95) {
            letter = "A";
            System.out.println(letter);
        } else if (grade == 91 || grade == 90) {
            letter = "A-";
            System.out.println(letter);
        } else if (grade >= 86 && grade <= 89) {
            letter = "B+";
            System.out.println(letter);
        } else if (grade >= 82 && grade <= 85) {
            letter = "B";
            System.out.println(letter);
        } else if (grade == 80 || grade == 81) {
            letter = "B-";
            System.out.println(letter);
        } else if (grade >= 76 && grade <= 79) {
            letter = "C+";
            System.out.println(letter);
        } else if (grade >= 72 && grade <= 75) {
            letter = "C";
            System.out.println(letter);
        } else if (grade == 70 || grade == 71) {
            letter = "C-";
            System.out.println(letter);
        } else if (grade >= 66 && grade <= 69) {
            letter = "D+";
            System.out.println(letter);
        } else if (grade >= 62 && grade <= 65) {
            letter = "D";
            System.out.println(letter);
        } else if (grade == 60 || grade == 61) {
            letter = "D-";
            System.out.println(letter);
        } else if (grade <= 59) {
            letter = "F";
            System.out.println(letter);
        }
    }
}