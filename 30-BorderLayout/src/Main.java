import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //Layout Manager - defines the natural layout for components within a container
        //3 common managers
        //BorderLayout - it places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER
        //All extra space is placed in the center area

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setVisible(true);

        JPanel panelOne = new JPanel();
        JPanel panelTwo = new JPanel();
        JPanel panelThree = new JPanel();
        JPanel panelFour = new JPanel();
        JPanel panelFive = new JPanel();

        panelOne.setBackground(Color.red);
        panelTwo.setBackground(Color.green);
        panelThree.setBackground(Color.yellow);
        panelFour.setBackground(Color.cyan);
        panelFive.setBackground(Color.magenta);

        panelOne.setPreferredSize(new Dimension(50, 50));
        panelTwo.setPreferredSize(new Dimension(50, 50));
        panelThree.setPreferredSize(new Dimension(50, 50));
        panelFour.setPreferredSize(new Dimension(50, 50));
        panelFive.setPreferredSize(new Dimension(50, 50));

        frame.add(panelOne, BorderLayout.NORTH);
        frame.add(panelTwo, BorderLayout.SOUTH);
        frame.add(panelThree, BorderLayout.EAST);
        frame.add(panelFour, BorderLayout.WEST);
        frame.add(panelFive, BorderLayout.CENTER);
    }
}
