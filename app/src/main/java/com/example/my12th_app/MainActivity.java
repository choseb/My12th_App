package com.example.my12th_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        PersonAdapter adapter = new PersonAdapter();

        adapter.addItem(new Person("1한결", "010-1111-1111"));
        adapter.addItem(new Person("2한결", "010-2222-2222"));
        adapter.addItem(new Person("3한결", "010-3333-3333"));

        recyclerView.setAdapter(adapter);
    }
}