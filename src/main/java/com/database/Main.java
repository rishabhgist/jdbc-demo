package com.database;

import com.database.model.Movie;
import com.database.service.db.DatabaseService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatabaseService db = new DatabaseService();
        MoiveRepo moiveRepo = new MoiveRepo();
        try {
            db.connect();
            List<Movie> movieList = moiveRepo.getAllMovies(db.getDatabaseConnection());
            movieList.forEach(System.out::println);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}