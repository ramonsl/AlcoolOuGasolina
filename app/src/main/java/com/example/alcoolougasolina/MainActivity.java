package com.example.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

 public    EditText edtGasolina;
  public   EditText edtAlcool;
  public   Button btnCalcular;
    public TextView txtMensagem;
  public   String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtAlcool = findViewById(R.id.edtValorAlcool);
        edtGasolina = findViewById(R.id.edtValorGasolina);
        btnCalcular = findViewById(R.id.btnCalc);
        txtMensagem = findViewById(R.id.txtMensagem);


        //51 - 981636027

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //    double valordoalcool =   Double.valueOf( edtAlcool.getText().toString());
              String msg= calcular(Double.valueOf( edtAlcool.getText().toString()),Double.valueOf( edtGasolina.getText().toString()));
              txtMensagem.setText(msg);
            }
        });




    }
    public String calcular(Double alcool, Double gasolina){
        Double valor = gasolina *0.7;
        if (valor>alcool){
            return  "Use Alcool";
        }else{
            return  "Use Gasolina";
        }
    }
}
