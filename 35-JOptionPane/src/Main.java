import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //JOptionPane - pop up a standard dialog box that prompts users for a value
        //or informs them of something.

        //JOptionPane.showMessageDialog(null, "This is what will be shown", "JOptionPane", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is what will be shown", "JOptionPane", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is what will be shown", "JOptionPane", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is what will be shown", "JOptionPane", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is what will be shown", "JOptionPane", JOptionPane.ERROR_MESSAGE);

        //System.out.println(JOptionPane.showConfirmDialog(null, "Are you doing well today?", "Title goes here", JOptionPane.YES_NO_CANCEL_OPTION));
        //Answer returns a value that can be stored
        //int answer = JOptionPane.showConfirmDialog(null, "Are you doing well today?", "Title goes here", JOptionPane.YES_NO_CANCEL_OPTION);

        /*if (answer == 0) {
            String name = JOptionPane.showInputDialog("What is your name?: ");
            System.out.printf("Hello %s", name);
        }*/

        String[] responses = {"Yes, I'm!", "No, I'm not!", "You will cancel!"};
        ImageIcon icon = new ImageIcon("info.png");
        JOptionPane.showOptionDialog(null, "Are you learning to code?", "Title",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                icon, responses, 0);
    }
}
