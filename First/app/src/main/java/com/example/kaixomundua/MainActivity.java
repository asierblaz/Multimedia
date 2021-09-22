package com.example.kaixomundua;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void lanzarMensaje(View view){
        Toast.makeText(this, "esto es una prueba", Toast.LENGTH_SHORT).show();

        Log.d("nirelog","hemen Nago");
    }
}