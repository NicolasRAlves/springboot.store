package com.springboot.store.model;

public class Fonte {
    private TipoMemoria tipo;
    private Socket socket;
    private int  tamanhoGb;
    private int potencia;

    private Long id;
    private String nome;
    private int consumo;
    private double preco;

    public Fonte(Long id, String nome, int consumo, double preco, int potencia) {
        this.tipo = tipo;
        this.socket = socket;
        this.tamanhoGb = tamanhoGb;
        this.potencia = potencia;
        this.id = id;
        this.nome = nome;
        this.consumo = consumo;
        this.preco = preco;
    }

    public TipoMemoria getTipo() {
        return tipo;
    }

    public void setTipo(TipoMemoria tipo) {
        this.tipo = tipo;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public int getTamanhoGb() {
        return tamanhoGb;
    }

    public void setTamanhoGb(int tamanhoGb) {
        this.tamanhoGb = tamanhoGb;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
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

    public String toString(){
        return "Fonte: " + getNome() + ", Potência: " + potencia + "W";
    }

}