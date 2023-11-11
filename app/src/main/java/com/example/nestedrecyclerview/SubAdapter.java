package com.example.nestedrecyclerview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SubAdapter extends RecyclerView.Adapter<SubAdapter.ViewHolder> {

    ArrayList<SubModelClass> arrayList;
    Context context;

    public SubAdapter(ArrayList<SubModelClass> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public SubAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.rv_sub_view,parent,false);
       return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(arrayList.get(position).getImage_ID());
        Toast.makeText(context,String.valueOf(arrayList.get(position).getImage_ID()) , Toast.LENGTH_SHORT).show();
        Log.e( "onBindViewHolder: ", String.valueOf(arrayList.get(position).getImage_ID()));

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.img);
        }
    }
}
