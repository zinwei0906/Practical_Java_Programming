package da;

import domain.Programme;
import java.sql.*;
import javax.swing.*;

public class ProgrammeDA {

    private String host = "jdbc:derby://localhost:1527/collegedb";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "Programme";
    private Connection conn;
    private PreparedStatement stmt;

    public ProgrammeDA() {
        createConnection();
    }

    public Programme getRecord(String code) {
        String queryStr = "SELECT * FROM " + tableName + " WHERE Code = ?";
        Programme programme = null;
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, code);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                programme = new Programme(code, rs.getString("Name"), rs.getString("Faculty"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return programme;
    }

    public void storeRecord(Programme prog) {
        String queryStr = "INSERT INTO  Programme VALUES(?,?,?)";
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, prog.getCode());
            stmt.setString(2, prog.getName());
            stmt.setString(3, prog.getFaculty());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Records Insert Safefully.", "Insert Records", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editRecord(Programme prog) {
        String queryStr2 = "UPDATE  Programme SET NAME=?,FACULTY=? WHERE CODE=?";
        try {
            stmt = conn.prepareStatement(queryStr2);
            stmt.setString(1, prog.getName());
            stmt.setString(2, prog.getFaculty());
            stmt.setString(3, prog.getCode());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Records Update Safefully.", "Update Records", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void removeRecord(String code) {
        String queryStr2 = "DELETE FROM  Programme WHERE CODE=?";
        try {
            stmt = conn.prepareStatement(queryStr2);
            stmt.setString(1, code);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Records Delete Safefully.", "Delete Records", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void readRecord() {
        String queryStr = "SELECT * FROM Programme";
        ResultSet rs = null;
        String ListRecord = "";
        try {
            stmt = conn.prepareStatement(queryStr);
            rs = stmt.executeQuery();
            while (rs.next()) {
                ListRecord += rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + "\n";
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
        ProgrammeDA da = new ProgrammeDA();
        Programme programme = da.getRecord("IA");
        System.out.println(programme);
    }
}
