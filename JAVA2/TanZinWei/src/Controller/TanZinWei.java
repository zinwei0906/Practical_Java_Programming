//Author : TAN ZIN WEI
//Student ID : 19WMD06432
//Program : DFT2G6
package Controller;

import Model.Employee;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Wei
 */
public class TanZinWei extends JFrame {

    private String host = "jdbc:derby://localhost:1527/EmployeeDB";
    private String user = "EmployeeDB";
    private String password = "EmployeeDB";
    private String sqlquery = "Select * from Employee";

    private ResultSetTableModel employeetablemodel;
    private JTable jtEmployee;
    private JScrollPane jspEmployee;

    private EmployeeDA employeeDA = new EmployeeDA();
    private JTextField jtfID = new JTextField();
    private JTextField jtfName = new JTextField();
    private JTextField jtfGender = new JTextField();
    private JTextField jtfJobTitle = new JTextField();
    private JButton jbtSearch = new JButton("Search");
    private JButton jbtAdd = new JButton("New Records");
    private JButton jbtUpdate = new JButton("Update");
    private JButton jbtDelete = new JButton("Delete");

    private JMenuItem EmployeeRecords = new JMenuItem("Employee Records");
    private JMenuItem Close = new JMenuItem("Close");

    public TanZinWei() {

        JPanel jpCenter = new JPanel(new GridLayout(4, 2));
        jpCenter.add(new JLabel("Employee ID"));
        jpCenter.add(jtfID);
        jpCenter.add(new JLabel("Employee Name"));
        jpCenter.add(jtfName);
        jpCenter.add(new JLabel("Gender   "));
        jpCenter.add(jtfGender);
        jpCenter.add(new JLabel("Job Title"));
        jpCenter.add(jtfJobTitle);
        add(jpCenter, BorderLayout.CENTER);

        JPanel jpSouth = new JPanel();
        jpSouth.add(jbtSearch);
        jpSouth.add(jbtAdd);
        jpSouth.add(jbtUpdate);
        jpSouth.add(jbtDelete);
        add(jpSouth, BorderLayout.SOUTH);

        jbtSearch.addActionListener(new SearchListener());
        jbtAdd.addActionListener(new AddUpdateDeleteListener());
        jbtUpdate.addActionListener(new AddUpdateDeleteListener());
        jbtDelete.addActionListener(new AddUpdateDeleteListener());

        //JMenu
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);

        JMenu ShowMenu = new JMenu("Show records", false);
        JMenu ExitMenu = new JMenu("Exit", true);
        mb.add(ShowMenu);
        mb.add(ExitMenu);

        ShowMenu.add(EmployeeRecords);
        ExitMenu.add(Close);
        EmployeeRecords.setMnemonic('E');
        EmployeeRecords.setAccelerator(KeyStroke.getKeyStroke("control E"));
        Close.setMnemonic('C');

        EmployeeRecords.addActionListener(new JTableListener());
        Close.addActionListener(new JTableListener());

        setTitle("Employee Management System");
        setSize(600, 200);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class SearchListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jbtSearch) {
                String ID = JOptionPane.showInputDialog("Enter Employee ID to search : ");
                Employee employee = employeeDA.getRecord(ID);
                if (employee == null) {
                    JOptionPane.showMessageDialog(null, "Records does not exit.", "Message ", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String searchrecords = "\n Employee ID : " + employee.getEmployeeId() + "\n Employee Name : "
                            + employee.getEmployeeName() + "\n Gender : " + employee.getGender()
                            + "\n Job Title : " + employee.getJobTitle();
                    JOptionPane.showMessageDialog(null, searchrecords, "Search Records", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }
    }

    private class AddUpdateDeleteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String id = jtfID.getText();
            String name = jtfName.getText();
            String gender = jtfGender.getText();
            String jobtitle = jtfJobTitle.getText();
            if (id.equals("")) {
                JOptionPane.showMessageDialog(null, "Employee ID cant be NULL!", "ID IS NULL", JOptionPane.ERROR_MESSAGE);
            } else {
                Employee employee = new Employee(id, name, gender, jobtitle);
                if (e.getSource() == jbtAdd) {
                    employeeDA.addRecord(employee);
                } else if (e.getSource() == jbtUpdate) {
                    employeeDA.updateRecord(employee);
                } else if (e.getSource() == jbtDelete) {
                    if (JOptionPane.showConfirmDialog(null, "Delete record : " + id + " ? ",
                            "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
                        employeeDA.deleteRecord(id);
                    }

                }
            }
            jtfID.setText("");
            jtfName.setText("");
            jtfGender.setText("");
            jtfJobTitle.setText("");

        }
    }

    private class JTableListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Close) {
                setVisible(false);
            } else if (e.getSource() == EmployeeRecords) {
                setVisible(false);
                new JTableTANZINWEI().setVisible(true);
            }
        }
    }

    public static void main(String[] args) {
        new TanZinWei();
    }

}
