package practical1;

import javax.swing.*;
import java.awt.*;

public class StudentInfoFrame extends JFrame {

    public StudentInfoFrame() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Register Number : "));
        add(new JTextField(10));
        add(new JLabel("Name : "));
        add(new JTextField(10));
        add(new JLabel("Programme Code : "));
        add(new JTextField(8));

        add(new JLabel(" "));
        add(new JButton("Submit"));

        //Set the frame title is Student Information
        setTitle("Student Information");
        //Set the frame 500pixels wide and 300 pixels high
//        setSize(500, 300);
        pack();
        //Set the frame closed ,the program is terminate
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set the frame be center on screen
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        StudentInfoFrame frame = new StudentInfoFrame();

    }
}
