package com.sksm.ssg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Start_Stop extends AppCompatActivity {

    private Button startExam;
    private Button stopExam;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start__stop);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarsse);
        toolbar.setTitle("Start/Stop Exam");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        startExam = findViewById(R.id.start);
        startExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase.getInstance().getReference("examdetails").child("timer").setValue("on");
                Toast.makeText(Start_Stop.this, "The Exam has Started", Toast.LENGTH_LONG).show();
            }
        });
        stopExam = findViewById(R.id.stop);
        stopExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase.getInstance().getReference("examdetails").child("timer").setValue("off");
                Toast.makeText(Start_Stop.this, "The Exam has Stopped", Toast.LENGTH_LONG).show();
            }
        });
    }
}