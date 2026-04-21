package domain;

import java.sql.*;

public class Count2 {
    private int count;
    private Statement stmt;

    public Count2() {
        initializeJdbc();
        count = getCount();
    }
  
    public int getCount() {
        try {
            ResultSet rs = stmt.executeQuery("SELECT countValue from VisitorCount");
            rs.next();
            count = rs.getInt(1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return count;
    }
    
    public void increaseCount() {
        count++;
        try {
            stmt.executeUpdate("UPDATE VisitorCount set countValue = " + count);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void initializeJdbc() {
        String host = "jdbc:derby://localhost:1527/collegedb";
        String user = "nbuser";
        String password = "nbuser";
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection(host, user, password);
            stmt = conn.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
