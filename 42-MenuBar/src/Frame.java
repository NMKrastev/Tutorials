import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Frame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    Frame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("Load.png");
        saveIcon = new ImageIcon("Save.png");
        exitIcon = new ImageIcon("Exit.png");

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        //Adds keyboard shortcuts
        fileMenu.setMnemonic(KeyEvent.VK_F); //Alt + F for FileMenu
        editMenu.setMnemonic(KeyEvent.VK_E); //Alt + E for EditMenu
        helpMenu.setMnemonic(KeyEvent.VK_H); //Alt + H for HelpMenu
        loadItem.setMnemonic(KeyEvent.VK_L); //L for Load
        saveItem.setMnemonic(KeyEvent.VK_S); //S for Save
        exitItem.setMnemonic(KeyEvent.VK_E); //E for Exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loadItem) {
            System.out.println("Loaded a file");
        } else if (e.getSource() == saveItem) {
            System.out.println("Saved a file");
        } else {
            System.exit(0);
        }
    }
}
