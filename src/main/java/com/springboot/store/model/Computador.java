package com.springboot.store.model;

public class Computador {
    private PlacaMae placaMae;
    private Cpu cpu;
    private Ram ram;
    private Fonte fonte;

    public Computador(PlacaMae placaMae, Cpu cpu, Ram ram, Fonte fonte) {
        this.placaMae = placaMae;
        this.cpu = cpu;
        this.ram = ram;
        this.fonte = fonte;
    }

    public Computador(){}

    public String status() {
        if (placaMae == null || cpu == null || ram == null || fonte == null) {
            return "Computador incompleto";
        }

        if (!placaMae.compativel(cpu)) {
            return "Incompatibilidade entre CPU e Placa Mãe";
        }

        if (!placaMae.compativel(ram)) {
            return "Incompatibilidade entre RAM e Placa Mãe";
        }

        int consumoTotal = placaMae.getConsumo() + cpu.getConsumo() + ram.getConsumo();
        if (consumoTotal > fonte.getPotencia()) {
            return "Fonte insuficiente para o sistema";
        }

        return "Computador completo e funcionando";
    }


    public double precoTotal() {
        double total = 0;
        if (placaMae != null) total += placaMae.getPreco();
        if (cpu != null) total += cpu.getPreco();
        if (ram != null) total += ram.getPreco();
        if (fonte != null) total += fonte.getPreco();
        return total;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Fonte getFonte() {
        return fonte;
    }

    public void setFonte(Fonte fonte) {
        this.fonte = fonte;
    }

    @Override
    public String toString(){
        return "Computador: \n" +
                "Placa Mãe: " + (placaMae == null ? "Não instalado" : placaMae.getNome()) +"\n" +
                "CPU: " + (cpu == null ? "Não instalado" : cpu.getNome()) + "\n" +
                "RAM: " + (ram == null ? "Não instalado" : ram.getNome()) + "\n" +
                "Fonte: " + (fonte == null ? "Não instalado" : fonte.getNome());

    }
}
