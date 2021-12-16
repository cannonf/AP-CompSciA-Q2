import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class checkBoard {
    public static void main(String[] args) {
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 100, 100);

        JPanel redPanel2 = new JPanel();
        redPanel2.setBackground(Color.RED);
        redPanel2.setBounds(100, 100, 100, 100);

        JPanel redPanel3 = new JPanel();
        redPanel3.setBackground(Color.RED);
        redPanel3.setBounds(200, 200, 100, 100);

        JPanel redPanel4 = new JPanel();
        redPanel4.setBackground(Color.RED);
        redPanel4.setBounds(300, 300, 100, 100);

        JPanel bluePanel1 = new JPanel();
        bluePanel1.setBackground(Color.BLUE);
        bluePanel1.setBounds(100, 0, 100, 100);

        JPanel bluePanel2 = new JPanel();
        bluePanel2.setBackground(Color.BLUE);
        bluePanel2.setBounds(200, 100, 100, 100);

        JPanel bluePanel3 = new JPanel();
        bluePanel3.setBackground(Color.BLUE);
        bluePanel3.setBounds(300, 200, 100, 100);

        JPanel bluePanel4 = new JPanel();
        bluePanel4.setBackground(Color.BLUE);
        bluePanel4.setBounds(000, 300, 100, 100);

        JPanel greenPanel1 = new JPanel();
        greenPanel1.setBackground(Color.GREEN);
        greenPanel1.setBounds(200, 000, 100, 100);

        JPanel greenPanel2 = new JPanel();
        greenPanel2.setBackground(Color.GREEN);
        greenPanel2.setBounds(300, 100, 100, 100);

        JPanel greenPanel3 = new JPanel();
        greenPanel3.setBackground(Color.GREEN);
        greenPanel3.setBounds(000, 200, 100, 100);

        JPanel greenPanel4 = new JPanel();
        greenPanel4.setBackground(Color.GREEN);
        greenPanel4.setBounds(100, 300, 100, 100);

        JPanel orangePanel1 = new JPanel();
        orangePanel1.setBackground(Color.ORANGE);
        orangePanel1.setBounds(300, 000, 100, 100);

        JPanel orangePanel2 = new JPanel();
        orangePanel2.setBackground(Color.ORANGE);
        orangePanel2.setBounds(000, 100, 100, 100);

        JPanel orangePanel3 = new JPanel();
        orangePanel3.setBackground(Color.ORANGE);
        orangePanel3.setBounds(100, 200, 100, 100);

        JPanel orangePanel4 = new JPanel();
        orangePanel4.setBackground(Color.ORANGE);
        orangePanel4.setBounds(200, 300, 100, 100);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(410, 430);
        frame.setVisible(true);

        frame.add(redPanel);
        frame.add(redPanel2);
        frame.add(redPanel3);
        frame.add(redPanel4);

        frame.add(bluePanel1);
        frame.add(bluePanel2);
        frame.add(bluePanel3);
        frame.add(bluePanel4);

        frame.add(greenPanel1);
        frame.add(greenPanel2);
        frame.add(greenPanel3);
        frame.add(greenPanel4);

        frame.add(orangePanel1);
        frame.add(orangePanel2);
        frame.add(orangePanel3);
        frame.add(orangePanel4);

    }

}
