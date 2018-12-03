package id.go.kemenprin.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button btn_lingkaran, btn_persegi, btn_persegi_panjang, btn_segitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_lingkaran = (Button) findViewById(R.id.btn_lingkaran);
        btn_persegi = (Button) findViewById(R.id.btn_persegi);
        btn_persegi_panjang = (Button) findViewById(R.id.btn_persegi_panjang);
        btn_segitiga = (Button) findViewById(R.id.btn_segitiga);

        btn_lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_persegi_panjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
