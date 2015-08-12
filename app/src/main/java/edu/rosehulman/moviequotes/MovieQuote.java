package edu.rosehulman.moviequotes;

/**
 * The model for a moviequote
 * <p/>
 * Created by rockwotj on 4/22/2015.
 */
public class MovieQuote {

    private String mMovie;
    private String mQuote;
    private String mKey;

    public MovieQuote(String key, String movie, String quote) {
        mKey = key;
        mMovie = movie;
        mQuote = quote;
    }

    public String getKey() {
        return mKey;
    }

    public String getMovie() {
        return mMovie;
    }

    public void setMovie(String movie) {
        mMovie = movie;
    }

    public String getQuote() {
        return mQuote;
    }

    public void setQuote(String quote) {
        mQuote = quote;
    }
}