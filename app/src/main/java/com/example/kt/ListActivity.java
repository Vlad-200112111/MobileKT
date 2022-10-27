package com.example.kt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity implements View.OnClickListener{
    private ListView listView;
    private String elImg = "1";
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView=(ListView) findViewById(R.id.ListView);

        final String[] resNames = new String[]{
                "Соц. сеть_1.png", "Соц. сеть_2.png","Соц. сеть_3.png","Соц. сеть_4.png","Соц. сеть_5.png", "Соц. сеть_6.png"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<> (this,
                android.R.layout.simple_list_item_1,resNames);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener (new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View itemClicked, int i, long l) {
                Toast toast = Toast.makeText(getApplicationContext(), ((TextView) itemClicked).getText(), Toast.LENGTH_SHORT);
                toast.setGravity(2, 10, 400);
                toast.show();
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();
                ImageView imageView = (ImageView) findViewById(R.id.imageButton);
                switch (strText) {
                    case "Соц. сеть_1.png":
                        elImg = String.valueOf('1');
                        imageView.setImageResource(R.drawable.g1);
                        break;
                    case "Соц. сеть_2.png":
                        elImg = String.valueOf('2');
                        imageView.setImageResource(R.drawable.g2);
                        break;
                    case "Соц. сеть_3.png":
                        elImg = String.valueOf('3');
                        imageView.setImageResource(R.drawable.g3);
                        break;
                    case "Соц. сеть_4.png":
                        elImg = String.valueOf('4');
                        imageView.setImageResource(R.drawable.g4);
                        break;
                    case "Соц. сеть_5.png":
                        elImg = String.valueOf('5');
                        imageView.setImageResource(R.drawable.g5);
                        break;
                    case "Соц. сеть_6.png":
                        elImg = String.valueOf('6');
                        imageView.setImageResource(R.drawable.g6);
                        break;
                }

            }


        });
    }

    public void toMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        intent = new Intent(ListActivity.this, DetailActivity.class);
        intent.putExtra("value", elImg);
        startActivity(intent);
    }
}