import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    JComboBox comboBox;

    Frame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};
        //Should pass reference data types - String, Integer etc. Using Wrapper classes.
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        //You can type the item in the comboBox
        comboBox.setEditable(true);
        //Gives you the number of items in the comboBox
        //comboBox.getItemCount();
        //Adds item to the comboBox
        //comboBox.addItem("horse");
        //Inserts item at a certain index
        //comboBox.insertItemAt("reptile", 2);
        //Selects from which index to begin
        //comboBox.setSelectedIndex(0);
        //Remove and items from the comboBox
        //comboBox.removeItem("horse");
        //Removes item from certain index
        //comboBox.removeItemAt(2);
        //Removes all items
        //comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
