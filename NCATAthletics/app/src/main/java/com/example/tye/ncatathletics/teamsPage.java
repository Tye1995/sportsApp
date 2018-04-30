package com.example.tye.ncatathletics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class teamsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams_page);

        final Button buttonMen = findViewById(R.id.button3);
        final Button buttonWomen = findViewById(R.id.button4);

        buttonMen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToMenSports();
            }
        });
        buttonWomen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToWomenSports();
            }
        });

    }
    private void goToMenSports(){
        Intent intent = new Intent(this, MenSports.class);
        startActivity(intent);
    }
    private void goToWomenSports(){
        Intent intent = new Intent(this, WomenSports.class);
    }
}
