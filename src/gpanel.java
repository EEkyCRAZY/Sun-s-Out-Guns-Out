import javax.swing.JPanel;
import java.awt.*;

public class gpanel extends JPanel {
    public gpanel() {

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(100, 100, 200, 50);
    }
}


