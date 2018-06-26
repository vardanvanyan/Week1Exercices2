package com.example.vardan.mybro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity2 extends AppCompatActivity {

public  static  final String KEY = "key";
    private EditText aaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        aaa = findViewById(R.id.secondText);

        String str = getIntent().getExtras().getString(MainActivity.BANALI);
        aaa.setText(str);

        Button button1 = findViewById(R.id.but);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity2.this, MainActivity.class);
                intent.putExtra(KEY,aaa.getText().toString());
                startActivity(intent);
            }
        });
    }

}

