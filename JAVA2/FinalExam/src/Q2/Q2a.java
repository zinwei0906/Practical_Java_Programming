package Q2;

//Name : Tee Ka Seng
//Student ID : 19WMD10728
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Q2a extends JFrame {

    private JTextField jtfStaffID = new JTextField();
    private JTextField jtfStaffName = new JTextField();
    private JTextField jtfDepartment = new JTextField();
    private JButton jbtnSubmit = new JButton("Submit");

    public Q2a() {
       setLayout(new GridLayout(4, 2));
        add(new JLabel("  Staff ID : "));
        add(jtfStaffID);
        add(new JLabel("  Full Name : "));
        add(jtfStaffName);
        add(new JLabel("  Department : "));
        add(jtfDepartment);
        add(new JLabel(""));
        add(jbtnSubmit);

        setTitle("Staff Registration");
        setSize(600, 300);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Q2a();
    }

}
