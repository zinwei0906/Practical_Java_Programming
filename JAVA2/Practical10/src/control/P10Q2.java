package control;

import domain.Programme;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Wei
 */
public class P10Q2 extends JFrame {

    private MaintainProgramme maintainProgramme = new MaintainProgramme();
    private ArrayList<Programme> arrayProgramme = maintainProgramme.getAll();
    private JTextField jtfName = new JTextField();
    private JTextField jtfFaculty = new JTextField();
    private JComboBox jcbProgramme = new JComboBox();

    public P10Q2() {
        Font font = new Font("TimesRoman", Font.BOLD, 28);
        JPanel p1 = new JPanel(new GridLayout(1, 1));
        p1.add(jcbProgramme).setFont(font);
        for (Programme prog : arrayProgramme) {
            jcbProgramme.addItem(prog.getCode());
        }
        add(p1, BorderLayout.NORTH);

        JPanel p2 = new JPanel(new GridLayout(2, 2, 20, 20));
        p2.add(new JLabel(" Programme Name")).setFont(font);
        p2.add(jtfName).setFont(new Font("TimesRoman", Font.BOLD, 20));
        p2.add(new JLabel(" Faculty")).setFont(font);
        p2.add(jtfFaculty).setFont(new Font("TimesRoman", Font.BOLD, 20));
        add(p2, BorderLayout.CENTER);

        jcbProgramme.addActionListener(new ProgrammeListener());

        setTitle("Search Programme");
        setSize(800, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class ProgrammeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jcbProgramme) {
                Programme pro = arrayProgramme.get(jcbProgramme.getSelectedIndex());
                jtfName.setText(pro.getName());
                jtfFaculty.setText(pro.getFaculty());

                //Other Method
//                for (Programme prog : arrayProgramme) {
//                    //Check ArrayList Porgramme is same with the selected value or not
//                    if (prog.getCode().equals(jcbProgramme.getSelectedItem())) {
//                        jtfName.setText(prog.getName());
//                        jtfFaculty.setText(prog.getFaculty());
//                    }
//                }
            }
        }
    }

    public static void main(String[] args) {
        new P10Q2();
    }

}
