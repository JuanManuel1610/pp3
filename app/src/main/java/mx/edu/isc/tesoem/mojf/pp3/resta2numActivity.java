package mx.edu.isc.tesoem.mojf.pp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class resta2numActivity extends AppCompatActivity {

    EditText resta1, resta2;
    TextView lblresta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta2num);

        resta1 = findViewById(R.id.txtnum1p4);
        resta2 = findViewById(R.id.txtnum2p4);
        lblresta = findViewById(R.id.lblrestap3);
    }

    public void calcular (View v){

        int num3 = Integer.parseInt(resta1.getText().toString());
        int num4 = Integer.parseInt(resta2.getText().toString());

        lblresta.setText(String.valueOf(num3 - num4));
    }
}