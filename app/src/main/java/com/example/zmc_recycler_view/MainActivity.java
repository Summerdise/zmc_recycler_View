package com.example.zmc_recycler_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView recyclerViewEntry = findViewById(R.id.recycler_entry);
        recyclerViewEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RecyclerActivity.class);
                startActivity(intent);
            }
        });

        TextView headerRecyclerViewEntry = findViewById(R.id.header_recycler_entry);
        headerRecyclerViewEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HeaderRecyclerActivity.class);
                startActivity(intent);
            }
        });
    }

}