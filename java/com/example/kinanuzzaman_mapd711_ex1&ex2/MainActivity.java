package com.example.kinanuzzaman_mapd711_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText fullName,qualification,profession,hobby,dreamJob;
    private Button send;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullName = findViewById(R.id.fullName);
        qualification = findViewById(R.id.qualification);
        profession = findViewById(R.id.profession);
        hobby = findViewById(R.id.hobby);
        dreamJob = findViewById(R.id.dreamJob);
         send = findViewById(R.id.send);



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userFullName = fullName.getText().toString();
                String userQualification = qualification.getText().toString();
                String  userProfession =  profession.getText().toString();
                String userHobby  = hobby.getText().toString();
                String userDreamJob = dreamJob.getText().toString();


                Intent intent = new Intent (MainActivity.this, Activity2.class);
                intent.putExtra("keyName",userFullName);
                intent.putExtra("keyQualification",userQualification);
                intent.putExtra("keyProfession",userProfession);
                intent.putExtra("keyHobby",userHobby);
                intent.putExtra("keyDreamJob",userDreamJob);
                startActivity(intent);
            }
        });
    }




}