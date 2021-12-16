import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class StuffMost extends Canvas {
    public static void main(String[] args) {

        // JLabel = a GUI display area for a string of text, an image, or both

        // Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); // create a label

        label.setText("The most wasted of days is one without laughter."); // set text of label
        label.setForeground(new Color(0x99FF00));// color of label
        label.setFont(new Font("MV Boli", Font.PLAIN, 15)); // font and size
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        StuffMost drawing = new StuffMost();
        // label.setBounds(100, 100, 250, 250);
        // label.setIcon(image);
        /*
         * label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER,
         * RIGHT of imageicon
         * label.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER, BOTTOM of
         * imageicon
         * label.setForeground(new Color(0x00FF00)); // set font color of text
         * label.setFont(new Font("MV Boli", Font.PLAIN, 100)); // set font of text
         * label.setIconTextGap(-25); // set gap of text to image
         * label.setBackground(Color.black); // set background color
         * label.setOpaque(true); // display background color
         * // label.setBorder(border); //sets border of label (not image+text)
         * label.setVerticalAlignment(JLabel.CENTER); // set vertical position of
         * icon+text within label
         * label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of
         * icon+text within label
         * // label.setBounds(100, 100, 250, 250); //set x,y position within frame as
         * well
         * // as dimensions
         */

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.BLUE);
        // frame.setLayout(null);
        frame.pack();
        frame.setVisible(true);
        frame.add(label);

    }

    // public void mickey(Graphics g, Rectangle bb) {
    // boxOval(g, bb);

    // int hx = bb.width / 2;
    // int hy = bb.height / 2;
    // Rectangle half = new Rectangle(bb.x, bb.y, hx, hy);

    // half.translate(-hx / 2, -hy / 2);
    // boxOval(g, half);

    // half.translate(hx * 2, 0);
    // boxOval(g, half);
    // }
}
// public static void main(String[] args) {
// JFrame frame = new JFrame();
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// frame.setLayout(null);
// frame.setSize(500, 500);
// JLabel title = new JLabel();
// title.setText("bro, do you even code?");
// title.setHorizontalTextPosition(JLabel.CENTER);
// // frame.getContentPane().setBackground(Color.BLUE);

// // JPanel redPanel4 = new JPanel();
// // redPanel4.setBackground(Color.RED);
// // frame.add(redPanel4);
// frame.add(title);
// frame.setVisible(true);

// }
// }
