package com.example.kt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GridActivity extends AppCompatActivity implements View.OnClickListener {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
    }

    private void open(String value){
        intent = new Intent(GridActivity.this, DetailActivity.class);
        intent.putExtra("value", value);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView:
                open("1");
                break;
            case R.id.imageView2:
                open("2");
                break;
            case R.id.imageView3:
                open("3");
                break;
            case R.id.imageView4:
                open("4");
                break;
            case R.id.imageView5:
                open("5");
                break;
            case R.id.imageView6:
                open("6");
                break;
            default:

                break;
        }
    }
}