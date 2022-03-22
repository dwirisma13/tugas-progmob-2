package com.risma.provinsiindonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvProvinsi;
    private ArrayList<Provinsi> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProvinsi = findViewById(R.id.rv_provinsi);
        rvProvinsi.setHasFixedSize(true);

        list.addAll(ProvinsiData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvProvinsi.setLayoutManager(new LinearLayoutManager(this));
        ListProvinsiAdapter listProvinsiAdapter = new ListProvinsiAdapter(list);
        rvProvinsi.setAdapter(listProvinsiAdapter);
    }
}