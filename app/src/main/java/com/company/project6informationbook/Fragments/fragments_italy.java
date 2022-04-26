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

public class fragments_italy extends Fragment {
    public static  fragments_italy newInstance(){

        return new fragments_italy();
    }
    ImageView imageItaly;
    ProgressBar progressBarItaly;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragments_italy,container,false);

        imageItaly = view.findViewById(R.id.imageViewItaly);
        progressBarItaly = view.findViewById(R.id.progressBarItaly);

        Picasso.get().load("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAALYAAAB5CAMAAACjkCtXAAAAFVBMVEX///8AkkbOKzd1tYrdfoPMGSkAjTqwbha+AAAAeElEQVR4nO3OOQEAIAwEsOP1L7kOGMqaKEhG3135sM/si7a2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tra2tvZTAaLOXCyoPt13AAAAAElFTkSuQmCC").into(imageItaly, new Callback() {
            @Override
            public void onSuccess() {

                progressBarItaly.setVisibility(View.VISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                progressBarItaly.setVisibility(View.VISIBLE);

            }


        });
        return view;

    }
}
