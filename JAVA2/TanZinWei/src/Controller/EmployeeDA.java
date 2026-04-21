//Author : TAN ZIN WEI
//Student ID : 19WMD06432
//Program : DFT2G6
package Controller;

import Model.Employee;
import java.sql.*;
import javax.swing.*;

public class EmployeeDA {

    private String host = "jdbc:derby://localhost:1527/EmployeeDB";
    private String user = "EmployeeDB";
    private String password = "EmployeeDB";
    private String tableName = "Employee";
    private Connection conn;
    private PreparedStatement stmt;

    public EmployeeDA() {
        createConnection();
    }

    public Employee getRecord(String id) {
        String queryStr = "SELECT * FROM " + tableName + " WHERE Employee_ID= ?";
        Employee employee = null;
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                employee = new Employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return employee;
    }

    public void addRecord(Employee emp) {
        String queryStr = "INSERT INTO " + tableName + " VALUES(?,?,?,?)";
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, emp.getEmployeeId());
            stmt.setString(2, emp.getEmployeeName());
            stmt.setString(3, emp.getGender());
            stmt.setString(4, emp.getJobTitle());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Records Insert Safefully.", "Insert Records", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateRecord(Employee emp) {
        try {
            String updateStr = "UPDATE " + tableName + " SET Employee_Name = ?, Gender = ? , Job_Title = ? WHERE Employee_ID = ?";
            stmt = conn.prepareStatement(updateStr);
            stmt.setString(1, emp.getEmployeeName());
            stmt.setString(2, emp.getGender());
            stmt.setString(3, emp.getJobTitle());
            stmt.setString(4, emp.getEmployeeId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Records Update Safefully.", "Update Records", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deleteRecord(String id) {
        String deleteStr = "DELETE FROM " + tableName + " WHERE Employee_ID = ?";
        try {
            stmt = conn.prepareStatement(deleteStr);
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Records Delete Safefully.", "Delete Records", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("***TRACE: Connection established.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void shutDown() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new EmployeeDA();
    }
}
