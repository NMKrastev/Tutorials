import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //JLabel - a GUI display area for a string of tex, an image, or both

        ImageIcon icon = new ImageIcon("icon.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        JLabel label = new JLabel(); //creates a label
        label.setText("Label text"); //set text of label
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER or RIGHT of icon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER or BOTTOM of icon
        label.setForeground(Color.red);
        label.setFont(new Font("MV Boli", Font.BOLD, 20)); //set font ot text
        label.setIconTextGap(10); //set gap to text to image
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon and text within label
        //label.setBounds(0,0,600, 600); //set x and y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
