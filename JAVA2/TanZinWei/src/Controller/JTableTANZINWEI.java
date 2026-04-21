//Author : TAN ZIN WEI
//Student ID : 19WMD06432
//Program : DFT2G6
package Controller;

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
public class JTableTANZINWEI extends JFrame {

    private String host = "jdbc:derby://localhost:1527/EmployeeDB";
    private String user = "EmployeeDB";
    private String password = "EmployeeDB";
    private String sqlquery = "Select * from Employee";

    private ResultSetTableModel employeetablemodel;
    private JTable jtEmployee;
    
    
    private JScrollPane jspEmployee;
    private TableRowSorter<TableModel> sorter;

    public JTableTANZINWEI() {

        try {
            employeetablemodel = new ResultSetTableModel(host, user, password, sqlquery);
            jtEmployee = new JTable(employeetablemodel);
            jspEmployee = new JScrollPane(jtEmployee);
            sorter = new TableRowSorter<TableModel>(jtEmployee.getModel());
            jtEmployee.setRowSorter(sorter);
            add(jspEmployee);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error", "SQL Error", JOptionPane.ERROR_MESSAGE);
        }

        setTitle("Employee Records Table");
        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new JTableTANZINWEI();
    }

}
