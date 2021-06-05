package com.sksm.ssg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class developer_contact extends AppCompatActivity {

    TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_contact);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbardc);
        toolbar.setTitle("Developer Contact");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textView = findViewById(R.id.sandeeplink);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView2 = findViewById(R.id.sudeeplink);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}