package com.dsAlgo.moviesGoogleQuestion;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MovieClient {
    public static void main(String[] args) {

        Movie m1 = new Movie("m1");
        Movie m2 = new Movie("m2");
        Movie m3 = new Movie("m3");
        Movie m4 = new Movie("m4");
        Movie m5 = new Movie("m5");
        Movie m6 = new Movie("m6");
        Movie m7 = new Movie("m7");
        Movie m8 = new Movie("m8");
        Movie m9 = new Movie("m9");
        Movie m10 = new Movie("m10");


        m1.relatedMovies.add(m2);
        m1.relatedMovies.add(m3);
        m1.relatedMovies.add(m4);
        m1.relatedMovies.add(m5);

        m2.relatedMovies.add(m6);
        m2.relatedMovies.add(m7);

        m4.relatedMovies.add(m8);
        m4.relatedMovies.add(m9);
        m4.relatedMovies.add(m10);

        List<Movie> result = findListofRelatedMovies(m1);

        System.out.println(result);


    }

    private static List<Movie> findListofRelatedMovies(Movie m1) {

        Deque<Movie> queue = new LinkedList<>();
        for(Movie entry:m1.relatedMovies){
            queue.addLast(entry);
        }

        m1.visited = true;
        List<Movie> result = new ArrayList<>();
        while(!queue.isEmpty()){
            Movie m = queue.removeFirst();
            result.add(m);
            while(true) {
                Movie adjMovie = getAdjacentUnvisitedMovies(m);
                if (adjMovie == null) {
                    break;
                }else{
                    adjMovie.visited = true;
                    queue.addLast(adjMovie);
                }

            }
        }
        return result;
    }

    private static Movie getAdjacentUnvisitedMovies(Movie m) {
        List<Movie> relatedMovies = m.relatedMovies;
        for(Movie entry:relatedMovies){
            if (entry.visited == false) {
                return entry;
            }
        }
        return null;
    }
}


