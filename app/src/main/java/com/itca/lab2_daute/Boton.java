package com.itca.lab2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Boton extends AppCompatActivity {
private EditText et1,et2;
private TextView tv3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton);

et1= (EditText)findViewById(R.id.et1);
et2= (EditText)findViewById(R.id.et2);
tv3= (TextView)findViewById(R.id.tv3);


    }

    @Override
   public boolean onCreateOptionsMenu (Menu menu){
getMenuInflater().inflate(R.menu.menu_main, menu);
return true;
    }
        @Override
        public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.action_Pantalla1) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
    public void Operar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nro1 =Integer.parseInt(valor1);
        int nro2 =Integer.parseInt(valor2);
        int suma=nro1+nro2;
        String resu=String.valueOf(suma);
        tv3.setText(resu);
    }

}