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

public class Answer45questions extends AppCompatActivity {

    RadioGroup radioGroup1,radioGroup2,radioGroup3,radioGroup4,radioGroup5,radioGroup6,radioGroup7,radioGroup8,radioGroup9,radioGroup10,radioGroup11;
    RadioGroup radioGroup12,radioGroup13,radioGroup14,radioGroup15,radioGroup16,radioGroup17,radioGroup18,radioGroup19,radioGroup20,radioGroup21,radioGroup22,radioGroup23;
    RadioGroup radioGroup24,radioGroup25,radioGroup26,radioGroup27,radioGroup28,radioGroup29,radioGroup30,radioGroup31,radioGroup32,radioGroup33,radioGroup34,radioGroup35;
    RadioGroup radioGroup36,radioGroup37,radioGroup38,radioGroup39,radioGroup40,radioGroup41,radioGroup42,radioGroup43,radioGroup44,radioGroup45;

    RadioButton radioButton;
    Button bt45ques;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer45questions);

        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbaranswer1);
        toolbar.setTitle("Answer");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        radioGroup1 = findViewById(R.id.radioGroup1n);
        radioGroup2 = findViewById(R.id.radioGroup2n);
        radioGroup3 = findViewById(R.id.radioGroup3n);
        radioGroup4 = findViewById(R.id.radioGroup4n);
        radioGroup5 = findViewById(R.id.radioGroup5n);
        radioGroup6 = findViewById(R.id.radioGroup6n);
        radioGroup7 = findViewById(R.id.radioGroup7n);
        radioGroup8 = findViewById(R.id.radioGroup8n);
        radioGroup9 = findViewById(R.id.radioGroup9n);

        radioGroup10 = findViewById(R.id.radioGroup10n);
        radioGroup11 = findViewById(R.id.radioGroup11n);
        radioGroup12 = findViewById(R.id.radioGroup12n);
        radioGroup13 = findViewById(R.id.radioGroup13n);
        radioGroup14 = findViewById(R.id.radioGroup14n);
        radioGroup15 = findViewById(R.id.radioGroup15n);
        radioGroup16 = findViewById(R.id.radioGroup16n);
        radioGroup17 = findViewById(R.id.radioGroup17n);
        radioGroup18= findViewById(R.id.radioGroup18n);
        radioGroup19= findViewById(R.id.radioGroup19n);

        radioGroup20= findViewById(R.id.radioGroup20n);
        radioGroup21 = findViewById(R.id.radioGroup21n);
        radioGroup22 = findViewById(R.id.radioGroup22n);
        radioGroup23 = findViewById(R.id.radioGroup23n);
        radioGroup24 = findViewById(R.id.radioGroup24n);
        radioGroup25 = findViewById(R.id.radioGroup25n);
        radioGroup26 = findViewById(R.id.radioGroup26n);
        radioGroup27 = findViewById(R.id.radioGroup27n);
        radioGroup28 = findViewById(R.id.radioGroup28n);
        radioGroup29 = findViewById(R.id.radioGroup29n);

        radioGroup30 = findViewById(R.id.radioGroup30n);
        radioGroup31 = findViewById(R.id.radioGroup31n);
        radioGroup32 = findViewById(R.id.radioGroup32n);
        radioGroup33 = findViewById(R.id.radioGroup33n);
        radioGroup34 = findViewById(R.id.radioGroup34n);
        radioGroup35 = findViewById(R.id.radioGroup35n);
        radioGroup36 = findViewById(R.id.radioGroup36n);
        radioGroup37 = findViewById(R.id.radioGroup37n);
        radioGroup38 = findViewById(R.id.radioGroup38n);
        radioGroup39 = findViewById(R.id.radioGroup39n);

        radioGroup40 = findViewById(R.id.radioGroup40n);
        radioGroup41 = findViewById(R.id.radioGroup41n);
        radioGroup42 = findViewById(R.id.radioGroup42n);
        radioGroup43 = findViewById(R.id.radioGroup43n);
        radioGroup44 = findViewById(R.id.radioGroup44n);
        radioGroup45 = findViewById(R.id.radioGroup45n);

        bt45ques = findViewById(R.id.btn45);
        bt45ques.setOnClickListener(new View.OnClickListener() {
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
                mDatabase.child("examkey45").child(user.getUid()).child("answerkey").setValue(ans);
                Toast.makeText(getApplicationContext(), "Submitting answers", Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Submitted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}