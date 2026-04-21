package ui;

import control.MaintainStudentControl;
import control.MaintainProgrammeControl;
import domain.Student;
import domain.Programme;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MaintainStudentFrame extends JFrame {

    private MaintainProgrammeControl progControl;
    private MaintainStudentControl studControl;
    private JTextField jtfID = new JTextField();
    private JTextField jtfIC = new JTextField();
    private JTextField jtfName = new JTextField();
    private JTextField jtfLevel = new JTextField();
    private JTextField jtfCode = new JTextField();
    private JTextField jtfYear = new JTextField();
    private JButton jbtAdd = new JButton("Create");
    private JButton jbtRetrieve = new JButton("Retrieve");
    private JButton jbtUpdate = new JButton("Update");
    private JButton jbtDelete = new JButton("Delete");
    private JButton jbtList = new JButton("List");

    public MaintainStudentFrame() {
        studControl = new MaintainStudentControl();
        progControl = new MaintainProgrammeControl();

        JPanel jpCenter = new JPanel(new GridLayout(6, 2));
        jpCenter.add(new JLabel("  Student ID "));
        jpCenter.add(jtfID);
        jpCenter.add(new JLabel("  Student IC "));
        jpCenter.add(jtfIC);
        jpCenter.add(new JLabel("  Student Name"));
        jpCenter.add(jtfName);
        jpCenter.add(new JLabel("  Level  "));
        jpCenter.add(jtfLevel);
        jpCenter.add(new JLabel("  Programme Code "));
        jpCenter.add(jtfCode);
        jpCenter.add(new JLabel("  Year"));
        jpCenter.add(jtfYear);
        add(jpCenter);

        JPanel jpSouth = new JPanel();
        jpSouth.add(jbtAdd);
        jpSouth.add(jbtRetrieve);
        jpSouth.add(jbtUpdate);
        jpSouth.add(jbtDelete);
        jpSouth.add(jbtList);
        add(jpSouth, BorderLayout.SOUTH);

        jbtAdd.addActionListener(new AddListener());
        jbtRetrieve.addActionListener(new RetrieveListener());
        jbtUpdate.addActionListener(new UpdateListener());
        jbtDelete.addActionListener(new DeleteListener());
        jbtList.addActionListener(new ListListener());

        setTitle("Student CRUD");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class RetrieveListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String id = jtfID.getText();
            Student student = studControl.selectRecord(id);
            if (student != null) {
                jtfIC.setText(student.getIc());
                jtfName.setText(student.getName());
                jtfLevel.setText("" + student.getLevel());
                jtfCode.setText(student.getProgramme().getCode());
                jtfYear.setText("" + student.getYear());
            } else {
                JOptionPane.showMessageDialog(null, "No such Student ID.", "RECORD NOT FOUND", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class AddListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String id = jtfID.getText();
                String ic = jtfIC.getText();
                String name = jtfName.getText();
                String code = jtfCode.getText();
                char level = jtfLevel.getText().charAt(0);
                int year = Integer.parseInt(jtfYear.getText());
                Programme programme = progControl.selectRecord(code);
                if (programme != null) {
                    Programme prog = new Programme(code, "test", "test");
                    Student stud = new Student(id, ic, name, level, prog, year);
                    studControl.insertRecord(stud);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Programme Code.", "RECORD NOT FOUND", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Text Field cant be NULL", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class UpdateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String id = jtfID.getText();
                String ic = jtfIC.getText();
                String name = jtfName.getText();
                String code = jtfCode.getText();
                char level = jtfLevel.getText().charAt(0);
                int year = Integer.parseInt(jtfYear.getText());
                Programme programme = progControl.selectRecord(code);
                if (programme != null) {
                    Programme prog = new Programme(code, "test", "test");
                    Student stud = new Student(id, ic, name, level, prog, year);
                    studControl.updateRecord(stud);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Programme Code.", "RECORD NOT FOUND", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Text Field cant be NULL", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class DeleteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String id = jtfID.getText();
            Student student = studControl.selectRecord(id);
            if (student != null) {
                if (JOptionPane.showConfirmDialog(null, "Confirm Delete the ID : " + id + " ? ",
                        "Confirm Delete Message", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    studControl.deleteRecord(id);
                    jtfID.setText("");
                    jtfIC.setText("");
                    jtfName.setText("");
                    jtfLevel.setText("");
                    jtfCode.setText("");
                    jtfYear.setText("");
                }

            } else {
                JOptionPane.showMessageDialog(null, "No such Student ID.", "RECORD NOT FOUND", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class ListListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            studControl.listRecord();
        }
    }

    public static void main(String[] args) {
        MaintainStudentFrame frm = new MaintainStudentFrame();
    }
}
