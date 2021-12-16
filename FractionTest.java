//I worked on this by myself with a little help from my teacher

import java.io.PrintWriter;

class FractionTest {

    public static void main(String[] args) {
        // setting the varibles and making varibles
        PrintWriter stdout = new PrintWriter(System.out, true);
        Fraction first = new Fraction(1, 2);
        Fraction second = new Fraction(3, 2);
        // setting differnt varibles for each operation
        Fraction third;
        Fraction fourth;
        Fraction fifth;
        Fraction sixth;

        // setting the varible to do the action
        third = first.mult(second);
        stdout.print("The product is: ");
        third.printFrac(stdout);
        stdout.println();

        fourth = first.add(second);
        stdout.print("The sum is: ");
        fourth.printFrac(stdout);
        stdout.println();

        fifth = first.min(second);
        stdout.print("The difference is: ");
        fifth.printFrac(stdout);
        stdout.println();

        sixth = first.div(second);
        stdout.print("The quotient is: ");
        sixth.printFrac(stdout);
        stdout.println();
    }
}