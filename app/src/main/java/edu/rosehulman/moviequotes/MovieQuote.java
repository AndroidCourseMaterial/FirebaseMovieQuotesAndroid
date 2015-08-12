package edu.rosehulman.moviequotes;

/**
 * The model for a moviequote
 * <p/>
 * Created by rockwotj on 4/22/2015.
 */
public class MovieQuote {

    private String mMovie;
    private String mQuote;

    public MovieQuote(String movie, String quote) {
        this.mMovie = movie;
        this.mQuote = quote;
    }

    public String getMovie() {
        return mMovie;
    }

    public void setMovie(String movie) {
        this.mMovie = movie;
    }

    public String getQuote() {
        return mQuote;
    }

    public void setQuote(String quote) {
        this.mQuote = quote;
    }
}