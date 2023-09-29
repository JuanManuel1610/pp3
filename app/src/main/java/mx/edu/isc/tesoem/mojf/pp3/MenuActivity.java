package mx.edu.isc.tesoem.mojf.pp3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {


    Button btnsumanump2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnsumanump2 = findViewById(R.id.p2btnsuma);
        btnsumanump2.setOnClickListener(view -> {
            Intent lanza = new Intent(MenuActivity.this, Suma2numActivity.class);
            startActivity(lanza);
        });



    }
}