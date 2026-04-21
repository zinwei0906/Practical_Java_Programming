
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class SimpleCRUD extends JFrame {

    private String host = "jdbc:derby://localhost:1527/collegedb";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "Programme";
    private Connection conn;
    private PreparedStatement stmt;

    private JTextField jtfCode = new JTextField();
    private JTextField jtfName = new JTextField();
    private JTextField jtfFaculty = new JTextField();
    private JButton jbtAdd = new JButton("Create");
    private JButton jbtRetrieve = new JButton("Retrieve");
    private JButton jbtUpdate = new JButton("Update");
    private JButton jbtDelete = new JButton("Delete");
    private JButton jbtList = new JButton("List");

    public SimpleCRUD() {
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
        createConnection();

        setTitle("Programme CRUD");
        setSize(600, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public ResultSet selectRecord(String code) {
        String queryStr = "SELECT * FROM " + tableName + " WHERE Code = ?";
        ResultSet rs = null;
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, code);

            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
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
                String queryStr = "INSERT INTO  " + tableName + " VALUES(?,?,?)";
                try {
                    stmt = conn.prepareStatement(queryStr);
                    stmt.setString(1, code);
                    stmt.setString(2, name);
                    stmt.setString(3, faculty);
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Records Insert Safefully.", "Insert Records", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private class RetrieveListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String code = jtfCode.getText();
                ResultSet rs = selectRecord(code);
                if (rs.next()) {
                    jtfName.setText(rs.getString("Name"));
                    jtfFaculty.setText(rs.getString("Faculty"));
                } else {
                    JOptionPane.showMessageDialog(null, "No such programme code.", "RECORD NOT FOUND", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private class UpdateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String code = jtfCode.getText();
            String name = jtfName.getText();
            String faculty = jtfFaculty.getText();
            if (code == null || code.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Which Code you want to update", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (name == null || name.equals("") || faculty == null || faculty.equals("")) {
                JOptionPane.showMessageDialog(null, "Name and Faculty cant be NULL", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                ResultSet rs = selectRecord(code);
                try {
                    if (rs.next()) {
                        String queryStr2 = "UPDATE  " + tableName + " SET NAME=?,FACULTY=? WHERE CODE=?";
                        try {
                            stmt = conn.prepareStatement(queryStr2);
                            stmt.setString(1, name);
                            stmt.setString(2, faculty);
                            stmt.setString(3, code);
                            stmt.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Records Update Safefully.", "Update Records", JOptionPane.INFORMATION_MESSAGE);
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No such programme code.", "RECORD NOT FOUND", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private class DeleteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String code = jtfCode.getText();
            if (code == null || code.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Which Code you want to Delete", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                ResultSet rs = selectRecord(code);
                try {
                    if (rs.next()) {
                        String queryStr2 = "DELETE FROM  " + tableName + " WHERE CODE=?";
                        try {
                            stmt = conn.prepareStatement(queryStr2);
                            stmt.setString(1, code);
                            stmt.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Records Delete Safefully.", "Delete Records", JOptionPane.INFORMATION_MESSAGE);
                            jtfCode.setText("");
                            jtfName.setText("");
                            jtfFaculty.setText("");
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No such programme code.", "RECORD NOT FOUND", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private class ListListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String queryStr = "SELECT * FROM " + tableName;
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
    }

    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);

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
        SimpleCRUD frm = new SimpleCRUD();
    }
}
