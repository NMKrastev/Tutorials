import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    JButton buttonOne = new JButton("Button #1");
    JButton buttonTwo = new JButton("Button #2");
    JButton buttonThree = new JButton("Button #3");

    Frame() {

        buttonOne.setBounds(100, 100, 100, 100);
        buttonTwo.setBounds(200, 100, 100, 100);
        buttonThree.setBounds(300, 100, 100, 100);

        //This way the code looks way cleaner and you don't have
        //to implement ActionListener in the class
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed button #1");
            }
        });
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed button #2");
            }
        });
        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed button #3");
            }
        });

        this.add(buttonOne);
        this.add(buttonTwo);
        this.add(buttonThree);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setFocusable(false);
        this.setVisible(true);


    }
}
