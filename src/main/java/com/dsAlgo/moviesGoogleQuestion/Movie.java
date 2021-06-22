package com.dsAlgo.moviesGoogleQuestion;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    List<Movie> relatedMovies;
    String movieName;
    boolean visited;


    public Movie(String movieName){
        this.movieName = movieName;
        this.relatedMovies = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Movie{" +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}
