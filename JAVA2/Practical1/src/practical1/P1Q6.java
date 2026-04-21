package practical1;

import javax.swing.*;
import java.awt.*;

public class P1Q6 extends JFrame {

    public P1Q6() {
//        JFrame frame = new JFrame(" Question 5 ");
//        this.setLayout(new BorderLayout());

        JPanel Panel1 = new JPanel(new GridLayout(1, 2));
//        Panel1.setLayout(new GridLayout(1, 2));
        Panel1.add(new JButton("123"));
        Panel1.add(new JButton("456"));

        JPanel Panel2 = new JPanel(new GridLayout(1, 2));
//        Panel2.setLayout(new GridLayout(1, 2));
        Panel2.add(new JButton("ABC"));
        Panel2.add(new JButton("DEF"));

        add(Panel1, BorderLayout.SOUTH);
        add(Panel2, BorderLayout.CENTER);
        //Set the frame title is Question 6
        setTitle("Question 6");
        //Set the frame 500pixels wide and 300 pixels high
        setSize(500, 300);
        //Set the frame closed ,the program is terminate
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set the frame be center on screen
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        P1Q6 frame = new P1Q6();

    }

}
