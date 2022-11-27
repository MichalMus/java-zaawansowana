package BazyDanych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class zd3 {
    public static void main(String[] args) throws SQLException {
        final String DB_URL = "jdbc:mysql://localhost:3306/test";
        Properties props = new Properties();
        props.put("user", "root");
        props.put("password", "Adamancjusz2212");
        props.put("serverTimezone", "CET");
        props.put("useSSL", "false");

        Connection conect = null;
        Statement stmt = null;

        conect = DriverManager.getConnection(DB_URL,props);
        stmt = conect.createStatement();
        int row = stmt.executeUpdate("DELETE FROM user WHERE id = 1");
        System.out.println("Changes delete: " + row);

        conect.close();
        stmt.close();

    }
}
