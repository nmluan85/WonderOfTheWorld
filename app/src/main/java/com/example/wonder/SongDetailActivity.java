package com.example.wonder;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.wonder.content.SongUtils;

import java.util.ArrayList;


public class SongDetailActivity extends AppCompatActivity implements RatingFragment.OnFragmentInteractionListener, CommentFragment.CommentFragmentListener{

    private Button mButtonRating;
    private Button mButtonComment;
    private boolean isFragmentDisplay = false;
    static final String STATE_FRAGMENT = "state_of_fragment";
    public int mRadioButtonChoice = 2;
    public float mRating = 0;
    public String contentComment = "";

    public interface SongDetailAcitivityListener {
        void onSongSelected(int mRadioButtonChoice, float mRating, String contentComment);
    }
    public void onSongSelected(int mRadioButtonChoice, float mRating, String contentComment) {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_detail);
        mButtonRating = findViewById(R.id.button_rating);
        mButtonComment = findViewById(R.id.button_comment);

        if (savedInstanceState != null){
            isFragmentDisplay = savedInstanceState.getBoolean(STATE_FRAGMENT);
            if (isFragmentDisplay){
                mButtonRating.setText(R.string.close);
            }
        }
        if (savedInstanceState == null) {
            int selectedSong =
                    getIntent().getIntExtra(SongUtils.SONG_ID_KEY, 0);
            SongDetailFragment fragment =
                    SongDetailFragment.newInstance(selectedSong);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.song_detail_container, fragment)
                    .commit();
            mButtonRating.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    if (!isFragmentDisplay){
                        displayFragment();
                    }
                    else closeFragment();
                }
            });
            mButtonComment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    CommentFragment commentFragment = new CommentFragment();

                    Bundle args = new Bundle();
                    args.putString("comment", contentComment);

                    commentFragment.setArguments(args);

                    commentFragment.show(fragmentManager, "comment_dialog");
                }
            });
        }
    }

    private void closeFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        RatingFragment ratingFragment = (RatingFragment) fragmentManager.findFragmentById(R.id.rating_container);
        if (ratingFragment != null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(ratingFragment).commit();
        }
        mButtonRating.setText("Rating");
        isFragmentDisplay = false;
    }

    private void displayFragment() {
        RatingFragment ratingFragment = RatingFragment.newInstance(mRadioButtonChoice, mRating);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.rating_container, ratingFragment).addToBackStack(null).commit();
        mButtonRating.setText(R.string.close);
        isFragmentDisplay = true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onRadioButtonChoice(int choice, float rating) {
        mRadioButtonChoice = choice;
        mRating = rating;
       /* Toast.makeText(this, "Choice is " + Integer.toString(choice), Toast.LENGTH_SHORT).show();*//**/
    }
    public void onSaveInstanceState(Bundle saveInstanceState){
        saveInstanceState.putBoolean(STATE_FRAGMENT, isFragmentDisplay);
        super.onSaveInstanceState(saveInstanceState);
    }

    @Override
    public void onCommentSubmited(String comment) {
        contentComment = comment;
    /*    Toast.makeText(this, "Comment received: " + comment, Toast.LENGTH_SHORT).show();*/
    }
}