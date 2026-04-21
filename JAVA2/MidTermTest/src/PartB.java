
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;

public class PartB extends JFrame {

    private String host = "jdbc:derby://localhost:1527/test";
    private String user = "test";
    private String password = "test";
    private String tableName = "Staff";
    private Connection conn;
    private PreparedStatement stmt;

    private JTextField jtfID = new JTextField();
    private JTextField jtfLastName = new JTextField();
    private JTextField jtfFirstName = new JTextField();
    private JTextField jtfMi = new JTextField();
    private JTextField jtfAddress = new JTextField();
    private JTextField jtfCity = new JTextField();
    private JTextField jtfState = new JTextField();
    private JTextField jtfTelephone = new JTextField();
    private JTextField jtfEmail = new JTextField();
    private JButton jbtView = new JButton("View");
    private JButton jbtInsert = new JButton("Insert");
    private JButton jbtReset = new JButton("Reset");

    public PartB() {
        Border blackline = BorderFactory.createTitledBorder("Staff Information");
        JPanel jpCenter = new JPanel(new GridLayout(9, 2));
        jpCenter.add(new JLabel("ID"));
        jpCenter.add(jtfID);
        jpCenter.add(new JLabel("Last Name"));
        jpCenter.add(jtfLastName);
        jpCenter.add(new JLabel("First Name"));
        jpCenter.add(jtfFirstName);
        jpCenter.add(new JLabel("Mi"));
        jpCenter.add(jtfMi);
        jpCenter.add(new JLabel("Address"));
        jpCenter.add(jtfAddress);
        jpCenter.add(new JLabel("City"));
        jpCenter.add(jtfCity);
        jpCenter.add(new JLabel("State"));
        jpCenter.add(jtfState);
        jpCenter.add(new JLabel("Telephone"));
        jpCenter.add(jtfTelephone);
        jpCenter.add(new JLabel("Email"));
        jpCenter.add(jtfEmail);
        add(jpCenter, BorderLayout.CENTER);
        jpCenter.setBorder(blackline);

        JPanel jpSouth = new JPanel();
        jpSouth.add(jbtView);
        jpSouth.add(jbtInsert);
        jpSouth.add(jbtReset);
        add(jpSouth, BorderLayout.SOUTH);

        jbtView.addActionListener(new ViewListener());
        jbtInsert.addActionListener(new InsertListener());
        jbtReset.addActionListener(new ResetListener());
        createConnection();

        setTitle("Register Staff");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public ResultSet selectRecord(String code) {
        String queryStr = "SELECT * FROM " + tableName + " WHERE ID = ?";
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

    private class ViewListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String code = jtfID.getText();
                ResultSet rs = selectRecord(code);
                if (rs.next()) {
                    jtfLastName.setText(rs.getString("LastName"));
                    jtfFirstName.setText(rs.getString("FirstName"));
                    jtfMi.setText(rs.getString("Mi"));
                    jtfAddress.setText(rs.getString("Address"));
                    jtfCity.setText(rs.getString("City"));
                    jtfState.setText(rs.getString("State"));
                    jtfTelephone.setText(rs.getString("Telephone"));
                    jtfEmail.setText(rs.getString("Email"));
                } else {
                    JOptionPane.showMessageDialog(null, "No such ID.", "RECORD NOT FOUND", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private class InsertListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String queryStr = "INSERT INTO  " + tableName + " VALUES(?,?,?,?,?,?,?,?,?)";
            try {
                stmt = conn.prepareStatement(queryStr);
                stmt.setString(1, jtfID.getText());
                stmt.setString(2, jtfLastName.getText());
                stmt.setString(3, jtfFirstName.getText());
                stmt.setString(4, jtfMi.getText());
                stmt.setString(5, jtfAddress.getText());
                stmt.setString(6, jtfCity.getText());
                stmt.setString(7, jtfState.getText());
                stmt.setString(8, jtfTelephone.getText());
                stmt.setString(9, jtfEmail.getText());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "New Staff added.", "Message", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class ResetListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jtfID.setText("");
            jtfLastName.setText("");
            jtfFirstName.setText("");
            jtfMi.setText("");
            jtfAddress.setText("");
            jtfCity.setText("");
            jtfState.setText("");
            jtfTelephone.setText("");
            jtfEmail.setText("");
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
        PartB frm = new PartB();
    }
}
