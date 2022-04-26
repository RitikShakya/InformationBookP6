package com.company.project6informationbook.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.company.project6informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class fragments_Russia extends Fragment {
    public static  fragments_Russia newInstance(){

        return new fragments_Russia();
    }
    ImageView imageRussia;
    ProgressBar progressBarRussia;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_russia,container,false);

        imageRussia = view.findViewById(R.id.imageViewRussia);
        progressBarRussia = view.findViewById(R.id.progressBarRussia);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/188px-Flag_of_Russia.svg.png").into(imageRussia, new Callback() {
            @Override
            public void onSuccess() {

                progressBarRussia.setVisibility(View.VISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                progressBarRussia.setVisibility(View.VISIBLE);

            }


        });
        return view;
    }

}
