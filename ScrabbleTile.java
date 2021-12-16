/*
Name: Cannon Flinders        Program: Scrabble Tile
Description: This program uses constructors, instance varibles, Accessors and mutator methods to
print a scrabble tile with a value
*/
public class ScrabbleTile {
    // Instance variables
    // A tile should have a value and a letter
    // Should be private
    private int val;
    private String let;

    // Default constructor method
    public ScrabbleTile() {
        // initiation of variables
        val = 0;
        let = "";

    }

    // constructor that takes 2 parameters for letter and value
    public ScrabbleTile(String chars, double point) {
        // initiation of variables
        let = chars;
        val += point;

    }

    // Accessors
    // get the letter of the tile
    public String getLetter() {
        return let;
    }

    // get the gets the value
    public double getScore() {
        return val;
    }

    // Mutators
    // method to change the value of tile
    // named deposit because it deposits the new value
    public void deposit(int point) {
        val = point;
    }

    // method to change the letter of the tile
    // named withdrawl because it withdrawls the letter and replaces it
    public void withdrawl(String chars) {
        let = chars;
    }

    // prints the values
    public String printTile() {
        return ("letter: " + let + "\nValue: " + val);
    }

    // letting the user know that the values have changed
    public String printTile2() {
        return ("The New Letter Is: " + let + "\nThe New Value Is: " + val);
    }

}