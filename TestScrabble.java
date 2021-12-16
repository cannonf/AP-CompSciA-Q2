/*
Name: Cannon Flinders        Program: Testing Scrabble
Description: This program uses the file ScrabbleTile to give values and print those values from that program
*/
public class TestScrabble {
    public static void main(String[] args) {
        // setting the private varibles
        ScrabbleTile letter1 = new ScrabbleTile("J", 8);
        ScrabbleTile letter2 = new ScrabbleTile("A", 1);

        // printing the varibles
        System.out.println(letter1.printTile());
        System.out.println(letter2.printTile());

        // setting new values
        letter1.deposit(4);
        letter1.withdrawl("H");

        letter2.deposit(6);
        letter2.withdrawl("T");

        // telling the user that the varibles have changed
        System.out.println(letter1.printTile2());
        System.out.println(letter2.printTile2());

        // printing them again
        System.out.println(letter1.printTile());
        System.out.println(letter2.printTile());

    }

}
