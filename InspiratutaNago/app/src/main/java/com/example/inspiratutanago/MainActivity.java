package com.example.inspiratutanago;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button boton;
    private TextView zenbakia;
    private RadioGroup radio;
    private RadioButton selected;
    private Button boton1;
    private Button boton2;
    private TextView texto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.id_bot1);
        zenbakia = (TextView) findViewById(R.id.id_tvzki);
        radio = (RadioGroup) findViewById(R.id.id_rg1);


        boton.setOnClickListener(this::gehitu);
        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
               selected= (RadioButton)findViewById(radioGroup.getCheckedRadioButtonId());
            }
        });

        ((Switch)findViewById(R.id.id_sw)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Log.d("a","Botoiaren egoera"+String.valueOf(b));
            }
        });

        boton1 = (Button) findViewById(R.id.boton1);
        boton2 = (Button) findViewById(R.id.boton2);
        texto1 = (TextView) findViewById(R.id.texto1);

        boton1.setOnClickListener(this::cambiarValorBot2);
        boton2.setOnClickListener(this::cambiarValorBot1);
    }

    public void gehitu(View view) {

        int num2= Integer.parseInt(selected.getText()+"");
        int num = Integer.parseInt((zenbakia.getText() + "")) + num2;
        zenbakia.setText(num + "");

        if (num == 50) {
            Toast.makeText(this, "Vas rapido", Toast.LENGTH_SHORT).show();
        }

    }

    public void cambiarValorBot2(View view){
        boton2.setText(texto1.getText());
        Toast.makeText(this, "Aldatuta", Toast.LENGTH_SHORT).show();


    }
    public void cambiarValorBot1(View view){
    boton2.setText("Boton 2");
        Toast.makeText(this, "Reset", Toast.LENGTH_SHORT).show();

    }


}