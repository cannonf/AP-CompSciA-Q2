
/*
 Name Cannon Flinders          Program: Checkerboard 
 Description: This is a program that prints a checkarboard using JPanels in a JFrame
*/
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;

public class checkboard2 {
    public static void main(String[] args) {
        // making the Frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);
        // This is how I want the grid to look, in a 4 rows and 4 collums
        frame.setLayout(new GridLayout(4, 4));

        // this makes every panel that is needed and sets them to a color
        // I couldnt find how to re use the same panel so I did this
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel redPanel2 = new JPanel();
        redPanel2.setBackground(Color.RED);

        JPanel redPanel3 = new JPanel();
        redPanel3.setBackground(Color.RED);

        JPanel redPanel4 = new JPanel();
        redPanel4.setBackground(Color.RED);

        JPanel bluePanel1 = new JPanel();
        bluePanel1.setBackground(Color.BLUE);

        JPanel bluePanel2 = new JPanel();
        bluePanel2.setBackground(Color.BLUE);

        JPanel bluePanel3 = new JPanel();
        bluePanel3.setBackground(Color.BLUE);

        JPanel bluePanel4 = new JPanel();
        bluePanel4.setBackground(Color.BLUE);

        JPanel greenPanel1 = new JPanel();
        greenPanel1.setBackground(Color.GREEN);

        JPanel greenPanel2 = new JPanel();
        greenPanel2.setBackground(Color.GREEN);

        JPanel greenPanel3 = new JPanel();
        greenPanel3.setBackground(Color.GREEN);

        JPanel greenPanel4 = new JPanel();
        greenPanel4.setBackground(Color.GREEN);

        JPanel orangePanel1 = new JPanel();
        orangePanel1.setBackground(Color.ORANGE);

        JPanel orangePanel2 = new JPanel();
        orangePanel2.setBackground(Color.ORANGE);

        JPanel orangePanel3 = new JPanel();
        orangePanel3.setBackground(Color.ORANGE);

        JPanel orangePanel4 = new JPanel();
        orangePanel4.setBackground(Color.ORANGE);

        // adding each panel to the frame
        frame.add(redPanel);
        frame.add(orangePanel1);
        frame.add(greenPanel1);
        frame.add(bluePanel1);

        frame.add(orangePanel2);
        frame.add(greenPanel2);
        frame.add(bluePanel2);
        frame.add(redPanel2);

        frame.add(greenPanel3);
        frame.add(bluePanel3);
        frame.add(redPanel3);
        frame.add(orangePanel3);

        frame.add(bluePanel4);
        frame.add(redPanel4);
        frame.add(orangePanel4);
        frame.add(greenPanel4);

        // turning it to visable
        frame.setVisible(true);

    }

}
