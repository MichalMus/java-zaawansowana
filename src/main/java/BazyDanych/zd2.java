package BazyDanych;

import java.sql.*;
import java.util.Properties;

public class zd2 {
    public static void main(String[] args) {

        final String DB_URL = "jdbc:mysql://localhost:3306/test";
        Properties propert = new Properties();
        propert.put("user", "root");
        propert.put("password", "Adamancjusz2212");
        propert.put("serverTimezone", "CET");
        propert.put("useSSL", "false");

        Connection connect = null;
        Statement stmt = null;



        try {
            connect = DriverManager.getConnection(DB_URL, propert);
            stmt = connect.createStatement();
            int row = stmt.executeUpdate("UPDATE User SET password = 'ZolaSzulowski' WHERE id = 2");
            System.out.println("Rows changes: " + row);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connect.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }



    }
}