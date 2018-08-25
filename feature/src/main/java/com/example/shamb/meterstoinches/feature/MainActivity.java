package com.example.shamb.meterstoinches.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mmeter;
    private Button mbutton;
    private TextView mresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mmeter = (EditText) findViewById(R.id.meterid);
        mbutton = (Button) findViewById(R.id.convertid);
        mresult = (TextView) findViewById(R.id.resultid);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               double multipler = 39.37;
               double result = 0.0;
               double metervalue = Double.parseDouble(mmeter.getText().toString()) ;
               result = metervalue*multipler;
               mresult.setText(String.format("%.2f",result));





            }
        });
    }


}
