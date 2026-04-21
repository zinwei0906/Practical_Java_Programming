package practical2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class P2Q5 extends JFrame {

    class MaintainClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String output = "";
            if (e.getSource() == Retrieve) {
                for (int i = 1; i <= studentList.size(); i++) {
                    output += "\n" + i + " . " + studentList.get(i - 1);
                }
                JOptionPane.showMessageDialog(null, output, "Student List", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (e.getSource() == Create) {
                    String NewStudentName = JOptionPane.showInputDialog("Enter New Student's Name : ");
                    if (NewStudentName != null && !NewStudentName.isEmpty()) {
                        studentList.add(NewStudentName);
                    }
                } else if (e.getSource() == Update) {
                    int UpdateNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Which Number Of Student You Want To Update ")) - 1;
                    String UpdateName = JOptionPane.showInputDialog("Current Student Name is " + studentList.get(UpdateNumber) + " . Enter Updated Name : ");
                    if (UpdateName != null && !UpdateName.isEmpty()) {
                        studentList.set(UpdateNumber, UpdateName);
                    }
                } else if (e.getSource() == Delete) {
                    int DeleteNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Which Number Of Student You Want To Delete ")) - 1;
                    studentList.remove(DeleteNumber);
                }
                for (int i = 1; i <= studentList.size(); i++) {
                    output += "\n" + i + " . " + studentList.get(i - 1);
                }
                JOptionPane.showMessageDialog(null, output, "Updated Student List", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
    private JButton Create = new JButton("Create");
    private JButton Retrieve = new JButton("Retrieve");
    private JButton Update = new JButton("Update");
    private JButton Delete = new JButton("Delete");
    private ArrayList<String> studentList = new ArrayList<String>();

    public P2Q5() {
        studentList.add("Abu1");
        studentList.add("Ali2");
        studentList.add("Aku3");
        studentList.add("Alibaba4");
        studentList.add("Aduhai5");
        setLayout(new FlowLayout(FlowLayout.CENTER));

        //Add the four buttons
        Create.setFont(new Font("Arial", Font.BOLD, 25));
        Retrieve.setFont(new Font("Arial", Font.BOLD, 25));
        Update.setFont(new Font("Arial", Font.BOLD, 25));
        Delete.setFont(new Font("Arial", Font.BOLD, 25));
        add(Create);
        add(Retrieve);
        add(Update);
        add(Delete);

        Create.addActionListener(new MaintainClass());
        Retrieve.addActionListener(new MaintainClass());
        Update.addActionListener(new MaintainClass());
        Delete.addActionListener(new MaintainClass());

        setTitle("Maintain Student");
        setSize(600, 100);
        setLocation(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new P2Q5();
    }

}
