package com.example.wonderoftheworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.wonderoftheworld.GalleryFragment;
import com.example.wonderoftheworld.R;

public class GalleryViewModel extends AppCompatActivity implements GalleryFragment.OnFragmentInteractionListener{
    private Button mButton;
    private boolean isFragmentDisplay = false;

    static final String STATE_FRAGMENT = "state_of_fragment";
    private int mRadioButtonChoice = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        mButton = findViewById(R.id.open_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (!isFragmentDisplay){
                    displayFragment();
                }
                else closeFragment();
            }
        });
        if (savedInstanceState != null){
            isFragmentDisplay = savedInstanceState.getBoolean(STATE_FRAGMENT);
            if (isFragmentDisplay){
                mButton.setText(R.string.close);
            }
        }
    }
    public void displayFragment(){
        GalleryFragment blankFragment = GalleryFragment.newInstance(mRadioButtonChoice);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, blankFragment).addToBackStack(null).commit();
        mButton.setText(R.string.close);
        isFragmentDisplay = true;
    }
    public void closeFragment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        GalleryFragment blankFragment = (GalleryFragment) fragmentManager.findFragmentById(R.id.fragment_container);
        if (blankFragment != null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(blankFragment).commit();
        }
        mButton.setText(R.string.open);
        isFragmentDisplay = false;
    }
    public void onSaveInstanceState(Bundle saveInstanceState){
        saveInstanceState.putBoolean(STATE_FRAGMENT, isFragmentDisplay);
        super.onSaveInstanceState(saveInstanceState);
    }

    @Override
    public void onRadioButtonChoice(int choice) {
        mRadioButtonChoice = choice;
        Toast.makeText(this, "Choice is " + Integer.toString(choice), Toast.LENGTH_SHORT).show();
    }
}