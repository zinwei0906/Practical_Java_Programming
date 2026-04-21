package practical1;

import javax.swing.*;
import java.awt.*;

public class P1Q5 extends JFrame {

    public P1Q5() {

        JFrame frame = new JFrame(" Question 5 ");
        this.setLayout(new FlowLayout());

        JPanel Panel1 = new JPanel();
        JPanel Panel2 = new JPanel();
        Panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
        Panel1.setBackground(Color.RED);
        Panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
        Panel2.setBackground(Color.YELLOW);

        Panel1.add(new JButton("123"));
        Panel1.add(new JButton("456"));
        Panel2.add(new JButton("ABC"));
        Panel2.add(new JButton("DEF"));

        this.add(Panel1);
        this.add(Panel2);

        //Set the frame title is Question 5
        setTitle("Question 5");
        //Set the frame 500pixels wide and 300 pixels high
        setSize(800, 400);
        //Set the frame closed ,the program is terminate
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set the frame be center on screen
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        P1Q5 frame = new P1Q5();

    }

}
