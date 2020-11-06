package android.example.displayjokes;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DisplayJokesFragment extends Fragment {
    public DisplayJokesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.display_jokes_fragment, container, false);
        Intent intent = getActivity().getIntent();
        String jokeFromIntent = intent.getStringExtra("joke_key_1");
        TextView textView = rootView.findViewById(R.id.tv_display_joke);
        textView.setText(jokeFromIntent);
        return rootView;
    }

}
