package com.example.zmc_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ImageRecyclerActivity extends AppCompatActivity {

    private List<Data> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_recycler);
        initFruits(100);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        DataAdapter adapter = new DataAdapter(this,dataList);
        recyclerView.setAdapter(adapter);
    }
    private void initFruits(int size) {
        dataList.add(new Data(1, "This is header", null, 0,null));
        for (int i = 0; i < size; i++) {
            int number = i + 1;
            dataList.add(new Data(2, String.format("title%d", number), String.format("desp%d", number),
                    number,String.format("https://loremflickr.com/180/180?lock=%d",number)));
        }
    }
}