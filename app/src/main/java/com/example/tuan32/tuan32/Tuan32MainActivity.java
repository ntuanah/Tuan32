package com.example.tuan32.tuan32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.tuan32.R;

import java.util.ArrayList;

public class Tuan32MainActivity extends AppCompatActivity {
    ListView lv;
    T32Adapter adapter;
    ArrayList<T32Contact> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main);
        lv = findViewById(R.id.tuan32Lv);
        //tao nguon du lieu
        ls.add(new T32Contact("Nguyen Van A","18",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van B","19",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van C","20",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van D","21",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van E","22",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van F","23",R.drawable.ic_launcher_background));
        //tao adapter
        adapter = new T32Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}