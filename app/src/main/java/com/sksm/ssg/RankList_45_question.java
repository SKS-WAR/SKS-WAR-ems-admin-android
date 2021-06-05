package com.sksm.ssg;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RankList_45_question extends AppCompatActivity {

    StorageReference mStorageReference;
    DatabaseReference mDatabaseReference;

    String actual_answer = "";
    HashMap<String,String> namesAndNumbers;
    int marks=0;

    String examkey="";
    ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();
//    ArrayList<String> markList=new ArrayList<>();


    private ListView listview1;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank_list_45_question);



        listview1 = (ListView) findViewById(R.id.mainListview1);


        ArrayList<Integer> allStudents = new ArrayList<Integer>();
        mStorageReference = FirebaseStorage.getInstance().getReference();
        mDatabaseReference = FirebaseDatabase.getInstance().getReference();

        textView1 = findViewById(R.id.testName);
        textView2 = findViewById(R.id.testNOQ);
        textView3 = findViewById(R.id.testDate);

        mDatabaseReference.child("examdetails").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot snap : snapshot.getChildren()){

                    textView1.setText(snapshot.child("name").getValue().toString());
                    textView2.setText(snapshot.child("noofquestions").getValue().toString());
                    textView3.setText(snapshot.child("date").getValue().toString());
//                    Toast.makeText(RankList.this, actual_answer, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabaseReference.child("examkey45").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot snap : snapshot.getChildren()){

                    actual_answer =snap.child("answerkey").getValue().toString();
//                    Toast.makeText(RankList.this, actual_answer, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        namesAndNumbers = new HashMap<String,String>();
        mDatabaseReference.child("exam45").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot snap : snapshot.getChildren()){

                    String z_name=snap.child("answer").getValue().toString();
                    namesAndNumbers.put(snap.getKey(), z_name);
//                    namesAndNumbers.add();
                    //Toast.makeText(RankList.this, namesAndNumbers.get(snap.getKey()), Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabaseReference.child("examkey45").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot ds: dataSnapshot.getChildren()){
                    examkey=ds.child("answerkey").getValue().toString();
                }
                Iterator ii=namesAndNumbers.entrySet().iterator();
                while (ii.hasNext()) {
                    Map.Entry mapElement = (Map.Entry)ii.next();

                    final String s =(String) mapElement.getValue();

//                    for(int i=0;i<examkey.length();i++)
//                    {
//                        if(s.charAt(i)=='E'||examkey.charAt(i)=='E')
//                            continue;
//                        if(s.charAt(i)==examkey.charAt(i))
//                            marks+=4;
//                        else
//                            marks-=1;
//                    }
                    final String mapele= mapElement.getKey().toString();
                    //name and roll
                    FirebaseDatabase.getInstance().getReference("Students").child(mapElement.getKey().toString()).addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            Student student = snapshot.getValue(Student.class);
                            int phy = 0;
                            int chem = 0;
                            int math = 0;
                            for(int i=0;i<examkey.length();i++)
                            {
                                if(s.charAt(i)=='E'||examkey.charAt(i)=='E')
                                    continue;
                                if(s.charAt(i)==examkey.charAt(i))
                                    marks+=4;
                                else
                                    marks-=0;
                            }
                            //phy
                            for(int i=0;i<15;i++)
                            {
                                if(s.charAt(i)=='E'||examkey.charAt(i)=='E')
                                    continue;
                                if(s.charAt(i)==examkey.charAt(i))
                                    phy+=4;
                                else
                                    phy-=0;
                            }
                            //chem
                            for(int i=15;i<30;i++)
                            {
                                if(s.charAt(i)=='E'||examkey.charAt(i)=='E')
                                    continue;
                                if(s.charAt(i)==examkey.charAt(i))
                                    chem+=4;
                                else
                                    chem-=0;
                            }
                            //math
                            for(int i=30;i<45;i++)
                            {
                                if(s.charAt(i)=='E'||examkey.charAt(i)=='E')
                                    continue;
                                if(s.charAt(i)==examkey.charAt(i))
                                    math+=4;
                                else
                                    math-=0;
                            }
                            final ArrayList<String> markList=new ArrayList<>();
                            markList.add(mapele);//uid
                            markList.add(marks+"");
                            marks=0;
                            markList.add(student.getRollnumber());
                            markList.add(student.getName());
                            markList.add(phy+"");
                            markList.add(chem+"");
                            markList.add(math+"");
                            lists.add(markList);
                            if(lists.size()>2) {
                                Collections.sort(lists, new Comparator<List<String>>() {
                                    @Override
                                    public int compare(List<String> a, List<String> b) {
                                        return Integer.parseInt(a.get(1).trim()) < Integer.parseInt(b.get(1).trim()) ? 1 : -1;
                                    }
                                });
                            }

//                            Toast.makeText(RankList_45_question.this, lists.size()+" ", Toast.LENGTH_SHORT).show();

                            CustomListAdapter45 adapter = new CustomListAdapter45(RankList_45_question.this, lists);
                            listview1.setAdapter(adapter);
                            ((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

                }

//                Collections.sort(lists, new Comparator<List<String>> () {
//                    @Override
//                    public int compare(List<String> a, List<String> b) {
//                        return Integer.parseInt(a.get(1).trim())<Integer.parseInt(b.get(1).trim())?1:-1;
//                    }
//                });
//
//
//                Toast.makeText(RankList.this, lists.size()+" ", Toast.LENGTH_SHORT).show();
//
//                CustomListAdapter adapter = new CustomListAdapter(RankList.this, lists);
//                listview1.setAdapter(adapter);
//                ((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        namesAndNumbers=sortByValue(namesAndNumbers);


    }

    public  HashMap<String, String> sortByValue(HashMap<String, String> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, String> > list =
                new LinkedList<Map.Entry<String, String> >(hm.entrySet());

        // Sort the list

        // put data from sorted list to hashmap
        HashMap<String, String> temp = new LinkedHashMap<String, String>();
        for (Map.Entry<String, String> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        return temp;
    }

}