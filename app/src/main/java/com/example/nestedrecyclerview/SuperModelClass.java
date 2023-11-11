package com.example.nestedrecyclerview;

import java.util.ArrayList;

public class SuperModelClass {
    String Title;
    ArrayList<SubModelClass> subModelClassArrayList=new ArrayList<>();

    public SuperModelClass(String title, ArrayList<SubModelClass> subModelClassArrayList) {
        Title = title;
       this.subModelClassArrayList = subModelClassArrayList;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public ArrayList<SubModelClass> getSubModelClassArrayList() {
        return subModelClassArrayList;
    }

    public void setSubModelClassArrayList(ArrayList<SubModelClass> subModelClassArrayList) {
        this.subModelClassArrayList = subModelClassArrayList;
    }
}
