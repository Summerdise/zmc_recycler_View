package com.example.zmc_recycler_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_entry)
    TextView recyclerViewEntry;

    @BindView(R.id.header_recycler_entry)
    TextView headerRecyclerViewEntry;

    @BindView(R.id.image_recycler_entry)
    TextView imageRecyclerViewEntry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        recyclerViewEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RecyclerActivity.class);
                startActivity(intent);
            }
        });

        headerRecyclerViewEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HeaderRecyclerActivity.class);
                startActivity(intent);
            }
        });

        imageRecyclerViewEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ImageRecyclerActivity.class);
                startActivity(intent);
            }
        });
    }

}