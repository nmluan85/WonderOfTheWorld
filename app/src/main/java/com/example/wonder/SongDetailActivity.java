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


public class SongDetailActivity extends AppCompatActivity implements RatingFragment.OnFragmentInteractionListener{

    private Button mButton;
    private boolean isFragmentDisplay = false;
    static final String STATE_FRAGMENT = "state_of_fragment";
    private int mRadioButtonChoice = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_detail);
        mButton = findViewById(R.id.button_rating);

        if (savedInstanceState != null){
            isFragmentDisplay = savedInstanceState.getBoolean(STATE_FRAGMENT);
            if (isFragmentDisplay){
                mButton.setText(R.string.close);
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
            mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    if (!isFragmentDisplay){
                        displayFragment();
                    }
                    else closeFragment();
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
        mButton.setText("Review");
        isFragmentDisplay = false;
    }

    private void displayFragment() {
        RatingFragment ratingFragment = RatingFragment.newInstance(mRadioButtonChoice);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.rating_container, ratingFragment).addToBackStack(null).commit();
        mButton.setText(R.string.close);
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
    public void onRadioButtonChoice(int choice) {
        mRadioButtonChoice = choice;
        Toast.makeText(this, "Choice is " + Integer.toString(choice), Toast.LENGTH_SHORT).show();
    }
    public void onSaveInstanceState(Bundle saveInstanceState){
        saveInstanceState.putBoolean(STATE_FRAGMENT, isFragmentDisplay);
        super.onSaveInstanceState(saveInstanceState);
    }
}