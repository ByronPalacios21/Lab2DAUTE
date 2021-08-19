package com.itca.lab2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
private Button btn1, btn2;

private TextView lblResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = findViewById(R.id.btnSaludar);
        btn2= findViewById(R.id.btnAbout);

        lblResultado =findViewById(R.id.lblres);

btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        lblResultado.setText("Has hecho click en boton Saludo");
        Toast.makeText(MainActivity2.this, "Has hecho click en boton Saludo", Toast.LENGTH_SHORT).show();
    }
});

       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               lblResultado.setText("Has Hecho click en boton Abaout");
               Toast.makeText(MainActivity2.this, "Has Hecho click en boton Abaout", Toast.LENGTH_SHORT).show();
           }
       });

}
}
