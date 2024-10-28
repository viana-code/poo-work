/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementos;

/**
 *
 * @author vacin
 */
import java.util.ArrayList;

import usuarios.Aluno;

public class Trabalho {
    private String tema; // Tema do trabalho
    private double pontosPossiveis; // Pontos possíveis a serem obtidos
    private double notaObtida; // Nota obtida pelo trabalho
    private ArrayList<Aluno> integrantes; // Lista de alunos integrantes do trabalho

    // Construtor
    public Trabalho(String tema, double pontosPossiveis, double notaObtida, ArrayList<Aluno> integrantes) {
        this.tema = tema;
        this.pontosPossiveis = pontosPossiveis;
        this.notaObtida = notaObtida;
        this.integrantes = integrantes;
    }
    public Trabalho(String tema, double pontosPossiveis, ArrayList<Aluno> integrantes) {
        this.tema = tema;
        this.pontosPossiveis = pontosPossiveis;
        this.integrantes = integrantes;
    }

    // Métodos Getters e Setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public double getNotaObtida() {
        return notaObtida;
    }

    public void setNotaObtida(double nota) {
        this.notaObtida = nota;
    }

    public ArrayList<Aluno> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Aluno> integrantes) {
        this.integrantes = integrantes;
    }

    public double getPontosPossiveis() {
        return pontosPossiveis;
    }

    public void setPontosPossiveis(double pontosPossiveis) {
        this.pontosPossiveis = pontosPossiveis;
    }
    public static Trabalho criarTrabalho(String tema, double pontosPossiveis, ArrayList<Aluno> integrantes) {
        return new Trabalho(tema, pontosPossiveis, integrantes);
    }
    public void darPiroca(double pontos) {
        if (pontos >= 0 && pontos <= this.pontosPossiveis) {
            this.notaObtida = pontos;
        } else {
            System.out.println("A nota deve ser entre 0 e " + this.pontosPossiveis);
        }
    }
}
