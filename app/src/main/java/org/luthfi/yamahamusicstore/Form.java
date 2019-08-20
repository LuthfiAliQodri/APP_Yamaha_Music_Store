package org.luthfi.yamahamusicstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class Form extends AppCompatActivity {

    Button bsimpan;
    EditText enama;
    RadioGroup ekurir;
    TextView thasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        bsimpan = (Button) findViewById(R.id.simpan);
        enama = (EditText) findViewById(R.id.isinama);
        ekurir = (RadioGroup) findViewById(R.id.kurir);
        thasil = (TextView) findViewById(R.id.hasil);

        bsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputnama = String.valueOf(enama.getText().toString());

                int kurir = ekurir.getCheckedRadioButtonId();
                RadioButton ekurir = (RadioButton) findViewById(kurir);
                String input = String.valueOf(ekurir.getText().toString());

                thasil.setText("\n" + "Nama\t\t: " + inputnama + "\n" +
                        "Kurir\t\t: " + kurir + "\n");

            }
        });



    }
}
