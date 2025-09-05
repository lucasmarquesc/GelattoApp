package com.unir.gelattoapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private RadioGroup radioGroup;
    private EditText editText;
    private Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        spinner = findViewById(R.id.spinner);
        radioGroup = findViewById(R.id.radioGroup);
        editText = findViewById(R.id.editTextNumber);
        btnFinalizar = findViewById(R.id.button);
        carregarTipos();
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tipo = spinner.getSelectedItem().toString();
                int id = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(id);
                String sabor = radioButton.getText().toString();
                String quantidade = editText.getText().toString();
                if (!quantidade.isEmpty()){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                    alerta.setTitle("Confirmação");
                    alerta.setIcon(R.mipmap.ic_launcher_ice_cream);
                    alerta.setMessage("Deseja finalizar?");
                    alerta.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(MainActivity.this, PedidoActivity.class);
                            intent.putExtra("tipo", tipo);
                            intent.putExtra("sabor", sabor);
                            intent.putExtra("quantidade", quantidade);
                            startActivity(intent);
                        }
                    });
                    alerta.setNegativeButton("Não", null);
                    alerta.create().show();
                }else{
                    Toast.makeText(MainActivity.this, "Informe a quantidade", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    private void carregarTipos(){
        String tipos[] = {"Cone", "Cone Duplo", "Picolé", "Sundae"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, tipos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}