package BazyDanych;

import java.sql.*;
import java.util.Properties;

public class zd4 {
    public static void main(String[] args) throws SQLException {
        final String DB_URL = "jdbc:mysql://localhost:3306/test";
        Properties props = new Properties();
        props.put("user", "root");
        props.put("password", "Adamancjusz2212");
        props.put("serverTimezone", "CET");
        props.put("useSSL", "false");

        Connection connect = null;
        Statement stmt = null;

        connect = DriverManager.getConnection(DB_URL,props);
        stmt = connect.createStatement();
        stmt.executeQuery("select * FROM user WHERE language ='Pl'");
        final ResultSet result = stmt.getResultSet();
        while (result.next()){
            System.out.print(result.getInt("id"));
            System.out.print(" ");
            System.out.print(result.getString("name"));
            System.out.print(" ");
            System.out.print(result.getString("password"));
            System.out.println(" ");
            System.out.println();


        }

        stmt.close();
        connect.close();

    }
}
