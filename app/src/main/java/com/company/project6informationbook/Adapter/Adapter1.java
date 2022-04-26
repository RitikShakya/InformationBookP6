package com.company.project6informationbook.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.company.project6informationbook.Activities.Countries;
import com.company.project6informationbook.Activities.HistoricPlaces;
import com.company.project6informationbook.Activities.Leaders;
import com.company.project6informationbook.Activities.Wonders;
import com.company.project6informationbook.Modal;
import com.company.project6informationbook.R;

import java.util.ArrayList;


public class Adapter1 extends RecyclerView.Adapter<Adapter1.CardViewHolder> {
    private ArrayList<Modal> arrayList;
    private Context context;

    public Adapter1(ArrayList<Modal> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview,parent,false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        Modal modal = arrayList.get(position);

        holder.imagename.setText(modal.getImageName());
        holder.imagecategory.setText(modal.getCategoryName());
        holder.imageView.setImageResource(context.getResources().getIdentifier(modal.getImageName(),"drawable",context.getPackageName()));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(holder.getAdapterPosition() ==0 ){
                    Intent intent = new Intent(context, Leaders.class);

                    context.startActivity(intent);
                    //leaders
                }if(holder.getAdapterPosition()==1){
                    //wonders
                    Intent intent = new Intent(context, Wonders.class);

                    context.startActivity(intent);
                }if(holder.getAdapterPosition()==2){
                    //historic
                    Intent intent = new Intent(context, HistoricPlaces.class);

                    context.startActivity(intent);
                }if(holder.getAdapterPosition()==3){
                    //countries
                    Intent intent = new Intent(context, Countries.class);

                    context.startActivity(intent);
                }
            }
        });
   }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView imagename, imagecategory;

        CardView cardView;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.carview_main);

            imageView = itemView.findViewById(R.id.imageView);

            imagename = itemView.findViewById(R.id.imagenameview);
            imagecategory= itemView.findViewById(R.id.imagecatview);
        }



    }
}
