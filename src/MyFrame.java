import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyPanel panel;
    MyFrame() {
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawLine(0, 0, 500, 500);
    }
}
