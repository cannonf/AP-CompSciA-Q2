
/*
 Name Cannon Flinders          Program: Conversion 2 
 Description: This is a program that gets the users input in inches in a JOptionPane then prints 
 the number given into centimeters also using JPtionPane
*/
import javax.swing.JOptionPane;

public class conversion2 {
    public static void main(String[] args) {

        // This prompts the user to give an input in inches
        String name = JOptionPane.showInputDialog("Inches: ");
        // This makes a double and turns the string value into a double
        double inches = Double.parseDouble(name);
        // turning the inches into centimeters
        double centi = inches * 2.54;
        // This then prints the centimeters
        JOptionPane.showMessageDialog(null, "Centimeters " + centi, "Converted",
                JOptionPane.WARNING_MESSAGE);
        // Warning message because I liked the way it looked, does not mean anythign

    }
}
