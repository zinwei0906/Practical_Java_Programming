package practical10;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Wei
 */
public class P10Q3 extends JFrame {

    private String host = "jdbc:derby://localhost:1527/collegedb";
    private String user = "nbuser";
    private String password = "nbuser";
    private String sqlquery = "Select * from Student";

    private StudentTableModel studenttablemodel;
    private JTable jtStudent;
    private JScrollPane jspStudent;
    private TableRowSorter<TableModel> sorter;
    private JLabel jlbFilter = new JLabel("Search : ");
    private JTextField jtfFilter = new JTextField();
    private JButton jbFilter = new JButton("Filter");

    public P10Q3() {
        Font font = new Font("TimesRoman", Font.BOLD, 16);
        try {
            studenttablemodel = new StudentTableModel(host, user, password, sqlquery);
            jtStudent = new JTable(studenttablemodel);
            jspStudent = new JScrollPane(jtStudent);
            sorter = new TableRowSorter<TableModel>(jtStudent.getModel());
            jtStudent.setRowSorter(sorter);
            jtStudent.setFont(font);
            add(jspStudent, BorderLayout.CENTER);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error", "SQL Error", JOptionPane.ERROR_MESSAGE);
        }

        JPanel panel = new JPanel(new BorderLayout());
        jlbFilter.setFont(font);
        jtfFilter.setFont(font);
        jbFilter.setFont(font);
        panel.add(jlbFilter, BorderLayout.WEST);
        panel.add(jtfFilter, BorderLayout.CENTER);
        panel.add(jbFilter, BorderLayout.EAST);
        add(panel, BorderLayout.NORTH);

        setTitle("Student Information");
        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        jbFilter.addActionListener(new FilterListener());
        jtfFilter.addActionListener(new FilterListener());
        addWindowListener(new WindowCloseListener());
    }

    private class FilterListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String search = jtfFilter.getText();
                if (search.length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter(search));
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class WindowCloseListener extends WindowAdapter {

        @Override
        public void windowClosed(WindowEvent event) {
            try {
                studenttablemodel.DisconnectDatabase();
                System.exit(0);

            } catch (SQLException ex) {
                Logger.getLogger(P10Q3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void main(String[] args) {
        new P10Q3();
    }

}
