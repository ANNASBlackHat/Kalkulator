package com.example.annasblackhat.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText angka1;
    EditText angka2;
    Button tambah;
    Button kurang;
    Button bagi;
    Button kali;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1 = (EditText) findViewById(R.id.angka1);
        angka2 = (EditText) findViewById(R.id.angka2);
        tambah = (Button) findViewById(R.id.btn_tambah);
        bagi = (Button) findViewById(R.id.btn_bagi);
        kali = (Button) findViewById(R.id.btn_kali);
        kurang = (Button) findViewById(R.id.btn_kurang);
        hasil = (TextView) findViewById(R.id.txt_hasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(angka1.getText().toString().isEmpty() || angka2.getText().toString().isEmpty())){
                    int a1 = Integer.parseInt(angka1.getText().toString());
                    int a2 = Integer.parseInt(angka2.getText().toString());
                    int hsl = a1+a2;
                    hasil.setText(String.valueOf(hsl));
                }else{
                    Toast.makeText(MainActivity.this,"Lengkapi data dulu!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(angka1.getText().toString().isEmpty() || angka2.getText().toString().isEmpty())){
                    double a1 = Double.parseDouble(angka1.getText().toString());
                    double a2 = Double.parseDouble(angka2.getText().toString());
                    double hsl = a1/a2;
                    hasil.setText(String.valueOf(hsl));
                }else{
                    Toast.makeText(MainActivity.this,"Lengkapi data dulu!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        tambah.setOnClickListener(this);

    }

    public void operasiHitung(View v){
        switch (v.getId()){
            case R.id.btn_bagi:

                break;
            case R.id.btn_kali :

                break;
        }
    }

    @Override
    public void onClick(View v) {

    }
}
