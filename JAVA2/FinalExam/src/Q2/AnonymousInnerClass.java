package Q2;

//Name : Tee Ka Seng
//Student ID : 19WMD10728
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousInnerClass extends JFrame {

    private JButton jbtSubmit = new JButton("SUBMIT");

    public AnonymousInnerClass() {
        setLayout(new FlowLayout());
        add(jbtSubmit);
        // Part A
        jbtSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "SUBMIT button is clicked");
            }
        });
    }

    public static void main(String[] args) {
        // not required
    }
}
