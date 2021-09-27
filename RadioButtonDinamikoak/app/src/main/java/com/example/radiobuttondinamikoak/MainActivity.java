package com.example.radiobuttondinamikoak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button gehitu;
    private Button kendu;
    private RadioGroup radios;
    private int kont;
    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gehitu = (Button) findViewById(R.id.buttonAnadir);
        kendu = (Button) findViewById(R.id.buttonQuitar);
        radios = (RadioGroup) findViewById(R.id.rbGroup);
        msg= (TextView)findViewById(R.id.mensaje);
        kont = 1;
        gehitu.setOnClickListener(this::gehituRadio);
        kendu.setOnClickListener(this::removeRadio);

    }

    public void removeRadio(View v) {
        if(radios.getChildCount()<=0){
            msg.setText("Ez daude gehiago");
        }
        msg.setText("");

        radios.removeView(radios.getChildAt(0));


    }


    public void gehituRadio(View v) {
        msg.setText("");
        RadioButton rb = new RadioButton(this);
        rb.setText("Radio " + kont);
        kont++;
        radios.addView(rb);
        msg.setText(rb.getText()+" Gehitu da ");

        Toast.makeText(this, rb.getText()+" Gehitu da ", Toast.LENGTH_SHORT).show();

    }


}