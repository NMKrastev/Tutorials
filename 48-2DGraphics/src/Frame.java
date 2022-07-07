import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    Panel panel;
    Frame() {

        panel = new Panel();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
