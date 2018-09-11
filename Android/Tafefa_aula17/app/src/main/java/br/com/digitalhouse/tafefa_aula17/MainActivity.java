package br.com.digitalhouse.tafefa_aula17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText palavra1;
    private EditText palavra2;
    private Button btnConcatenar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        palavra1 = (EditText) findViewById(R.id.edittext_palavra1);
        palavra2 = (EditText) findViewById(R.id.edittext_palavra2);
        btnConcatenar = (Button) findViewById(R.id.btn_concatenar);


        btnConcatenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultado = palavra1.getText().toString() + palavra2.getText().toString();

                Toast.makeText(MainActivity.this, resultado, Toast.LENGTH_SHORT).show();

            }
        });



    }
}
