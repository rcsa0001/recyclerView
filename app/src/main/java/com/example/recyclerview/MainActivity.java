package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    //RecyclerView recyclerview;
//    LinearLayoutManager LayoutManager;
//    List<ModelClass> usersList;
//    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView userList = (RecyclerView) findViewById(R.id.userList);
        userList.setLayoutManager(new LinearLayoutManager(this));
        String[] users = {"Ravi","Zaid"};
        userList.setAdapter(new UserAdapter(users));

        //initData();
       // initRecyclerView();
    }
//
//    private void initData() {
//        usersList=new ArrayList<>();
//        usersList.add(new ModelClass("Ravikumar"));
//        usersList.add(new ModelClass("Ravikumar"));
//        usersList.add(new ModelClass("Ravikumar"));
//        usersList.add(new ModelClass("Ravikumar"));
//
//
//    }
//
//    private void initRecyclerView() {
//        recyclerview=findViewById(R.id.recyclerView);
//        LayoutManager=new LinearLayoutManager(this);
//        LayoutManager.setOrientation(RecyclerView.VERTICAL);
//        recyclerview.setLayoutManager(LayoutManager);
//        recyclerview.setAdapter(adapter);
//        adapter.notifyDataSetChanged();
//
//    }
}