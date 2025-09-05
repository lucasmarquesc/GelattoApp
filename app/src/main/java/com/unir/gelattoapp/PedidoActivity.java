package com.unir.gelattoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PedidoActivity extends AppCompatActivity {

    private TextView txtPedido;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pedido);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        txtPedido = findViewById(R.id.txtPedido);
        btnVoltar = findViewById(R.id.btnVoltar);
        String tipo = intent.getStringExtra("tipo");
        String sabor = intent.getStringExtra("sabor");
        String quantidade = intent.getStringExtra("quantidade");
        int quantidadeInt = Integer.parseInt(quantidade);
        double valor = 0.0;
        if (tipo.equals("Cone")) {
            valor = quantidadeInt * 2.50;
        }else if (tipo.equals("Cone Duplo")) {
            valor = quantidadeInt * 3.50;
        }else if (tipo.equals("Picolé")) {
            valor = quantidadeInt * 3.00;
        }else if (tipo.equals("Sundae")) {
            valor = quantidadeInt * 4.00;
        }
        StringBuilder resultado = new StringBuilder("Seu pedido: ");
        resultado.append("\n\n");
        resultado.append("Tipo: " + tipo).append("\n");
        resultado.append("Sabor: " + sabor).append("\n");
        resultado.append("Quantidade: " + quantidade).append("\n");
        resultado.append("Valor: R$ " + String.format("%.2f", valor));
        txtPedido.setText(resultado.toString());
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
    }
}