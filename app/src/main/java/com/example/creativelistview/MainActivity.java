package com.example.creativelistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.creativelistview.adapter.RecycleViewAdapter;
import com.example.creativelistview.data.SimpleData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecycleViewAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        List<SimpleData> dataList = new ArrayList<>();
        List<String> thumbnails = new ArrayList<>();
        List<String> thumbnails2 = new ArrayList<>();
        List<String> thumbnails3 = new ArrayList<>();
        thumbnails.add("https://images-prod.healthline.com/hlcmsresource/images/AN_images/what-is-kosher-732x549-thumbnail.jpg");
        thumbnails.add("https://ejlefavour.files.wordpress.com/2018/07/healthy-meal.jpg?w=640");
        thumbnails.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOJAWJo78XEqGjKaehB6UpGzUjPdHCIQd960puYP5xm5E0YZxw&s");
        dataList.add(new SimpleData("Mary's birthday", "5 dishes", "21 items", thumbnails));

        thumbnails2.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn2IXUS0CLGHMS66QGWIt3peVKEJe0ZvWKlVnugnaZvfVpYYKX&s");
        thumbnails2.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEEPr1usgugA5IhoceBuzrq1jdlcIkSBWTpGV0Yg1JCQJdhQjH&s");
        thumbnails2.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRx57ioNpwdZ3eO0cX5qy19UlVgvs1V3-ehS5F1iYmMTAkoJvwsYw&s");
        dataList.add(new SimpleData("Sunday Party", "3 dishes", "18 items", thumbnails2));

        thumbnails3.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSA0d1dyfnf29XmrvaYrD9ZjEvXTFiO-0VeypcyrV6g0v7kkllG&s");
        thumbnails3.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfrc8cxZZOL0X7AlDgPnqfkwCKxw59JPt74X__VVka7_x9IdQa&s");
        dataList.add(new SimpleData("Movie night", "2 dishes", "9 items", thumbnails3));

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecycleViewAdapter(dataList, this);
        recyclerView.setAdapter(adapter);
    }
}
