package com.example.bsgi2;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {
    private Button rfl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        rfl = (Button) findViewById(R.id.rfl);
        rfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyActivity4();
            }
        });

    }


    public void openMyActivity4() {
        Intent intent = new Intent(this, MemberSearch.class);
        startActivity(intent);
    }

}