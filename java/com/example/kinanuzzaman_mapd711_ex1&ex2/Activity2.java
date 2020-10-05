package com.example.kinanuzzaman_mapd711_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private  TextView fullName,qualification,profession,hobby,dreamJob;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

         fullName = findViewById(R.id.textView6);
        qualification = findViewById(R.id.textView7);
         profession = findViewById(R.id.textView8);
         hobby = findViewById(R.id.textView9);
        dreamJob = findViewById(R.id.textView10);

        String userFullName = getIntent().getStringExtra("keyName");
        String userQualification = getIntent().getStringExtra("keyQualification");
        String userProfession = getIntent().getStringExtra("keyProfession");
        String userHobby = getIntent().getStringExtra("keyHobby");
        String userDreamJob = getIntent().getStringExtra("keyDreamJob");


        fullName.setText("Full Name:"+" "+userFullName);
        qualification.setText("Qualification:"+" "+userQualification);
        profession.setText("Profession:"+" "+userProfession);
        hobby.setText("Hobby:"+" "+userHobby);
        dreamJob.setText("Dream Job:"+" "+userDreamJob);







    }
}