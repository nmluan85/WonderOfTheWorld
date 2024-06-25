package com.example.wonder;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class CommentFragment extends DialogFragment {
    public interface CommentFragmentListener{
        void onCommentSubmited(String comment);
    }
    private CommentFragmentListener mlistener;
    private String commentContent;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            mlistener = (CommentFragmentListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement CommentDialogListener");
        }
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comment, container, false);

        EditText commentEditText = view.findViewById(R.id.commentEditText);
        Button submitCommentButton = view.findViewById(R.id.submitCommentButton);

        if (getArguments().containsKey("comment")){
            commentContent = getArguments().getString("comment");
            if (commentContent != null){
                commentEditText.setText(commentContent);
            }
        }

        submitCommentButton.setOnClickListener(v -> {
            String comment = commentEditText.getText().toString();
            if (!comment.isEmpty()) {
                // Handle the comment submission
                Toast.makeText(getActivity(), "Comment submitted: " + comment, Toast.LENGTH_SHORT).show();
                mlistener.onCommentSubmited(comment);
                commentContent = comment;
                dismiss(); // Close the dialog
            } else {
                Toast.makeText(getActivity(), "Please enter a comment", Toast.LENGTH_SHORT).show();
                mlistener.onCommentSubmited(comment);
                commentContent = comment;
            }
        });
        return view;
    }
}
