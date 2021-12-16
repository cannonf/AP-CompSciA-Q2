
/*
Name: Cannon Flinders        Program: Odds or evens game
Description: This program plays the game Odds or Evens against the computer and keeps track of your wins and losses
*/
import java.util.Scanner;
import java.util.Random;

public class oddsEvens {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random(); // instance of random class
        int upperbound = 3;// upperbound is 1 higher then the value since it doesnt count this value
        int randomish = rand.nextInt(upperbound);
        // all the var's that are needed
        int wins = 0;
        int losses = 0;
        int sum = 0;
        int numPlay;
        int numComp;
        String answer;
        String yes = "Yes";// So I can use the .equals to compare strings
        // Giving the starting text
        System.out.println("Welcome to Odds and Evens.");
        System.out.println("The computer is the Odd player. You'll be Even.");
        System.out.println("You have " + wins + " wins & " + losses + " losses");
        // this part is outside the while loop so it can ask the player if it wants to
        // play again
        // if it was inside the while loop there would not be a condition
        System.out.println("Please select:  1 or 2");
        numPlay = reader.nextInt();// getting player response
        numComp = randomish;// computer response
        sum = numPlay + numComp;// adding them
        System.out.print("You choose " + numPlay + ". The computer choose " + numComp);
        System.out.println(" The sum is " + sum);
        // if statements to give a point to who won
        if (sum == 2 || sum == 4) {
            wins++;
            sum = 0;// re setting sum to 0 so they dont get added to the one before
        } else {
            losses++;
            sum = 0;
        }
        System.out.println("You have won " + wins + " times and lost " + losses + " times");
        System.out.println("Do you want to play again? Please type Yes or No");
        answer = reader.next();
        // making a loop for if the player chooses to play again
        while (answer.equals(yes)) // saying that while there are no doubles it will go, stops when doubles is
        {
            System.out.println("Please select:  1 or 2");
            numPlay = reader.nextInt();
            numComp = randomish;
            sum = numPlay + numComp;
            System.out.print("You choose " + numPlay + ". The computer choose " + numComp);
            System.out.println(" The sum is " + sum);
            if (sum == 2 || sum == 4) {
                wins++;
                sum = 0;
            } else {
                losses++;
                sum = 0;
            }
            System.out.println("You have won " + wins + " times and lost " + losses + " times.");
            System.out.println("Do you want to play again? Please type Yes or No");
            answer = reader.next();
            // getting the players answer at the end so it doesnt create an infite loop

        }
        // printing out the final messages
        System.out.println("Your final record is: " + wins + " wins and " + losses + " losses. Good job");
        System.out.println("Thanks for playing");

    }
}