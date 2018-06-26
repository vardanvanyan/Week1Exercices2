package com.example.vardan.mybro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public  static  final String BANALI = "banali";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView textViewwww = findViewById(R.id.textView);
        final EditText editTextttt = findViewById(R.id.editText);
        final Button button = findViewById(R.id.searchButton);
try {


    String ssttrr = getIntent().getExtras().getString(Main2Activity2.KEY);
    editTextttt.setText(ssttrr);
} catch (NullPointerException e){
    editTextttt.getText();
}


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextttt.getText();
                Intent intent = new Intent(MainActivity.this, Main2Activity2.class);
                intent.putExtra(BANALI,editTextttt.getText().toString());
                startActivity(intent);


            }
        });
    }
}
