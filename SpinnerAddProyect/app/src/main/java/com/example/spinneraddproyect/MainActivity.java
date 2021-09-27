package com.example.spinneraddproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pertsona> datuak = new ArrayList<>();
        datuak.add(new Pertsona("Asier",12));
        datuak.add(new Pertsona("Pablo",52));
        datuak.add(new Pertsona("Ane",35));

        ArrayAdapter<Pertsona> nireadapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,datuak);
        ((Spinner)findViewById(R.id.spinner)).setAdapter(nireadapter);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String datuakSartu= ((TextView)findViewById(R.id.editText)).getText().toString();
               datuak.add((new Pertsona(datuakSartu,13)));

            }
        });


        //((Spinner)((Spinner) findViewById(R.id.spinner)).setOnItemSelectedListener();
    }
}