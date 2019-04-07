package com.example.teddybear.calculadorav2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 = (EditText) findViewById(R.id.editText_Numero1);
        numero2 = (EditText) findViewById(R.id.editText_Numero2);
        resultado = (TextView) findViewById(R.id.textView_Resultado);
    }

    public void sumaOnclick(View view){

            float N1 = Float.parseFloat(numero1.getText().toString());
            float N2 = Float.parseFloat(numero2.getText().toString());
            float R = N1+N2;
            System.out.println("Resultado: "+R);
            String result = "Resultado: "+R;
            resultado.setText(result);

    }

    public void restaOnclick(View view){

            float N1 = Float.parseFloat(numero1.getText().toString());
            float N2 = Float.parseFloat(numero2.getText().toString());
            float R = N1-N2;
            System.out.println("Resultado: "+R);
            String result = "Resultado: "+R;
            resultado.setText(result);

    }

    public void divisionOnclick(View view){

            float N1 = Float.parseFloat(numero1.getText().toString());
            float N2 = Float.parseFloat(numero2.getText().toString());
            float R = N1/N2;
            System.out.println("Resultado: "+R);
            String result = "Resultado: "+R;
            resultado.setText(result);

    }

    public void multiplicacionOnclick(View view){

            float N1 = Float.parseFloat(numero1.getText().toString());
            float N2 = Float.parseFloat(numero2.getText().toString());
            float R = N1*N2;
            System.out.println("Resultado: "+R);
            String result = "Resultado: "+R;
            resultado.setText(result);

    }

    public void moduloOnclick(View view){

            float N1 = Float.parseFloat(numero1.getText().toString());
            float N2 = Float.parseFloat(numero2.getText().toString());
            float R = N1%N2;
            System.out.println("Resultado: "+R);
            String result = "Resultado: "+R;
            resultado.setText(result);

    }
}
