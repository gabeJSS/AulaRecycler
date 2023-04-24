package com.example.aularecycler;

public class Produto {
    String nome, tipo;
    float preco;

    public Produto(String nome, String tipo, float preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
}
