package com.springboot.store.model;

public class Ram {
    private TipoMemoria tipoMemoria;
    private Socket socket;
    private int  tamanhoGb;


    private Long id;
    private String nome;
    private int consumo;
    private double preco;

    public Ram (long id, String nome, int consumo, double preco, TipoMemoria tipoMemoria, int tamanhoGb) {
        this.tamanhoGb = tamanhoGb;
        this.socket = socket;
        this.tipoMemoria = tipoMemoria;

        this.id = id;
        this.consumo = consumo;
        this.nome = nome;
        this.preco = preco;
    }

    public TipoMemoria getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(TipoMemoria tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
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

    public boolean compativel(Cpu cpu) {
        return this.socket == cpu.getSocket();
    }

    public boolean compativel(Ram ram) {
        return this.tipoMemoria == ram.getTipoMemoria();
    }

    public TipoMemoria getTipo() {
        return tipoMemoria;
    }

    @Override
    public String toString(){
        return "Placa Mãe: " + getNome() + ", Socket: " + socket + ", Tipo Memória: " + tipoMemoria;
    }
}