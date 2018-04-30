package com.example.tye.ncatathletics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class mainPage extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        final Button buttonNews = findViewById(R.id.button);
        final Button buttonTeams = findViewById(R.id.button2);

        buttonTeams.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // go to teams page
                goToteamsPage();

            }
        });
        buttonNews.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){ //go to news page
            }
        });
    }

    private void goToteamsPage() {
        Intent intent = new Intent(this, teamsPage.class);
        startActivity(intent);
    }
}
