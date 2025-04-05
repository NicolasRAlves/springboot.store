package com.springboot.store.model;

public class Cpu {
    private Socket socket;
    private Long id;
    private String nome;
    private int consumo;
    private double  preco;

    public Cpu(Long id, String nome, int consumo, double preco, Socket socket){
        this.socket = socket;
        this.id = id;
        this.consumo = consumo;
        this.nome = nome;
        this.preco = preco;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
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

    @Override
    public String toString(){
        return "CPU: " + getNome() + ", Socket: " + socket;
    }
}