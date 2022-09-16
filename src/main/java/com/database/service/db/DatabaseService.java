package com.database.service.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {
    public static final String URL = "jdbc:mysql://127.0.0.1:3307/movies";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";
    private Connection databaseConnection;

    public DatabaseService() {
        this.databaseConnection = null;
    }

    public boolean connect() throws ClassNotFoundException, SQLException {
        // Load the jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create
        databaseConnection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        return databaseConnection != null;
    }

    public void printMessage() {
        if (databaseConnection != null) {
            System.out.println("Connected to the Database");
        } else {
            System.err.println("Not connected to the database");
        }
    }
}
