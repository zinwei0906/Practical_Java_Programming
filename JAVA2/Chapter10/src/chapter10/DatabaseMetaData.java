package chapter10;

import java.sql.*;

public class DatabaseMetaData {

    public static void main(String[] args) throws SQLException {
        String host = "jdbc:derby://localhost:1527/collegedb";
        String user = "nbuser";
        String password = "nbuser";
        Connection conn = DriverManager.getConnection(host, user, password);

        System.out.println("database URL: " + conn.getMetaData().getURL());
        System.out.println("database username: " + conn.getMetaData().getUserName());
        System.out.println("database product name: " + conn.getMetaData().getDatabaseProductName());
        System.out.println("database product version: " + conn.getMetaData().getDatabaseProductVersion());
        System.out.println("JDBC driver name: " + conn.getMetaData().getDriverName());
        System.out.println("JDBC driver version: " + conn.getMetaData().getDriverVersion());
        System.out.println("JDBC driver major version: " + conn.getMetaData().getDriverMajorVersion());
        System.out.println("JDBC driver minor version: " + conn.getMetaData().getDriverMinorVersion());

        conn.close();

    }

}
