package com.example.dreamytravelertwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class LibraryVisitedActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LibraryRecyclerViewFavoriteAdapter adapter;
    private ArrayList<String> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_visited);

        recyclerView = findViewById(R.id.library_recycler_view_visited);

        itemList = new ArrayList<>();
        itemList.add("Элемент 1");
        itemList.add("Элемент 2");
        itemList.add("Элемент 3");

        adapter = new LibraryRecyclerViewVisitedAdapter();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
    }
}