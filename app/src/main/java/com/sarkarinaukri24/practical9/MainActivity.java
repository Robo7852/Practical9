package com.sarkarinaukri24.practical9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        txt = findViewById(R.id.txt);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.Courses, android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    txt.setText("Ms. Bhupinder Kaur Aneja");
                }
                else if(position == 1){
                    txt.setText("Ms. Vandana Kalra");
                }
                else if(position == 2){
                    txt.setText("Neha Saini");
                }
                else if(position == 3){
                    txt.setText("Manisha Rao");
                }
                else if(position == 4){
                    txt.setText("Dr Manjit kaur");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}