package com.example.listadocomida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import com.example.listadocomida.databinding.ActivityMainBinding;
import com.example.listadocomida.databinding.ActivitySecondBinding;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ActivitySecondBinding binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> listaMenu = new ArrayList<>();

        listaMenu.add("Puré de calabacín");
        listaMenu.add("Tortilla de patatas");
        listaMenu.add("Albóndigas de pollo");
        listaMenu.add("Ensalada de tomate");
        listaMenu.add("Leche, pan con aceite y fruta");
        listaMenu.add("Lentejas vegetales");
        listaMenu.add("Croquetas de atún");
        listaMenu.add("Menestra de verduras");
        listaMenu.add("Sardinas al horno");
        listaMenu.add("Leche, pan con aceite y fruta");
        listaMenu.add("Macarrones con verduras");
        listaMenu.add("Pollo a la cerveza");
        listaMenu.add("Sopa juliana");
        listaMenu.add("Corvina al ajillo");
        listaMenu.add("Leche, pan con aceite y fruta");
        listaMenu.add("Leche, pan con aceite y fruta");

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listaMenu);
        binding.ListaView.setAdapter(adapter);

    }
}