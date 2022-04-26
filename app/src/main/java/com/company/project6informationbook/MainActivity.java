package com.company.project6informationbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.company.project6informationbook.Adapter.Adapter1;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView ;

    ArrayList<Modal> arrayList ;

    Adapter1 adapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview_main);


        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        arrayList = new ArrayList<>();
        Modal modal1 = new Modal("mauryaji", "The Leaders");
        Modal modal2 = new Modal("tajamhal", "Seven Wonders");
        Modal modal3 = new Modal("history", "The Historic Places");
        Modal  modal4 = new Modal("countyry", "Countries");

        arrayList.add(modal1);
        arrayList.add(modal2);
        arrayList.add(modal3);
        arrayList.add(modal4);

        adapter1 = new Adapter1(arrayList,this);

        recyclerView.setAdapter(adapter1);
    }

}