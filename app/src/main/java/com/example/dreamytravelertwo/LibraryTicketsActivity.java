package com.example.dreamytravelertwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class LibraryTicketsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LibraryRecyclerViewFavoriteAdapter adapter;
    private ArrayList<String> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_tickets);

        recyclerView = findViewById(R.id.library_recycler_view_tickets);

        itemList = new ArrayList<>();
        itemList.add("Элемент 1");
        itemList.add("Элемент 2");
        itemList.add("Элемент 3");

        adapter = new LibraryRecyclerViewTicketsAdapter(itemList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
    }
}