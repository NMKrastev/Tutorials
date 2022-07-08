import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        ArrayList<JLabel> deck = new ArrayList<JLabel>();

        //This is working the same but should be repeated 51 more times for each card
        //That is why the for loop is better option
        /*ImageIcon AC = new ImageIcon("54-AnonymousObjects\\\\cardsDeck\\1.png");
        JLabel ACLabel = new JLabel(AC);
        deck.add(ACLabel);*/

        //The images of cards are too big so not all the cards are visible;
        for (int i = 1; i <= 52; i++) {

            deck.add(new JLabel(new ImageIcon("54-AnonymousObjects\\cardsDeck\\" + i + ".png")));
            frame.add(deck.get(i - 1));
        }

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
