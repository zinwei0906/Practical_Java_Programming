package practical10;

/**
 *
 * @author Wei
 */
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class StudentTableModel extends AbstractTableModel {

    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    private ResultSetMetaData rsmd;

    public StudentTableModel(String host, String user, String password, String sqlquery) throws SQLException {

        conn = DriverManager.getConnection(host, user, password);
        stmt = conn.prepareStatement(sqlquery, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rs = stmt.executeQuery();
        rsmd = rs.getMetaData();
    }

    @Override
    public String getColumnName(int column) {
        try {
            return rsmd.getColumnName(column + 1);
        } catch (SQLException ex) {
            Logger.getLogger(StudentTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public int getRowCount() {
        try {
            rs.last();
            return rs.getRow();
        } catch (SQLException ex) {
            Logger.getLogger(StudentTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        try {
            return rsmd.getColumnCount();
        } catch (SQLException ex) {
            Logger.getLogger(StudentTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        try {
            rs.absolute(rowIndex + 1);
            return rs.getObject(columnIndex + 1);
        } catch (SQLException ex) {
            Logger.getLogger(StudentTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public void DisconnectDatabase() throws SQLException {
        rs.close();
        stmt.close();
        conn.close();
    }

}
