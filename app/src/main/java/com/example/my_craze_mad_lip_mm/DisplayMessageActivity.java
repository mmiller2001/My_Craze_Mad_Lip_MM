package com.example.my_craze_mad_lip_mm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String word1 = intent.getStringExtra("First_Word");
        TextView textView = findViewById(R.id.textView);
        textView.setText(word1);

        Intent intent2 = getIntent();
        String word2 = intent2.getStringExtra("Second_Word");
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(word2);

        Intent intent3 = getIntent();
        String word3 = intent3.getStringExtra("Third_Word");
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(word3);

        Intent intent4 = getIntent();
        String word4 = intent4.getStringExtra("Fourth_Word");
        TextView textView4 = findViewById(R.id.textView4);
        textView4.setText(word4);

        Intent intent5 = getIntent();
        String word5 = intent5.getStringExtra("Fifth_Word");
        TextView textView5 = findViewById(R.id.textView5);
        textView5.setText(word5);

        Intent intent6 = getIntent();
        String word6 = intent6.getStringExtra("Sixth_Word");
        TextView textView6 = findViewById(R.id.textView6);
        textView6.setText(word6);

        Intent intent7 = getIntent();
        String word7 = intent7.getStringExtra("Seventh_Word");
        TextView textView7 = findViewById(R.id.textView7);
        textView7.setText(word7);

        Intent intent8 = getIntent();
        String word8 = intent8.getStringExtra("Eighth_Word");
        TextView textView8 = findViewById(R.id.textView8);
        textView8.setText(word8);

        Intent intent9 = getIntent();
        String word9 = intent9.getStringExtra("Ninth_Word");
        TextView textView9 = findViewById(R.id.textView9);
        textView9.setText(word9);

        Intent intent10 = getIntent();
        String word10 = intent10.getStringExtra("Tenth_Word");
        TextView textView10 = findViewById(R.id.textView10);
        textView10.setText(word10);
    }
}

// Capture the layout's TextView and set the string as its text