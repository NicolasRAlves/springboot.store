package com.springboot.store.model;

public class Ram extends Componente {
    private TipoMemoria tipoMemoria;
    private Socket socket;
    private int tamanhoGb;

    public Ram(Long id, String nome, int consumo, double preco, TipoMemoria tipoMemoria, int tamanhoGb) {
        super(id, nome, consumo, preco);
        this.tipoMemoria = tipoMemoria;
        this.tamanhoGb = tamanhoGb;
    }

    public TipoMemoria getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(TipoMemoria tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    public int getTamanhoGb() {
        return tamanhoGb;
    }

    public void setTamanhoGb(int tamanhoGb) {
        this.tamanhoGb = tamanhoGb;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
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