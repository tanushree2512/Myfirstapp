package com.example.iteradmin.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tx;
Button bt;
Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx = findViewById(R.id.tanush);
        bt = (Button) findViewById(R.id.tanush);

        bt2 = (Button) findViewById(R.id.tanushree);
        bt.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                tx.setText(R.string.new_second);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"message....", Toast.LENGTH_LONG).show();
            }
        });


    }
}
