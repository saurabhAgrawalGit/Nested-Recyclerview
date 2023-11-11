package com.example.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    ArrayList<SuperModelClass> main;
    ArrayList<SubModelClass> sub1;
    ArrayList<SubModelClass> sub2;
    ArrayList<SubModelClass> sub3;
    ArrayList<SubModelClass> sub4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.rv_super);

        main = new ArrayList<SuperModelClass>();
        sub1 = new ArrayList<>();
        sub2 = new ArrayList<>();
        sub3 = new ArrayList<>();
        sub1.add(new SubModelClass(R.drawable.poster1));
        sub1.add(new SubModelClass(R.drawable.poster2));
        sub1.add(new SubModelClass(R.drawable.poster1));
        sub1.add(new SubModelClass(R.drawable.poster2));
        sub1.add(new SubModelClass(R.drawable.poster1));


        sub2.add(new SubModelClass(R.drawable.poster1));
        sub2.add(new SubModelClass(R.drawable.poster1));
        sub2.add(new SubModelClass(R.drawable.poster2));
        sub2.add(new SubModelClass(R.drawable.poster1));
        main.add(new SuperModelClass("Most Fav",sub1));
        main.add(new SuperModelClass("low ",sub2));
        SuperAdapter superAdapter;
        superAdapter =new SuperAdapter(main,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager( this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(superAdapter);
        superAdapter.notifyDataSetChanged();


    }
}