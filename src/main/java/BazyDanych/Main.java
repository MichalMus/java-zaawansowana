package BazyDanych;

import com.mysql.cj.xdevapi.Result;

import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        final String DB_URL = "jdbc:mysql://localhost:3306/test";
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "Adamancjusz2212");
        connectionProps.put("serverTimezone", "CET");
        connectionProps.put("useSSL", "false");

        Connection conn = null;
        Statement stmt = null;

        //STEP: Open a connection
        try {
            conn = DriverManager.getConnection(DB_URL, connectionProps);
            stmt = conn.createStatement();

            stmt.executeQuery("select version();");

            final ResultSet rs = stmt.getResultSet();
            rs.next();
            System.out.println(rs.getString(1));

            int row = stmt.executeUpdate("insert into user (name, password, language) " +
                    "values ('Jan', 'Jackowski', 'Usa')");
            System.out.println("Rows changes: " + row);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
