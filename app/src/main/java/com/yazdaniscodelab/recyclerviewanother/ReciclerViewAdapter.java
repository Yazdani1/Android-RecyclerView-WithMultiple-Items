package com.yazdaniscodelab.recyclerviewanother;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Yazdani on 5/8/2017.
 */

public class ReciclerViewAdapter extends RecyclerView.Adapter<ReciclerViewAdapter.MyRecyclerView> {

    private ArrayList<DataItem>arrayList=new ArrayList<DataItem>();

    public ReciclerViewAdapter(ArrayList<DataItem> arrayList){

        this.arrayList=arrayList;

    }

    @Override
    public MyRecyclerView onCreateViewHolder(ViewGroup parent, int viewType) {

        View myview= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        MyRecyclerView myRecyclerView=new MyRecyclerView(myview);

        return myRecyclerView;
    }


    public void onBindViewHolder(MyRecyclerView holder, int position) {

        DataItem dataItem=arrayList.get(position);

        holder.imageView.setImageResource(dataItem.getImage_res());
        holder.title.setText(dataItem.getTitle());
        holder.description.setText(dataItem.getDescription());
        holder.price.setText(dataItem.getPrice());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public static class MyRecyclerView extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView title;
        TextView description;
        TextView price;


        public MyRecyclerView(View mview){

            super(mview);

            imageView=(ImageView)mview.findViewById(R.id.image_xml);
            title=(TextView)mview.findViewById(R.id.title_xml);
            description=(TextView)mview.findViewById(R.id.description_xml);
            price=(TextView)mview.findViewById(R.id.price_xml);

        }

    }


}
