package models;

import java.util.ArrayList;

public class Store {

    ArrayList<Movie> movies;
    
    public Store() {
        this.movies = new ArrayList<Movie>();
    }
    public Movie getMovies(int index) {
        return new Movie(this.movies.get(index));
    }
    public Movie getMovies(String name) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getName().equals(name)){
                return new Movie(this.movies.get(i));
            }
        }
        return null;
    }
    public void setMovies(int index, Movie movie) {
        movies.set(index, new Movie(movie));
    }
    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }
    public void action(String name, String action) {
        if (this.movies.isEmpty()) {
            throw new IllegalStateException("there are no movies!");
        }
        if (!(action.equals("sell") || action.equals("rent") || action.equals("return"))) {
            throw new IllegalArgumentException("action must be sell, rent, or return.");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or blank.");
        }
        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getName().equals(name)){
                switch (action) {
                    case "sell": 
                    if (!(movies.get(i).isAvailable())) {
                        throw new IllegalStateException("cannot sell movie that was rented out");
                    }
                    this.movies.remove(i); break;
                    case "rent": this.movies.get(i).setAvailable(false); break;
                    case "return": this.movies.get(i).setAvailable(true); break;
                }
            }
        }
    }
    public String toString() {
        String temp = "";
        for (int i = 0; i < movies.size(); i++) {
            temp += movies.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }
}
