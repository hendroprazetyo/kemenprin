package id.go.kemenprin.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText text_panjang, text_lebar;
    private TextView text_luas;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_panjang = (EditText) findViewById(R.id.text_panjang);
        text_lebar = (EditText) findViewById(R.id.text_lebar);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        text_luas = (TextView) findViewById(R.id.text_luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang = text_panjang.getText().toString().trim();
                String lebar = text_lebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);
                double luas = p*l;

                text_luas.setText("Luas:" + luas);
            }
        });
    }

}
