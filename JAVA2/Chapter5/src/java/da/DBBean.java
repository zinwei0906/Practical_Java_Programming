package da;

import java.sql.*;
import java.util.ArrayList;

public class DBBean {
    private Connection connection = null;
    private String username;
    private String password;
    private String driver;
    private String databaseName;

    public void initializeJdbc() {
        String host = "jdbc:derby://localhost:1527/" + databaseName;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection(host, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String[] getTables() {
        String[] tables = null;

        try {
            DatabaseMetaData dbMetaData = connection.getMetaData();
            ResultSet rsTables = dbMetaData.getTables(null, null, null, new String[]{"TABLE"});

            int size = 0;
            while (rsTables.next()) {
                size++;
            }

            rsTables = dbMetaData.getTables(null, null, null, new String[]{"TABLE"});
            tables = new String[size];
            int i = 0;
            while (rsTables.next()) {
                tables[i++] = rsTables.getString("TABLE_NAME");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return tables;
    }

    public ArrayList<String> getColumnNames(String tableName) {
        ArrayList<String> columnNames = new ArrayList<String>();

        try {
            DatabaseMetaData dbMetaData = connection.getMetaData();
            ResultSet rsColumns = dbMetaData.getColumns(null, null, tableName, null);

            while (rsColumns.next()) {
                columnNames.add(rsColumns.getString("COLUMN_NAME"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return columnNames;
    }

    public ArrayList getRows(String tableName) {
        Statement stmt;
        ArrayList<Object[]> rowData = new ArrayList<Object[]>();
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from " + tableName);

            int columnCount = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] tableRow = new Object[columnCount];
                int index = 0;
                for (int i = 0; i < columnCount; i++) {
                    tableRow[index++] = rs.getObject(i + 1);
                }
                rowData.add(tableRow);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rowData;
    }

    public Connection getConnection() {
        return connection;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
}
