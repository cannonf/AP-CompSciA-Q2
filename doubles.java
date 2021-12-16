
/*
Name: Cannon Flinders        Program: Doubles
Description: This program makes random numbers, and keeps making random numbers until the numbers 
are the same
*/
import java.util.Random;

public class doubles {
    public static void main(String[] args) {

        Random rand = new Random(); // instance of random class
        Random randy = new Random(); // instance of random class
        int upperbound = 7;// upperbound is 1 higher then the value since it doesnt count this value
        int randomish = rand.nextInt(upperbound); // random value 1
        int randomishish = randy.nextInt(upperbound);// random value 2
        int roll = 1; // counts how many times its rolled
        int numOne = randomish;// random value stored 1
        int numTwo = randomishish; // random value stored 1
        System.out.println("Roll " + roll + "(" + numOne + "," + numTwo + ")");

        while (numOne != numTwo) // saying that while there are no doubles it will go, stops when doubles is
                                 // found
        {
            roll++;// brings roll up
            randomish = rand.nextInt(upperbound); // gives value 1 a random value
            randomishish = randy.nextInt(upperbound); // gives value 2 a random value
            numOne = randomish; // sets the random value
            numTwo = randomishish;// sets the random value 2
            System.out.println("Roll " + roll + "(" + numOne + "," + numTwo + ")"); // prints the roll
            if (numOne == numTwo) // telling it to print something if it gets doubles
                System.out.println("Yout got a doubles!! It only took " + roll + " tries");
        }

    }
}
