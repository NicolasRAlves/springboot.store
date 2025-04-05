package com.springboot.store.model;

public class Componente {
    public Long id;
    public String nome;
    public int consumo;
    public double  preco;

    public Componente(Long id, String nome, int consumo, double preco){
        this.id = id;
        this.nome = nome;
        this.consumo = consumo;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}