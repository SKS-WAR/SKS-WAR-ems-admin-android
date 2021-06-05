package com.sksm.ssg;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class StudentRegister extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText password;
    EditText phonenumber;
    EditText rollnumber;
    Button register;
    private ProgressBar progressBar;
    private FirebaseAuth auth;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarsr);
        toolbar.setTitle("Student Register");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        auth = FirebaseAuth.getInstance();
        name=findViewById(R.id.txtName);
        email=findViewById(R.id.txtEmail);
        password=findViewById(R.id.txtPwd);
        phonenumber=findViewById(R.id.txtphn);
        rollnumber=findViewById(R.id.txtroll);
        register=findViewById(R.id.btnRegister);
        progressBar = findViewById(R.id.progressBar);

        databaseReference = FirebaseDatabase.getInstance().getReference("Students");

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String Email = email.getText().toString().trim();
                final String Password = password.getText().toString().trim();
                final String Name=name.getText().toString().trim();
                final String PhoneNumber = phonenumber.getText().toString().trim();
                final String RollNumber = rollnumber.getText().toString().trim();
                if (TextUtils.isEmpty(Email)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(Password)) {
                    Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.length() < 6) {
                    Toast.makeText(getApplicationContext(), "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(Name))
                {
                    Toast.makeText(getApplicationContext(), "Enter Name!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(PhoneNumber))
                {
                    Toast.makeText(getApplicationContext(), "Enter PhoneNumber!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(RollNumber))
                {
                    Toast.makeText(getApplicationContext(), "Enter RollNumber!", Toast.LENGTH_SHORT).show();
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);
                auth.createUserWithEmailAndPassword(Email,Password)
                        .addOnCompleteListener(StudentRegister.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful())
                                {
                                    Student info = new Student(Name,Email,Password,PhoneNumber,RollNumber);

                                    FirebaseDatabase.getInstance().getReference("Students")
                                            .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                            .setValue(info).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            Toast.makeText(StudentRegister.this, "Registration Successful" + task.isSuccessful(), Toast.LENGTH_SHORT).show();
                                            progressBar.setVisibility(View.GONE);
                                            FirebaseAuth.getInstance().signOut();
                                            startActivity(new Intent(StudentRegister.this, Login.class));
                                        }
                                    });
                                }
                                else
                                {
                                    Toast.makeText(StudentRegister.this, "Authentication failed." + task.getException(),
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        progressBar.setVisibility(View.GONE);
    }
}