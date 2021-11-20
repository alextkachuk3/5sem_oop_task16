import javax.swing.*;

public class Main {
    private JPanel Panel;

    public Main() {
        Panel = new JPanel();
    }

    public static void main(String[] args) {
            JFrame frame = new JFrame("Main");
            frame.setContentPane(new Main().Panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
    }
}
