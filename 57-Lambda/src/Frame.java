import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    JButton button = new JButton("Button #1");
    JButton buttonTwo = new JButton("Button #2");
    Frame() {

        button.setBounds(100, 100, 200, 100);
        buttonTwo.setBounds(100, 200, 200, 100);
        button.addActionListener(
                    (e) -> System.out.println("You pressed button #1!")
        );
        buttonTwo.addActionListener(
                (e) -> System.out.println("You pressed button #2!")
        );

        this.add(button);
        this.add(buttonTwo);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setFocusable(false);
        this.setVisible(true);

    }
}
