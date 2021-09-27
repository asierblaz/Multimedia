package com.example.zenbakilehenak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button boton;
    public EditText numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         boton = (Button) findViewById(R.id.button);
            numero= (EditText) findViewById(R.id.textNum);
         boton.setOnClickListener(this::clickButton);


    }

    public void clickButton(View v){

        int cual= Integer.parseInt((numero.getText()+""));

        int posicion = posiCual(cual);

        Toast.makeText(this, ""+posicion, Toast.LENGTH_SHORT).show();
        Log.d("resultado","Zenbakia: "+posicion);


    }

    public int posiCual (int cual){
        int cont=0;
        int i=1;
        int numero=0;
        while(cont!=cual){

            if(esPrimo(i)){
                cont++;
                numero=i;
            }
            i++;
        }

        return numero;
    }


    public boolean esPrimo(int num) {
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont == 2) { //si el 
            return true;
        } else return false;

    }
}