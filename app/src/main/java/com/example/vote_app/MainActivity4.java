package com.example.vote_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    private Button votefm;
    private Button vfmback;
    public int scoreFirst ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        votefm= findViewById(R.id.votefm );
        SharedPreferences sharedPreferences = getSharedPreferences("scoreFirst", MODE_PRIVATE);
        votefm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                scoreFirst++;
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("scoreFirst", scoreFirst);
                editor.apply();
                System.out.println(scoreFirst);
                startActivity(new Intent (MainActivity4.this, pop.class));
            }
        });
        vfmback= findViewById(R.id.vfmback );
        vfmback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.vote_app.MainActivity4.this, MainActivity3.class);
                startActivity(intent);
            }
        });

    }

}