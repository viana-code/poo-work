/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementos;

/**
 *
 * @author vacin
 */
public class Prova {
    private String nomeAluno; // Nome do aluno que fez a prova
    private String data; // Data da prova
    private int nota; // Nota obtida na prova
    private boolean vista; // Indica se a prova foi vista pelo aluno

    // Construtor
    public Prova(String nomeAluno, String data, int nota, boolean vista) {
        this.nomeAluno = nomeAluno;
        this.data = data;
        this.nota = nota;
        this.vista = vista;
    }

    // Métodos Getters e Setters
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public boolean isVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }
}

