import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //JLayeredPane - Swing container that provides a
        //third dimension for positioning components
        //example: depth, Z-index

        JLabel labelOne = new JLabel();
        labelOne.setOpaque(true);
        labelOne.setBackground(Color.red);
        labelOne.setBounds(50, 50, 200, 200);

        JLabel labelTwo = new JLabel();
        labelTwo.setOpaque(true);
        labelTwo.setBackground(Color.green);
        labelTwo.setBounds(100, 100, 200, 200);

        JLabel labelThree = new JLabel();
        labelThree.setOpaque(true);
        labelThree.setBackground(Color.cyan);
        labelThree.setBounds(150, 150, 200, 200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);
        layeredPane.add(labelOne, JLayeredPane.DEFAULT_LAYER ); //, Integer.valueOf(0)
        layeredPane.add(labelTwo, JLayeredPane.DEFAULT_LAYER); //, Integer.valueOf(2)
        layeredPane.add(labelThree, JLayeredPane.DRAG_LAYER); //, Integer.valueOf(4)

        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
