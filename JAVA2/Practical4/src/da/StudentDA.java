package da;

import domain.Programme;
import domain.Student;
import java.sql.*;
import javax.swing.*;

public class StudentDA {

    private String host = "jdbc:derby://localhost:1527/collegedb";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "Student";
    private Connection conn;
    private PreparedStatement stmt;

    public StudentDA() {
        createConnection();
    }

    public Student getRecord(String id) {
        String queryStr = "SELECT * FROM " + tableName + " WHERE ID = ?";
        Student student = null;
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String code = rs.getString("PROGRAMMECODE");
                ProgrammeDA da = new ProgrammeDA();
                Programme programme = da.getRecord(code);
                student = new Student(id, rs.getString("IC"), rs.getString("Name"), rs.getString("Level").charAt(0), programme, rs.getInt("YR"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return student;
    }

    public void storeRecord(Student stud) {
        String queryStr = "INSERT INTO " + tableName + " VALUES(?,?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, stud.getId());
            stmt.setString(2, stud.getIc());
            stmt.setString(3, stud.getName());
            stmt.setString(4, stud.getLevel() + "");
            stmt.setString(5, stud.getProgramme().getCode());
            stmt.setInt(6, stud.getYear());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Records Insert Safefully.", "Insert Records", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editRecord(Student stud) {
        String queryStr2 = "UPDATE  " + tableName + " SET IC=?,NAME=?,LEVEL=?,PROGRAMMECODE=?,YR=? WHERE ID=?";
        try {
            stmt = conn.prepareStatement(queryStr2);
            stmt.setString(1, stud.getIc());
            stmt.setString(2, stud.getName());
            stmt.setString(3, stud.getLevel() + "");
            stmt.setString(4, stud.getProgramme().getCode());
            stmt.setInt(5, stud.getYear());
            stmt.setString(6, stud.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Records Update Safefully.", "Update Records", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void removeRecord(String id) {
        String queryStr2 = "DELETE FROM  " + tableName + " WHERE ID=?";
        try {
            stmt = conn.prepareStatement(queryStr2);
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Records Delete Safefully.", "Delete Records", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void readRecord() {
        String queryStr = "SELECT * FROM " + tableName;
        ResultSet rs = null;
        String ListRecord = "";
        try {
            stmt = conn.prepareStatement(queryStr);
            rs = stmt.executeQuery();
            while (rs.next()) {
                ListRecord += rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getString(4) + " | " + rs.getString(5) + " | " + rs.getString(6) + "\n";
            }
            JOptionPane.showMessageDialog(null, ListRecord, "List OF Records!", JOptionPane.INFORMATION_MESSAGE);

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
        if (conn != null)
            try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        StudentDA da = new StudentDA();
        Student stud = da.getRecord("IA");
        System.out.println(stud);
    }
}
