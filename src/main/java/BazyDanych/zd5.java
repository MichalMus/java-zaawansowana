package BazyDanych;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

import static java.lang.System.in;

public class zd5 {
    public static void main(String[] args) throws SQLException {
        final String DB_URL = "jdbc:mysql://localhost:3306/test";
        Properties props = new Properties();
        props.put("user", "root");
        props.put("password", "Adamancjusz2212");
        props.put("serverTimezone", "CET");
        props.put("useSSL", "false");

        Connection connection = DriverManager.getConnection(DB_URL, props);
        System.out.println("Podaj język: ");
        Scanner scanner = new Scanner(System.in);
        String language = scanner.nextLine();
        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();
        PreparedStatement ps = connection.prepareStatement
                ("SELECT * FROM user WHERE language = ? OR name = ?");
        ps.setString(1, language);
        ps.setString(2, "Jan");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("name"));
        }

        connection.close();
        rs.close();


    }
}
