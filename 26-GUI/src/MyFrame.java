import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {

        this.setTitle("This is the title of the frame");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("Profile_Logo.jpg");

        this.setIconImage(image.getImage());
        //this.getContentPane().setBackground(Color.red);
        //this.getContentPane().setBackground(new Color(255, 0, 0));
        this.getContentPane().setBackground(new Color(0xFF0000));
    }

}
