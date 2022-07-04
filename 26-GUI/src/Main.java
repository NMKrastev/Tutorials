import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        /*//JFrame - GUI window to add components to

        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("This is the title of the frame");
        //sets x-dimension , and y-dimension of the frame
        frame.setSize(600, 600);
        //exit out of the application - terminates the process
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //prevent frame from being resized
        frame.setResizable(false);
        //makes frame visible
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("Profile_Logo.jpg");
        //change the default icon
        frame.setIconImage(image.getImage());
        //change the background color
        //frame.getContentPane().setBackground(Color.red);
        //frame.getContentPane().setBackground(new Color(255, 0, 0));
        frame.getContentPane().setBackground(new Color(0xFF0000));*/

        MyFrame frame = new MyFrame();

    }
}
