import javax.swing.*;

public class window {
    private JFrame f1;
    public window() {
        f1 = new JFrame("slice");

        // JFrame Properties
        f1.setSize(400, 400);
    f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }
}
