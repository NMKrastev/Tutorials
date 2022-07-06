import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 30));
        textField.setFont(new Font("Consolas", Font.BOLD, 20));
        textField.setForeground(Color.red);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            //this.dispose();
            System.out.println("Submitted text: " + textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        }
    }
}
