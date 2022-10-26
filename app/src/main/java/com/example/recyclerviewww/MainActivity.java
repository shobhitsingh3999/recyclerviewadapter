package com.example.recyclerviewww;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> sh = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        RecyclerView recyclerView = findViewById(R.id.zolo);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        sh.add(new ContactModel(R.drawable.logo,"Shobhit singh","7742270709"));
        sh.add(new ContactModel(R.drawable.logo,"Abhinav pandey","7007557606"));
        sh.add(new ContactModel(R.drawable.logo,"Divyesh singh","7742270709"));
        sh.add(new ContactModel(R.drawable.logo,"robin","7007557606"));
        sh.add(new ContactModel(R.drawable.logo,"Shobhit singh","7742270709"));
        sh.add(new ContactModel(R.drawable.logo,"Abhinav pandey","7007557606"));
        sh.add(new ContactModel(R.drawable.logo,"Shobhit singh","7742270709"));
        sh.add(new ContactModel(R.drawable.logo,"Abhinav pandey","7007557606"));
        sh.add(new ContactModel(R.drawable.logo,"Shobhit singh","7742270709"));
        sh.add(new ContactModel(R.drawable.logo,"Abhinav pandey","7007557606"));
        sh.add(new ContactModel(R.drawable.logo,"Shobhit singh","7742270709"));
        sh.add(new ContactModel(R.drawable.logo,"Abhinav pandey","7007557606"));
        sh.add(new ContactModel(R.drawable.logo,"Shobhit singh","7742270709"));
        sh.add(new ContactModel(R.drawable.logo,"Abhinav pandey","7007557606"));
        sh.add(new ContactModel(R.drawable.logo,"Shobhit singh","7742270709"));
        sh.add(new ContactModel(R.drawable.logo,"Abhinav pandey","7007557606"));
        sh.add(new ContactModel(R.drawable.logo,"Shobhit singh","7742270709"));
        sh.add(new ContactModel(R.drawable.logo,"Abhinav pandey","7007557606"));
        sh.add(new ContactModel(R.drawable.logo,"Shobhit singh","7742270709"));
        sh.add(new ContactModel(R.drawable.logo,"Abhinav pandey","7007557606"));
        sh.add(new ContactModel(R.drawable.logo,"Shobhit singh","7742270709"));
        sh.add(new ContactModel(R.drawable.logo,"Abhinav pandey","7007557606"));
        sh.add(new ContactModel(R.drawable.logo,"Shobhit singh","7742270709"));
        sh.add(new ContactModel(R.drawable.logo,"Abhinav pandey","7007557606"));
        sh.add(new ContactModel(R.drawable.logo,"Shobhit singh","7742270709"));
        sh.add(new ContactModel(R.drawable.logo,"Abhinav pandey","7007557606"));
        sh.add(new ContactModel(R.drawable.logo,"Shobhit singh","7742270709"));
        sh.add(new ContactModel(R.drawable.logo,"Abhinav pandey","7007557606"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,sh);

        recyclerView.setAdapter(adapter);



    }
}