package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MaintainInformation extends JFrame {

    private JButton jbtProgramme = new JButton("Maintain Programme");
    private JButton jbtStudent = new JButton("Maintain Student");

    public MaintainInformation() {
        setLayout(new GridLayout(3, 1));
        add(jbtProgramme);
        add(new JLabel(""));
        add(jbtStudent);
        setTitle("Maintain Information");
        setSize(800, 300);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        jbtProgramme.addActionListener(new ButtonListenerClass());
        jbtStudent.addActionListener(new ButtonListenerClass());

    }

    private class ButtonListenerClass implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jbtProgramme) {
                setVisible(false);
                new MaintainProgrammeFrame().setVisible(true);
            } else if (e.getSource() == jbtStudent) {
                setVisible(false);
                new MaintainStudentFrame().setVisible(true);
            }
        }
    }

    public static void main(String[] args) {
        MaintainInformation frm = new MaintainInformation();
    }
}
