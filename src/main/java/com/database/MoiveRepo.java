package com.database;

import com.database.model.Movie;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MoiveRepo {
    public List<Movie> getAllMovies(Connection connection) throws SQLException {

        List<Movie> movieList = new ArrayList<>();

        // 1. create a SQL query to retrieve all the rows from the car table
        String selectAllCarsQuery = "SELECT * FROM `movies`.`movie`;";

        // 2. use the connection object to execute the query
        try (Statement readMovieStatement = connection.createStatement()) {
            ResultSet resultSet = readMovieStatement.executeQuery(selectAllCarsQuery);

            // 3. iterate over the result set and create a car object for each row
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                int budgetInMillion = resultSet.getInt("budgetInMillion");
                String releaseDate = resultSet.getString("releaseDate");
                int revenueInMillion = resultSet.getInt("revenueInMillion");
                double rating = resultSet.getDouble("ratingAverage");
                Movie movie = new Movie(title, budgetInMillion, releaseDate, revenueInMillion, rating);
                movieList.add(movie);
            }
        }

        // 3. return the list of cars
        return movieList;
    }

}
