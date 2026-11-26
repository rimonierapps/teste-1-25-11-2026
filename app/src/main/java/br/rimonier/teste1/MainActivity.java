package br.rimonier.teste1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String data = new SimpleDateFormat("dd/MM/yyyy HH:mm", new Locale("pt", "BR"))
                .format(new Date());

        TextView texto = new TextView(this);
        texto.setText("Olá, Ricardo\n\nTeste 1 v1.0\n" + data);
        texto.setTextSize(28f);
        texto.setGravity(Gravity.CENTER);
        setContentView(texto);
    }
}
