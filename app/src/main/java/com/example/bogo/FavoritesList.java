package com.example.bogo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class FavoritesList extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_favorites_list, container, false);

        LinearLayout llFavorites = view.findViewById(R.id.llLayoutFavorite);

        for(int i = 0; i < 3; i++)
        {
            View child = getLayoutInflater().inflate(R.layout.layout_favorites_list, null);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(0, 0, 0, 10);
            child.setLayoutParams(params);
            llFavorites.addView(child);
        }

        return view;
    }
}