package keilane.com.contador;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends Activity {

    private Button soma;
    private Button subtrai;
    private Button zera;
    private TextView visor;
    private int operando;
    private int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preparacaoInicial();

    }

    private void preparacaoInicial() {
        soma = (Button) findViewById(R.id.soma);
        subtrai = (Button) findViewById(R.id.subtrai);
        zera = (Button) findViewById(R.id.zera);
        visor = (TextView) findViewById(R.id.visor);
    }


    public void contagem(View view) {
        operando = Integer.parseInt((visor.getText().toString()));
        switch (view.getId()){
            case R.id.soma:
                resultado = operando + 1;
                visor.setText(String.valueOf(resultado));
                visor.setBackgroundColor(Color.BLUE);
                break;
            case R.id.subtrai:
                resultado = operando - 1;
                visor.setText(String.valueOf(resultado));
                visor.setBackgroundColor(Color.RED);
                break;
            case R.id.zera:
                visor.setText("0");
                visor.setBackgroundColor(Color.GREEN);
                break;
        }
    }
}

