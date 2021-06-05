package com.sksm.ssg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class QuestionSetup extends AppCompatActivity {

    private DatabaseReference mDatabase;
    Button buttonNext,buttonNext45;
    EditText testname;
    EditText noofquestions;
    EditText date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_setup);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarqs);
        toolbar.setTitle("Question Setup");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        testname = findViewById(R.id.testnameEditText);
        noofquestions = findViewById(R.id.noofquestionEditText);
        date = findViewById(R.id.dateEditText);
        buttonNext=findViewById(R.id.buttonNext);
        buttonNext45=findViewById(R.id.buttonNext45);

        buttonNext45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Testname = testname.getText().toString().trim();
                String Noofquestions = noofquestions.getText().toString().trim();
                String Date = date.getText().toString().trim();
                if (TextUtils.isEmpty(Testname)) {
                    Toast.makeText(getApplicationContext(), "Enter Test Name!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(Noofquestions)) {
                    Toast.makeText(getApplicationContext(), "Enter No of questions!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(Date)) {
                    Toast.makeText(getApplicationContext(), "Enter Exam Date!", Toast.LENGTH_SHORT).show();
                    return;
                }
                mDatabase.child("examdetails").child("name").setValue(Testname);
                mDatabase.child("examdetails").child("noofquestions").setValue(Noofquestions);
                mDatabase.child("examdetails").child("date").setValue(Date);

                Toast.makeText(getApplicationContext(), "Setting up Exam", Toast.LENGTH_LONG).show();

                Toast.makeText(getApplicationContext(), "Done", Toast.LENGTH_SHORT).show();

                Intent intent1 = new Intent(QuestionSetup.this,Answer45questions.class);
                startActivity(intent1);
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Testname = testname.getText().toString().trim();
                String Noofquestions = noofquestions.getText().toString().trim();
                String Date = date.getText().toString().trim();
                if (TextUtils.isEmpty(Testname)) {
                    Toast.makeText(getApplicationContext(), "Enter Test Name!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(Noofquestions)) {
                    Toast.makeText(getApplicationContext(), "Enter No of questions!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(Date)) {
                    Toast.makeText(getApplicationContext(), "Enter Exam Date!", Toast.LENGTH_SHORT).show();
                    return;
                }
                mDatabase.child("examdetails").child("name").setValue(Testname);
                mDatabase.child("examdetails").child("noofquestions").setValue(Noofquestions);
                mDatabase.child("examdetails").child("date").setValue(Date);

                Toast.makeText(getApplicationContext(), "Setting up Exam", Toast.LENGTH_LONG).show();

                Toast.makeText(getApplicationContext(), "Done", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(QuestionSetup.this,Answer.class);
                startActivity(intent);
            }
        });
    }
}