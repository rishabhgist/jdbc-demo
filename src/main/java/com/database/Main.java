package com.database;

import com.database.service.db.DatabaseService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DatabaseService db = new DatabaseService();
        try {
            db.connect();
            db.printMessage();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}