package com.escobedo.jees.test_app1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Test1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
    }

    public boolean onCreateOptionMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.test1, menu);
        return true;
    }

    public void calcular(View view) {
        EditText peso = (EditText) findViewById(R.id.etPeso);
        String stringPeso = peso.getText().toString();
        float valorPeso = Float.parseFloat(stringPeso);

        EditText altura = (EditText) findViewById(R.id.etAltura);
        String stringAltura = altura.getText().toString();
        float valorAltura = Float.parseFloat(stringAltura) / 100;

        float resultado = valorPeso / (valorAltura * valorAltura);

        TextView tuResultado = (TextView) findViewById(R.id.tuResultado);
        assert tuResultado != null;
        tuResultado.setText("Tu resultado es " + resultado + " de IMC");

    }
}
