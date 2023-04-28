package EducationApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    private String url = "jdbc:mysql://localhost:3306/edu_pract";
    private String username = "root";
    private String password = "Galatasaray1905";

    public Connection connect() throws SQLException{
        return DriverManager.getConnection(url,username,password);
    }
}
