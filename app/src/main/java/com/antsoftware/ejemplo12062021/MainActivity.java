package com.antsoftware.ejemplo12062021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.antsoftware.ejemplo12062021.recycler.adapters.NameAdapter;
import com.antsoftware.ejemplo12062021.recycler.models.NameModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView myRecycler;
    private NameAdapter adapter;
    private ArrayList<NameModel> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecycler = (RecyclerView) findViewById(R.id.myRecycler);
        myRecycler.setHasFixedSize(true);
        myRecycler.setLayoutManager(new LinearLayoutManager(this));

        names.add(new NameModel("Juan", 12));
        names.add(new NameModel("Pancho", 13));
        names.add(new NameModel("Victoria", 16));

        adapter = new NameAdapter(names);
        myRecycler.setAdapter(adapter);
    }
}