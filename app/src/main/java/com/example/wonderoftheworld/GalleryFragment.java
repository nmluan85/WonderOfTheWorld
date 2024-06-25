package com.example.wonderoftheworld;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.wonderoftheworld.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {
    private static  final int YES = 0;
    private static final int NO = 1;
    private static final int NONE = 2;
    public int mRadioButtonChoice = NONE;
    private static final String CHOICE = "choice";
    interface OnFragmentInteractionListener {
        void onRadioButtonChoice(int choice);
    }
    OnFragmentInteractionListener mListener;
    private FragmentGalleryBinding binding;
    public static GalleryFragment newInstance(int choice) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle args = new Bundle();
        args.putInt(CHOICE, choice);
        fragment.setArguments(args);
        return fragment;
    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        /*GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);*/

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View rootView = binding.getRoot();

        /*final View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);*/
        final RadioGroup radioGroup = rootView.findViewById(R.id.radio_group);
        final RatingBar ratingBar = rootView.findViewById(R.id.ratingBar);
        if (getArguments().containsKey(CHOICE)){
            mRadioButtonChoice = getArguments().getInt(CHOICE);
                if (mRadioButtonChoice != NONE){
                    radioGroup.check(radioGroup.getChildAt(mRadioButtonChoice).getId());
                }
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                View radioButton = radioGroup.findViewById(checkedId);
                int index = radioGroup.indexOfChild(radioButton);
                TextView textView = rootView.findViewById(R.id.fragment_header);
                switch (index) {
                    case YES:
                        textView.setText(R.string.yes_message);
                        mRadioButtonChoice = YES;
                        mListener.onRadioButtonChoice(YES);
                        break;
                    case NO:
                        textView.setText(R.string.no_message);
                        mRadioButtonChoice = NO;
                        mListener.onRadioButtonChoice(NO);
                        break;
                    default:
                        mRadioButtonChoice = NONE;
                        mListener.onRadioButtonChoice(NONE);
                        break;
                }
            }
        });
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                String myRating = (getString(R.string.my_rating) + String.valueOf(ratingBar.getRating()));
                Toast.makeText(getContext(), myRating, Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener){
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new ClassCastException(context.toString() + getResources().getString(R.string.exception_message));
        }
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}