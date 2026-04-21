package chapter8;

import javax.swing.*;

public class TestButtonIcons extends JFrame {

    public TestButtonIcons() {
        ImageIcon usIcon = new ImageIcon(getClass().getResource("/images/usIcon.gif"));
        ImageIcon caIcon = new ImageIcon(getClass().getResource("/images/canadaIcon.gif"));
        ImageIcon ukIcon = new ImageIcon(getClass().getResource("/images/ukIcon.gif"));
        JButton jbt = new JButton("Click me", usIcon);
        jbt.setPressedIcon(caIcon);
        jbt.setRolloverIcon(ukIcon);
        add(jbt);
    }

    public static void main(String[] args) {
        TestButtonIcons frame = new TestButtonIcons();
        frame.setTitle("Button Icons");
        frame.setSize(250, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
