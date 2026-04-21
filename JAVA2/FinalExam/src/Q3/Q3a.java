package Q3;
//Name : Tee Ka Seng
//Student ID : 19WMD10728

import java.awt.*;
import javax.swing.*;

public class Q3a extends JFrame {

    public Q3a() {
        String[] items = {"item1", "item2", "item3"};
        JComboBox jcbitems = new JComboBox(items);
        jcbitems.setBackground(Color.white);
        jcbitems.setForeground(Color.blue);
        jcbitems.setSelectedIndex(0);

        JTextField jtfTest = new JTextField();
        jtfTest.setForeground(Color.green);
        jtfTest.setHorizontalAlignment(JTextField.LEFT);

        add(jcbitems,BorderLayout.NORTH);
        add(jtfTest,BorderLayout.SOUTH);
        setTitle("Test");
        setSize(600, 300);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q3a();
    }

}
