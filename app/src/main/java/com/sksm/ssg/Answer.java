package com.sksm.ssg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Answer extends AppCompatActivity {

    RadioGroup radioGroup1,radioGroup2,radioGroup3,radioGroup4,radioGroup5,radioGroup6,radioGroup7,radioGroup8,radioGroup9,radioGroup10,radioGroup11;
    RadioGroup radioGroup12,radioGroup13,radioGroup14,radioGroup15,radioGroup16,radioGroup17,radioGroup18,radioGroup19,radioGroup20,radioGroup21,radioGroup22,radioGroup23;
    RadioGroup radioGroup24,radioGroup25,radioGroup26,radioGroup27,radioGroup28,radioGroup29,radioGroup30,radioGroup31,radioGroup32,radioGroup33,radioGroup34,radioGroup35;
    RadioGroup radioGroup36,radioGroup37,radioGroup38,radioGroup39,radioGroup40,radioGroup41,radioGroup42,radioGroup43,radioGroup44,radioGroup45,radioGroup46,radioGroup47,radioGroup48,radioGroup49,radioGroup50;

    RadioGroup radioGroup51,radioGroup52,radioGroup53,radioGroup54,radioGroup55,radioGroup56,radioGroup57,radioGroup58,radioGroup59,radioGroup60;
    RadioGroup radioGroup61,radioGroup62,radioGroup63,radioGroup64,radioGroup65,radioGroup66,radioGroup67,radioGroup68,radioGroup69,radioGroup70;
    RadioGroup radioGroup71,radioGroup72,radioGroup73,radioGroup74,radioGroup75,radioGroup76,radioGroup77,radioGroup78,radioGroup79,radioGroup80;
    RadioGroup radioGroup81,radioGroup82,radioGroup83,radioGroup84,radioGroup85,radioGroup86,radioGroup87,radioGroup88,radioGroup89,radioGroup90;
    RadioGroup radioGroup91,radioGroup92,radioGroup93,radioGroup94,radioGroup95,radioGroup96,radioGroup97,radioGroup98,radioGroup99,radioGroup100;
    RadioButton radioButton;

    Button bt;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbaranswer);
        toolbar.setTitle("Answer");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);
        radioGroup4 = findViewById(R.id.radioGroup4);
        radioGroup5 = findViewById(R.id.radioGroup5);
        radioGroup6 = findViewById(R.id.radioGroup6);
        radioGroup7 = findViewById(R.id.radioGroup7);
        radioGroup8 = findViewById(R.id.radioGroup8);
        radioGroup9 = findViewById(R.id.radioGroup9);

        radioGroup10 = findViewById(R.id.radioGroup10);
        radioGroup11 = findViewById(R.id.radioGroup11);
        radioGroup12 = findViewById(R.id.radioGroup12);
        radioGroup13 = findViewById(R.id.radioGroup13);
        radioGroup14 = findViewById(R.id.radioGroup14);
        radioGroup15 = findViewById(R.id.radioGroup15);
        radioGroup16 = findViewById(R.id.radioGroup16);
        radioGroup17 = findViewById(R.id.radioGroup17);
        radioGroup18= findViewById(R.id.radioGroup18);
        radioGroup19= findViewById(R.id.radioGroup19);

        radioGroup20= findViewById(R.id.radioGroup20);
        radioGroup21 = findViewById(R.id.radioGroup21);
        radioGroup22 = findViewById(R.id.radioGroup22);
        radioGroup23 = findViewById(R.id.radioGroup23);
        radioGroup24 = findViewById(R.id.radioGroup24);
        radioGroup25 = findViewById(R.id.radioGroup25);
        radioGroup26 = findViewById(R.id.radioGroup26);
        radioGroup27 = findViewById(R.id.radioGroup27);
        radioGroup28 = findViewById(R.id.radioGroup28);
        radioGroup29 = findViewById(R.id.radioGroup29);

        radioGroup30 = findViewById(R.id.radioGroup30);
        radioGroup31 = findViewById(R.id.radioGroup31);
        radioGroup32 = findViewById(R.id.radioGroup32);
        radioGroup33 = findViewById(R.id.radioGroup33);
        radioGroup34 = findViewById(R.id.radioGroup34);
        radioGroup35 = findViewById(R.id.radioGroup35);
        radioGroup36 = findViewById(R.id.radioGroup36);
        radioGroup37 = findViewById(R.id.radioGroup37);
        radioGroup38 = findViewById(R.id.radioGroup38);
        radioGroup39 = findViewById(R.id.radioGroup39);

        radioGroup40 = findViewById(R.id.radioGroup40);
        radioGroup41 = findViewById(R.id.radioGroup41);
        radioGroup42 = findViewById(R.id.radioGroup42);
        radioGroup43 = findViewById(R.id.radioGroup43);
        radioGroup44 = findViewById(R.id.radioGroup44);
        radioGroup45 = findViewById(R.id.radioGroup45);
        radioGroup46 = findViewById(R.id.radioGroup46);
        radioGroup47 = findViewById(R.id.radioGroup47);
        radioGroup48 = findViewById(R.id.radioGroup48);
        radioGroup49 = findViewById(R.id.radioGroup49);
        radioGroup50= findViewById(R.id.radioGroup50);

        radioGroup51 = findViewById(R.id.radioGroup51);
        radioGroup52 = findViewById(R.id.radioGroup52);
        radioGroup53 = findViewById(R.id.radioGroup53);
        radioGroup54 = findViewById(R.id.radioGroup54);
        radioGroup55 = findViewById(R.id.radioGroup55);
        radioGroup56 = findViewById(R.id.radioGroup56);
        radioGroup57 = findViewById(R.id.radioGroup57);
        radioGroup58 = findViewById(R.id.radioGroup58);
        radioGroup59 = findViewById(R.id.radioGroup59);

        radioGroup60 = findViewById(R.id.radioGroup60);
        radioGroup61 = findViewById(R.id.radioGroup61);
        radioGroup62 = findViewById(R.id.radioGroup62);
        radioGroup63 = findViewById(R.id.radioGroup63);
        radioGroup64 = findViewById(R.id.radioGroup64);
        radioGroup65 = findViewById(R.id.radioGroup65);
        radioGroup66 = findViewById(R.id.radioGroup66);
        radioGroup67 = findViewById(R.id.radioGroup67);
        radioGroup68 = findViewById(R.id.radioGroup68);
        radioGroup69 = findViewById(R.id.radioGroup69);

        radioGroup70 = findViewById(R.id.radioGroup70);
        radioGroup71 = findViewById(R.id.radioGroup71);
        radioGroup72 = findViewById(R.id.radioGroup72);
        radioGroup73 = findViewById(R.id.radioGroup73);
        radioGroup74 = findViewById(R.id.radioGroup74);
        radioGroup75 = findViewById(R.id.radioGroup75);
        radioGroup76 = findViewById(R.id.radioGroup76);
        radioGroup77 = findViewById(R.id.radioGroup77);
        radioGroup78 = findViewById(R.id.radioGroup78);
        radioGroup79 = findViewById(R.id.radioGroup79);

        radioGroup80 = findViewById(R.id.radioGroup80);
        radioGroup81 = findViewById(R.id.radioGroup81);
        radioGroup82 = findViewById(R.id.radioGroup82);
        radioGroup83 = findViewById(R.id.radioGroup83);
        radioGroup84 = findViewById(R.id.radioGroup84);
        radioGroup85 = findViewById(R.id.radioGroup85);
        radioGroup86 = findViewById(R.id.radioGroup86);
        radioGroup87 = findViewById(R.id.radioGroup87);
        radioGroup88 = findViewById(R.id.radioGroup88);
        radioGroup89 = findViewById(R.id.radioGroup89);

        radioGroup90 = findViewById(R.id.radioGroup90);
        radioGroup91 = findViewById(R.id.radioGroup91);
        radioGroup92 = findViewById(R.id.radioGroup92);
        radioGroup93 = findViewById(R.id.radioGroup93);
        radioGroup94 = findViewById(R.id.radioGroup94);
        radioGroup95 = findViewById(R.id.radioGroup95);
        radioGroup96 = findViewById(R.id.radioGroup96);
        radioGroup97 = findViewById(R.id.radioGroup97);
        radioGroup98 = findViewById(R.id.radioGroup98);
        radioGroup99 = findViewById(R.id.radioGroup99);

        radioGroup100 = findViewById(R.id.radioGroup100);

        bt = findViewById(R.id.btn);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = "";

                int radioID = radioGroup1.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();



                radioID = radioGroup2.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup3.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup4.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup5.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup6.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup7.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup8.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup9.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup10.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup11.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup12.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup13.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup14.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup15.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup16.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup17.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup18.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup19.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup20.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup21.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup22.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup23.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup24.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup25.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup26.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup27.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup28.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup29.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup30.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup31.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup32.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup33.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup34.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup35.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup36.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup37.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup38.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup39.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup40.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup41.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup42.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup43.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup44.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup45.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup46.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup47.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup48.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup49.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup50.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup51.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();



                radioID = radioGroup52.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup53.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup54.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup55.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup56.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup57.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup58.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup59.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup60.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup61.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();



                radioID = radioGroup62.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup63.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup64.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup65.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup66.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup67.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup68.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup69.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup70.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup71.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();



                radioID = radioGroup72.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup73.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup74.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup75.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup76.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup77.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup78.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup79.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup80.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup81.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();



                radioID = radioGroup82.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup83.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup84.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup85.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup86.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup87.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup88.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup89.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup90.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup91.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();



                radioID = radioGroup92.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup93.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup94.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup95.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup96.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup97.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup98.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup99.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup100.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();




                mDatabase.child("examkey").child(user.getUid()).child("answerkey").setValue(ans);
                Toast.makeText(getApplicationContext(), "Submitting answers", Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Submitted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
