import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    Image image;
    Panel() {
        image = new ImageIcon("Sky.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    //This method is invoked automatically, there is no need to call it!!!
    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.red);
        //g2D.setStroke(new BasicStroke(5));
        //g2D.drawLine(0, 0, 500, 500);
        //g2D.drawRect(0,0, 100, 200);
        //g2D.fillRect(0, 0, 100, 200);
        //g2D.drawOval(100, 100 , 200, 200);
        //g2D.fillOval(100, 100 , 200, 200);
        //g2D.drawArc(0, 0, 100, 100, 0, 180);
        //g2D.fillArc(0, 0, 100, 100, 0, 180);
        //g2D.setPaint(Color.white);
        //g2D.fillArc(0, 0, 100, 100, 180, 180);
        //int[] xPoints = {150, 250, 350};
        //int[] yPoints = {300, 150, 300};
        //g2D.drawPolygon(xPoints, yPoints, 3);
        //g2D.fillPolygon(xPoints, yPoints, 3);
        //g2D.setFont(new Font("MV Boli", Font.BOLD, 50));
        //g2D.drawString("Text goes here", 50, 50);

        g2D.drawImage(image, 0, 0, null);

    }
}
