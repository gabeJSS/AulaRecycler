package com.example.aularecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <Produto> listaProdutos = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
    public void cadastroInicial(){
        Produto p1 = new Produto("Arroz", "Alimento",(float)7.99);
        Produto p2 = new Produto("Lentilha", "Alimento",(float)3.99);
        Produto p3 = new Produto("Geladeira", "Eletrodoméstico",(float)13325.85);
        Produto p4 = new Produto("Café", "Alimento",(float)8.99);
        Produto p5 = new Produto("Papel Higiênico", "Item de Higiene",(float)7.99);
        Produto p6 = new Produto("Pão", "Alimento",(float)3.99);
        Produto p7 = new Produto("Metal Gear Solid V", "Jogo de Videogame",(float)99.00);
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
        listaProdutos.add(p4);
        listaProdutos.add(p5);
        listaProdutos.add(p6);
        listaProdutos.add(p7);

    }
}