package practical10;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
/**
 *
 * @author Wei
 */
public class Testing extends JFrame {

    private String[][] data = {
        {"Kundan Kumar Jha", "4031", "CSE"},
        {"Anand Jha", "6014", "IT"}
    };
    private String[] columnNames = {"Name", "Roll Number", "Department"};
    private JTable jtStudent = new JTable(data, columnNames);
    private JScrollPane jspStudent = new JScrollPane(jtStudent);
    private TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(jtStudent.getModel());
    private JLabel jlbFilter = new JLabel("Search : ");
    private JTextField jtfFilter = new JTextField();
    private JButton jbFilter = new JButton("Filter");
    
    private String host = "jdbc:derby://localhost:1527/collegedb";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "Student";

    public Testing() {
        Font font = new Font("TimesRoman", Font.BOLD, 16);

        jtStudent.setRowSorter(sorter);
        jtStudent.setFont(font);
        add(jspStudent, BorderLayout.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        jlbFilter.setFont(font);
        jtfFilter.setFont(font);
        jbFilter.setFont(font);
        panel.add(jlbFilter, BorderLayout.WEST);
        panel.add(jtfFilter, BorderLayout.CENTER);
        panel.add(jbFilter, BorderLayout.EAST);
        add(panel, BorderLayout.SOUTH);

        setTitle("Student Information");
        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        jbFilter.addActionListener(new FilterListener());
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

    public static void main(String[] args) {
        new Testing();
    }

}
