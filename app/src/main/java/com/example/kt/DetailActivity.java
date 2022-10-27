package com.example.kt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String value = intent.getStringExtra("value");
        ImageView image = findViewById(R.id.imageView7);
        switch (value) {
            case "1":
                image.setImageResource(R.drawable.g1);
                break;
            case "2":
                image.setImageResource(R.drawable.g2);
                break;
            case "3":
                image.setImageResource(R.drawable.g3);
                break;
            case "4":
                image.setImageResource(R.drawable.g4);
                break;
            case "5":
                image.setImageResource(R.drawable.g5);
                break;
            case "6":
                image.setImageResource(R.drawable.g6);
                break;
        };

    }

    public void toMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}