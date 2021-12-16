import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Graphics;

public class backgroundThing extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.pink);
        JLabel label1 = new JLabel("Test");
        frame.add(label1);

    }

}
