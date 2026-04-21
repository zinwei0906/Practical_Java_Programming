package practical2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class P2Q3 extends JFrame {

    private JButton Red = new JButton("Red");
    private JButton Green = new JButton("Green");
    private JButton Blue = new JButton("Blue");
    private JLabel COLOR = new JLabel("COLOR");

    public P2Q3() {
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        COLOR.setFont(new Font("Arial", Font.BOLD, 30));
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        p1.add(COLOR);
        add(p1, BorderLayout.NORTH);

        JPanel p2 = new JPanel();
        //Add the three color buttons
        Red.setFont(new Font("Arial", Font.BOLD, 20));
        Green.setFont(new Font("Arial", Font.BOLD, 20));
        Blue.setFont(new Font("Arial", Font.BOLD, 20));
        p2.add(Red);
        p2.add(Green);
        p2.add(Blue);
        add(p2, BorderLayout.CENTER);

        Red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                COLOR.setForeground(Color.RED);
            }
        });
        Green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                COLOR.setForeground(Color.GREEN);
            }
        });
        Blue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                COLOR.setForeground(Color.BLUE);
            }
        });

        setTitle("Primary Color");
        setSize(500, 300);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new P2Q3();
    }

}
