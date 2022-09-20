package com.example.my_craze_mad_lip_mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.First_Word);
        EditText editText2 = (EditText) findViewById(R.id.Second_Word);
        EditText editText3 = (EditText) findViewById(R.id.Third_Word);
        EditText editText4 = (EditText) findViewById(R.id.Fourth_Word);
        EditText editText5 = (EditText) findViewById(R.id.Fifth_Word);
        EditText editText6 = (EditText) findViewById(R.id.Sixth_Word);
        EditText editText7 = (EditText) findViewById(R.id.Seventh_Word);
        EditText editText8 = (EditText) findViewById(R.id.Eighth_Word);
        EditText editText9 = (EditText) findViewById(R.id.Ninth_Word);
        EditText editText10 = (EditText) findViewById(R.id.Tenth_Word);

        String message = editText.getText().toString();
        String message2 = editText2.getText().toString();
        String message3 = editText3.getText().toString();
        String message4 = editText4.getText().toString();
        String message5 = editText5.getText().toString();
        String message6 = editText6.getText().toString();
        String message7 = editText7.getText().toString();
        String message8 = editText8.getText().toString();
        String message9 = editText9.getText().toString();
        String message10 = editText10.getText().toString();


        intent.putExtra("First_Word", message);
        intent.putExtra("Second_Word", message2);
        intent.putExtra("Third_Word", message3);
        intent.putExtra("Fourth_Word", message4);
        intent.putExtra("Fifth_Word", message5);
        intent.putExtra("Sixth_Word", message6);
        intent.putExtra("Seventh_Word", message7);
        intent.putExtra("Eighth_Word", message8);
        intent.putExtra("Ninth_Word", message9);
        intent.putExtra("Tenth_Word", message10);

        startActivity(intent);
    }
}