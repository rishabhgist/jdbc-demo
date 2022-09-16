package com.database.model;

import java.util.Objects;

public class Movie {
    private String movieTitle;
    private int budgetInMillion;
    private String releaseDate;
    private int revenue;
    private double rating;

    public Movie() {
    }

    public Movie(String movieTitle, int budgetInMillion, String releaseDate, int revenue, double rating) {
        this.movieTitle = movieTitle;
        this.budgetInMillion = budgetInMillion;
        this.releaseDate = releaseDate;
        this.revenue = revenue;
        this.rating = rating;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getBudgetInMillion() {
        return budgetInMillion;
    }

    public void setBudgetInMillion(int budgetInMillion) {
        this.budgetInMillion = budgetInMillion;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return budgetInMillion == movie.budgetInMillion && revenue == movie.revenue && Double.compare(movie.rating, rating) == 0 && Objects.equals(movieTitle, movie.movieTitle) && Objects.equals(releaseDate, movie.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieTitle, budgetInMillion, releaseDate, revenue, rating);
    }

    @Override
    public String toString() {
        return "Movie{" + "movieTitle='" + movieTitle + '\'' + ", budgetInMillion=" + budgetInMillion + ", releaseDate='" + releaseDate + '\'' + ", revenue=" + revenue + ", rating=" + rating + '}';
    }
}
