package edu.rosehulman.moviequotes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;
import java.util.List;

public class MovieQuoteArrayAdapter extends BaseAdapter implements ChildEventListener {
    private final LayoutInflater mInflater;
    private List<MovieQuote> mMovieQuotes;
    private Firebase mFirebaseQuotesReference;
    public MovieQuoteArrayAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
        mMovieQuotes = new ArrayList<MovieQuote>();
        Firebase.setAndroidContext(context);
        mFirebaseQuotesReference = new Firebase("https://boutell-movie-quotes.firebaseio.com/quotes");
        mFirebaseQuotesReference.addChildEventListener(this);
    }

    @Override
    public int getCount() {
        return mMovieQuotes.size();
    }

    public void removeItem(MovieQuote movieQuote) {
        //TODO: Remove the next line(s) and use Firebase instead
        mMovieQuotes.remove(movieQuote);
    }

    public void addItem(MovieQuote movieQuote) {
        //TODO: Remove the next line(s) and use Firebase instead
        mMovieQuotes.add(movieQuote);
        notifyDataSetChanged();


    }

    public void updateItem(MovieQuote movieQuote, String newMovie, String newQuote) {
        //TODO: Remove the next line(s) and use Firebase instead
        movieQuote.setMovie(newMovie);
        movieQuote.setQuote(newQuote);
        notifyDataSetChanged();
    }

    @Override
    public MovieQuote getItem(int position) {
        return mMovieQuotes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = mInflater.inflate(android.R.layout.simple_expandable_list_item_2, parent, false);
        } else {
            view = convertView;
        }
        TextView titleTextView = (TextView) view.findViewById(android.R.id.text2);
        MovieQuote movieQuote = getItem(position);
        titleTextView.setText(movieQuote.getMovie());
        TextView quoteTextView = (TextView) view.findViewById(android.R.id.text1);
        quoteTextView.setText(movieQuote.getQuote());
        return view;
    }

    @Override
    public void onChildAdded(DataSnapshot dataSnapshot, String s) {

    }

    @Override
    public void onChildChanged(DataSnapshot dataSnapshot, String s) {

    }

    @Override
    public void onChildRemoved(DataSnapshot dataSnapshot) {

    }

    @Override
    public void onChildMoved(DataSnapshot dataSnapshot, String s) {

    }

    @Override
    public void onCancelled(FirebaseError firebaseError) {

    }
}