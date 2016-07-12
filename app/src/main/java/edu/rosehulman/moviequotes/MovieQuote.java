package edu.rosehulman.moviequotes;

/**
 * Created by Matt Boutell on 12/15/2015, based on earlier work by Dave Fisher.
 */
public class MovieQuote {
    private String quote;
    private String movie;


    private String key;

    public MovieQuote(String quote, String movie) {
        this.movie = movie;
        this.quote = quote;
    }

    public MovieQuote() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
}
