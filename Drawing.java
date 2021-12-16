import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

public class Drawing extends Canvas {

    public void paint(Graphics g) {
        Font myFont = new Font("Courier New", 1, 17); // this sets the font and size
        g.setFont(myFont);// giving the font to the string
        g.drawString("Make each day your masterpiece", 100, 230);// the string, these are the center x,y
        setBackground(Color.BLUE); // background color
        g.fillRect(130, 30, 100, 80); // shape 1
        int xPoly[] = { 250, 250, 350, }; // these are the cords for the poly
        int yPoly[] = { 275, 350, 450, };
        g.fillPolygon(xPoly, yPoly, 3);// shape 2
        setForeground(Color.RED); // this sets the color of everything
        g.fillOval(130, 130, 50, 60); // shape 3

    }

    public static void main(String[] args) {
        Drawing m = new Drawing();
        JFrame f = new JFrame();
        f.add(m); // adds the drawing
        f.setSize(500, 500);
        // f.setLayout(null);
        f.setVisible(true);
    }

}