package com.silvio.eventoapp.modells;

public class Evento {

    private String nome;
    private String local;
    private String data;
    private String horario;

    public String getData() {
        return data;
    }
    public String getHorario() {
        return horario;
    }
    public String getLocal() {
        return local;
    }
    public String getNome() {
        return nome;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}