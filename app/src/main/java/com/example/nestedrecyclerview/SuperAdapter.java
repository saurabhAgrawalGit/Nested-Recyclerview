package com.example.nestedrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SuperAdapter extends RecyclerView.Adapter<SuperAdapter.ViewHolder> {
    ArrayList<SuperModelClass> superModelClassArrayList;
    Context context;

    public SuperAdapter(ArrayList<SuperModelClass> superModelClasses, Context context) {
        this.superModelClassArrayList = superModelClasses;
        this.context = context;
    }

    @NonNull
    @Override
    public SuperAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_super_view,null,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SuperAdapter.ViewHolder holder, int position) {
        holder.Title.setText(superModelClassArrayList.get(position).getTitle());

        SubAdapter subAdapter ;
        subAdapter = new SubAdapter(superModelClassArrayList.get(position).subModelClassArrayList,context);
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        holder.recyclerView.setAdapter(subAdapter);
        subAdapter.notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return superModelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView Title;
        RecyclerView recyclerView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Title=itemView.findViewById(R.id.title);
            recyclerView=itemView.findViewById(R.id.rv_sub);
        }
    }
}
