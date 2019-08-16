package com.phong.baitaprenluyentugiai3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.phong.com.phong.adapter.TyGiaHoiDoaiAdapter;
import com.phong.model.TyGiaHoiDoai;

public class MainActivity extends AppCompatActivity {

    ListView lvTyGiaHoiDoai;
    TyGiaHoiDoaiAdapter tyGiaHoiDoaiAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        Data();
        addEvent();
    }

    private void addEvent() {
        lvTyGiaHoiDoai.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TyGiaHoiDoai tyGiaHoiDoai = tyGiaHoiDoaiAdapter.getItem(i);
                Toast.makeText(MainActivity.this, "Bạn chọn " + tyGiaHoiDoai.getTenNuoc(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Data() {
        tyGiaHoiDoaiAdapter.add(new TyGiaHoiDoai(R.drawable.h1, "EU", 15000, 14789, 14357, 47052));
        tyGiaHoiDoaiAdapter.add(new TyGiaHoiDoai(R.drawable.h2, "American", 14658, 19357, 85169, 74650));
        tyGiaHoiDoaiAdapter.add(new TyGiaHoiDoai(R.drawable.h3, "England", 17859, 24789, 75179, 17548));
        tyGiaHoiDoaiAdapter.add(new TyGiaHoiDoai(R.drawable.h4, "Paris", 32547, 47569, 14257, 85791));
        tyGiaHoiDoaiAdapter.add(new TyGiaHoiDoai(R.drawable.h5, "Lao", 98025, 21743, 47852, 17896));
        tyGiaHoiDoaiAdapter.add(new TyGiaHoiDoai(R.drawable.h6, "Thailand", 57082, 57891, 11576, 147896));
        tyGiaHoiDoaiAdapter.add(new TyGiaHoiDoai(R.drawable.h7, "Campuchia", 85146, 20654, 17311, 457214));
        tyGiaHoiDoaiAdapter.add(new TyGiaHoiDoai(R.drawable.h8, "Japan", 74896, 17358, 17428, 17856));
        tyGiaHoiDoaiAdapter.add(new TyGiaHoiDoai(R.drawable.h9, "Korean", 45678, 54088, 86347, 247536));
    }

    private void addControls() {
        lvTyGiaHoiDoai = (ListView) findViewById(R.id.lvTyGiaHoiDoai);
        tyGiaHoiDoaiAdapter = new TyGiaHoiDoaiAdapter(MainActivity.this, R.layout.item);
        lvTyGiaHoiDoai.setAdapter(tyGiaHoiDoaiAdapter);
    }
}
