package practical1;

import javax.swing.*;
import java.awt.*;

public class P1Q7 extends JFrame {

    class Panel extends JPanel {

        public Panel(String string1, String string2) {
            setLayout(new GridLayout(1, 2));
            add(new JButton(string1));
            add(new JButton(string2));
        }
    }

    public P1Q7() {
        JFrame frame = new JFrame(" Question 5 ");
        this.setLayout(new BorderLayout());
        add(new Panel("1234", "5678"), BorderLayout.SOUTH);
        add(new Panel("ABCD", "EFGH"), BorderLayout.CENTER);
        //Set the frame title is Question 7
        setTitle("Question 7");
        //Set the frame 500pixels wide and 300 pixels high
        setSize(500, 300);
        //Set the frame closed ,the program is terminate
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set the frame be center on screen
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new P1Q7();
    }
}
