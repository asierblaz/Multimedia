package com.unieibar.uni_27_test3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.unieibar.uni_27_test3.R;


public class MyActivity extends Activity {

    boolean llamando=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void Llamar(View v){
        TextView t=(TextView)findViewById(R.id.textView);
        ImageButton b=(ImageButton)findViewById(R.id.imageButton2);
        ImageView ww=(ImageView)findViewById(R.id.imageView);
        if(!llamando) {
            t.setText("llamando a Walter White...");
            ww.setImageResource(R.drawable.walterwhite2);
            b.setImageResource(R.drawable.colgar);
            llamando=true;
        }
        else{
            t.setText("llamanda terminada");
            ww.setImageResource(R.drawable.walterwhite);
            b.setImageResource(R.drawable.llamar);
            llamando=false;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
