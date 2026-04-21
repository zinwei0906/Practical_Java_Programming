package ui;

import control.MaintainProgrammeControl;
import domain.Programme;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MaintainProgrammeFrame extends JFrame {

    private MaintainProgrammeControl progControl;
    private JTextField jtfCode = new JTextField();
    private JTextField jtfName = new JTextField();
    private JTextField jtfFaculty = new JTextField();
    private JButton jbtAdd = new JButton("Create");
    private JButton jbtRetrieve = new JButton("Retrieve");
    private JButton jbtUpdate = new JButton("Update");
    private JButton jbtDelete = new JButton("Delete");
    private JButton jbtList = new JButton("List");

    public MaintainProgrammeFrame() {
        progControl = new MaintainProgrammeControl();

        JPanel jpCenter = new JPanel(new GridLayout(3, 2));
        jpCenter.add(new JLabel("Programme Code"));
        jpCenter.add(jtfCode);
        jpCenter.add(new JLabel("Programme Name"));
        jpCenter.add(jtfName);
        jpCenter.add(new JLabel("Faculty"));
        jpCenter.add(jtfFaculty);
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

        setTitle("Programme CRUD");
        setSize(600, 200);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class RetrieveListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String code = jtfCode.getText();
            Programme programme = progControl.selectRecord(code);
            if (programme != null) {
                jtfName.setText(programme.getName());
                jtfFaculty.setText(programme.getFaculty());
            } else {
                JOptionPane.showMessageDialog(null, "No such programme code.", "RECORD NOT FOUND", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class AddListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String code = jtfCode.getText();
            String name = jtfName.getText();
            String faculty = jtfFaculty.getText();

            if (code == null || code.equals("") || name == null || name.equals("") || faculty == null || faculty.equals("")) {
                JOptionPane.showMessageDialog(null, "Code , Name and Faculty cant be NULL", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                Programme prog = new Programme(code, name, faculty);
                progControl.insertRecord(prog);
            }
        }
    }

    private class UpdateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String code = jtfCode.getText();
            String name = jtfName.getText();
            String faculty = jtfFaculty.getText();
            Programme programme = progControl.selectRecord(code);
            if (programme != null) {
                if (name == null || name.equals("") || faculty == null || faculty.equals("")) {
                    JOptionPane.showMessageDialog(null, "Name and Faculty cant be NULL", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    Programme prog = new Programme(code, name, faculty);
                    progControl.updateRecord(prog);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No such programme code.", "RECORD NOT FOUND", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class DeleteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String code = jtfCode.getText();
            Programme programme = progControl.selectRecord(code);
            if (programme != null) {
                if (JOptionPane.showConfirmDialog(null, "Confirm Delete the ID : " + code + " ? ",
                        "Confirm Delete Message", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    progControl.deleteRecord(code);
                    jtfCode.setText("");
                    jtfName.setText("");
                    jtfFaculty.setText("");
                }

            } else {
                JOptionPane.showMessageDialog(null, "No such programme code.", "RECORD NOT FOUND", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class ListListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            progControl.listRecord();
        }
    }

    public static void main(String[] args) {
        MaintainProgrammeFrame frm = new MaintainProgrammeFrame();
        
    }
}
