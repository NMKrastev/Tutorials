import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    JRadioButton car;
    JRadioButton motorcycle;
    JRadioButton bicycle;
    ImageIcon carIcon;
    ImageIcon motorcycleIcon;
    ImageIcon bicycleIcon;

    Frame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        carIcon = new ImageIcon("Car.png");
        motorcycleIcon = new ImageIcon("Motorcycle.png");
        bicycleIcon = new ImageIcon("Bicycle.png");

        carIcon = new ImageIcon("Car.png");
        motorcycleIcon = new ImageIcon("Motorcycle.png");
        bicycleIcon = new ImageIcon("Bicycle.png");

        car = new JRadioButton("Car");
        car.setFocusable(false);
        motorcycle = new JRadioButton("Motorcycle");
        motorcycle.setFocusable(false);
        bicycle = new JRadioButton("Bicycle");
        bicycle.setFocusable(false);

        ButtonGroup group = new ButtonGroup();
        group.add(car);
        group.add(motorcycle);
        group.add(bicycle);

        car.addActionListener(this);
        motorcycle.addActionListener(this);
        bicycle.addActionListener(this);

        car.setIcon(carIcon);
        motorcycle.setIcon(motorcycleIcon);
        bicycle.setIcon(bicycleIcon);

        this.add(car);
        this.add(motorcycle);
        this.add(bicycle);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == car) {
            System.out.println("You have a car");
        } else if (e.getSource() == motorcycle) {
            System.out.println("You have a motorcycle");
        } else {
            System.out.println("You have a bicycle");
        }

    }
}
