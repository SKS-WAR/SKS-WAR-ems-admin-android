package com.sksm.ssg;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer=findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle =  new ActionBarDrawerToggle(this,drawer,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

//        authStateListener = new FirebaseAuth.AuthStateListener() {
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//                FirebaseUser user = firebaseAuth.getCurrentUser();
//                if (user != null) {
//                    Toast.makeText(Home.this, "User logged in ", Toast.LENGTH_SHORT).show();
//
//                } else {
//                    Toast.makeText(Home.this, "Login to continue", Toast.LENGTH_SHORT).show();
//                    Intent I = new Intent(Home.this, Login.class);
//                    startActivity(I);
//                    finish();
//                }
//            }
//        };
    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
//            case R.id.edit_student:
//                Intent intent1 = new Intent(Home.this, Edit_Delete_Student.class);
//                startActivity(intent1);
//                break;

            case R.id.setup_exam:
                Intent intent2 = new Intent(Home.this, SetupExam.class);
                startActivity(intent2);
                break;

            case R.id.first_year_rank_list:
                Intent intent7 = new Intent(Home.this, first_year_rank_list.class);
                startActivity(intent7);
                break;

            case R.id.second_year_rank_list:
                Intent intent3 = new Intent(Home.this, RankList.class);
                startActivity(intent3);
                break;

            case R.id.rank_list_45_question:
                Intent in = new Intent(Home.this, RankList_45_question.class);
                startActivity(in);
                break;

            case R.id.rank_list_45_question_negative:
                Intent inn = new Intent(Home.this, RankList_45_question_negative.class);
                startActivity(inn);
                break;

            case R.id.start_stop_exam:
                Intent intent4 = new Intent(Home.this, Start_Stop.class);
                startActivity(intent4);
                break;
            case R.id.clean_database:
                FirebaseDatabase.getInstance().getReference().child("exam").setValue(null);
                FirebaseDatabase.getInstance().getReference().child("exam45").setValue(null);
                Toast.makeText(this, "All Exam Data is Cleared", Toast.LENGTH_SHORT).show();
                break;
            case R.id.developer_contact:
                Intent intent5 = new Intent(Home.this, developer_contact.class);
                startActivity(intent5);
                break;
            case R.id.logout:
                FirebaseAuth.getInstance().signOut();
                Intent intent6 = new Intent(Home.this, Login.class);
                startActivity(intent6);
                Toast.makeText(this, "Successfully Logged Out", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
        return true;
    }
    @Override
    protected void onStart() {
        super.onStart();
//        firebaseAuth.addAuthStateListener(authStateListener);
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if(currentUser == null){
            Toast.makeText(Home.this, "You are supposed to login", Toast.LENGTH_SHORT).show();
            Intent intent6 = new Intent(Home.this, Login.class);
            startActivity(intent6);
            finish();
        }
    }
}