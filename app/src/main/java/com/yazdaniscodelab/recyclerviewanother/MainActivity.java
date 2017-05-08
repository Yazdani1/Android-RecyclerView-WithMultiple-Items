package com.yazdaniscodelab.recyclerviewanother;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    String[] F_title,D_description,P_price;

    int[] image=new int[]{
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.a,
            R.drawable.b,
            R.drawable.c
    };

    public ArrayList<DataItem>arrayList=new ArrayList<DataItem>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycler_xml);

        F_title=getResources().getStringArray(R.array.item_title);
        D_description=getResources().getStringArray(R.array.description_item);
        P_price=getResources().getStringArray(R.array.price_item);

        int i=0;

        for (String title:F_title){

            DataItem dataItem=new DataItem(image[i],title,D_description[i],P_price[i]);
            arrayList.add(dataItem);
            i++;
        }

        recyclerView.setHasFixedSize(true);
        adapter=new ReciclerViewAdapter(arrayList);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

}
