package com.example.einheitenrechner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class GeldUmrechnerActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geld_umrechner);

        Button btnUmrechnen = (Button) findViewById(R.id.btnUmrechnen);
        btnUmrechnen.setOnClickListener(this);

        Spinner WaehrungEingabe = findViewById(R.id.spnGeldEingabewährung);
        ArrayAdapter<CharSequence> EingabeAdapter = ArrayAdapter.createFromResource(this, R.array.Geldzeichen, android.R.layout.simple_spinner_dropdown_item);
        WaehrungEingabe.setAdapter(EingabeAdapter);
        WaehrungEingabe.setOnItemSelectedListener(this);

        Spinner WaehrungErgebnis = findViewById(R.id.spnGeldErgebnisWährung);
        ArrayAdapter<CharSequence> ErgbenisAdapter = ArrayAdapter.createFromResource(this, R.array.Geldzeichen, android.R.layout.simple_spinner_dropdown_item);
        WaehrungErgebnis.setAdapter(ErgbenisAdapter);
        WaehrungErgebnis.setOnItemSelectedListener(this);
    }


    @Override
    public void onClick(View v) {
        EditText GeldEingabe = (EditText) findViewById(R.id.editGeldEingabe);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}