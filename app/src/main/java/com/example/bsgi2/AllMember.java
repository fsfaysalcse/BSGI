package com.example.bsgi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllMember extends AppCompatActivity {

    private Button view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_member);


        view = (Button) findViewById(R.id.view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyActivity4();
            }
        });




    }

    public void openMyActivity4() {
        Intent intent = new Intent(this, details.class);
        startActivity(intent);
    }

}