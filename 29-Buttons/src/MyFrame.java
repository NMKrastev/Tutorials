import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("Hello.png");
        ImageIcon iconTwo = new ImageIcon("HandWave.png");

        label = new JLabel();
        label.setIcon(iconTwo);
        label.setBounds(150, 250, 250, 160);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(110, 50, 250, 160);
        button.addActionListener(this);
        button.setText("Click for Hello");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-5);
        button.setForeground(Color.red);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Hello");
            //button.setEnabled(false);
            label.setVisible(true);

        }
    }

}
