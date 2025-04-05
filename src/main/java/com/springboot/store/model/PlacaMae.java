package com.springboot.store.model;

public class PlacaMae{

    private TipoMemoria tipoMemoria;
    private Socket socket;

    private Long id;
    private String nome;
    private int consumo;
    private double preco;

    public PlacaMae(Long id, String nome, int consumo, double preco, Socket socket, TipoMemoria tipoMemoria) {
        this.socket = socket;
        this.tipoMemoria = tipoMemoria;

        this.id = id;
        this.consumo = consumo;
        this.nome = nome;
        this.preco = preco;
    }

    boolean compativel(Cpu cpu){
        return cpu.getSocket().equals(this.getSocket());
    }

    boolean compativel(Ram ram){
        return ram.getTipoMemoria().equals(this.getTipoMemoria());
    }

    public TipoMemoria getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(TipoMemoria tipo) {
        this.tipoMemoria = tipoMemoria;
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

}