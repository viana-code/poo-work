/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementos;

/**
 *
 * @author vacin
 */

import usuarios.Aluno;

public class Mensagem {
    private Aluno enviadoPor; // Aluno que enviou a mensagem
    private String conteudo; // Conteúdo da mensagem
    private String data; // Data em que a mensagem foi enviada
    private String horario; // Horário em que a mensagem foi enviada

    // Construtor
    public Mensagem(Aluno enviadoPor, String conteudo, String data, String horario) {
        this.enviadoPor = enviadoPor;
        this.conteudo = conteudo;
        this.data = data;
        this.horario = horario;
    }

    // Métodos Getters e Setters
    public Aluno getEnviadoPor() {
        return enviadoPor;
    }

    public void setEnviadoPor(Aluno enviadoPor) {
        this.enviadoPor = enviadoPor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

